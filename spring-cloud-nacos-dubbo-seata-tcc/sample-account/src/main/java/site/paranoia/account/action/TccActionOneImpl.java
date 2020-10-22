package site.paranoia.account.action;

import io.seata.rm.tcc.api.BusinessActionContext;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;
import site.paranoia.ResultHolder;
import site.paranoia.action.TccActionOne;
import site.paranoia.api.AccountService;

/**
 * The type Tcc action one.
 *
 * @author zhangsen
 */
@DubboService
public class TccActionOneImpl implements TccActionOne {

    @Autowired
    AccountService accountService;

    @Autowired
    TransactionTemplate transactionTemplate;


    @Transactional
    @Override
    public boolean prepare(BusinessActionContext actionContext, int a) {
        final var xid = actionContext.getXid();
        accountService.insertAccount();
        return true;
    }

    @Override
    public boolean commit(BusinessActionContext actionContext) {
        String xid = actionContext.getXid();
        ResultHolder.setActionOneResult(xid, "T");
        return true;
    }

    @Override
    public boolean rollback(BusinessActionContext actionContext) {
        String xid = actionContext.getXid();
        ResultHolder.setActionOneResult(xid, "R");
        return true;
    }
}
