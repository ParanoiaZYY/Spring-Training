package site.paranoia.order.action;

import io.seata.rm.tcc.api.BusinessActionContext;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import site.paranoia.ResultHolder;
import site.paranoia.action.TccActionTwo;
import site.paranoia.api.OrderService;

import java.util.List;

/**
 * The type Tcc action two.
 *
 * @author zhangsen
 */
@Service
@Slf4j
public class TccActionTwoImpl implements TccActionTwo {

    @Autowired
    OrderService orderService;

    @Transactional
    @Override
    public boolean prepare(BusinessActionContext actionContext, String b, List list) {
        final var xid = actionContext.getXid();
        log.info("prepare xid: {}", xid);
        var num = orderService.insertOrder();
        if (num > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean commit(BusinessActionContext actionContext) {
        String xid = actionContext.getXid();
        log.info("commit xid: {}", xid);
        ResultHolder.setActionTwoResult(xid, "T");
        return true;
    }

    @Override
    public boolean rollback(BusinessActionContext actionContext) {
        String xid = actionContext.getXid();
        log.info("rollback xid: {}", xid);
        orderService.deleteOrder(1);
        ResultHolder.setActionTwoResult(xid, "R");
        return true;
    }

}
