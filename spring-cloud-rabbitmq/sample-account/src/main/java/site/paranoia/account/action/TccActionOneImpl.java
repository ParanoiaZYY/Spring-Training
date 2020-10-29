package site.paranoia.account.action;

import io.seata.rm.tcc.api.BusinessActionContext;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;
import site.paranoia.ResultHolder;
import site.paranoia.action.TccActionOne;
import site.paranoia.api.AccountService;
import site.paranoia.domain.AccountDTO;

/**
 * The type Tcc action one.
 *
 * @author zhangsen
 */
@DubboService
@Slf4j
public class TccActionOneImpl implements TccActionOne {

    @Autowired
    AccountService accountService;

    @Autowired
    TransactionTemplate transactionTemplate;


    @Transactional
    @Override
    public boolean prepare(BusinessActionContext actionContext, AccountDTO accountDTO) {
        final var xid = actionContext.getXid();
        log.info("prepare xid: {}", xid);
        return true;

    }

    @Override
    public boolean commit(BusinessActionContext actionContext) {
        AccountDTO accountDTO = (AccountDTO) actionContext.getActionContext("accountDTO");
        String xid = actionContext.getXid();
        log.info("commit xid: {}", xid);
        ResultHolder.setActionOneResult(xid, "T");
        var num = accountService.insertAccount(accountDTO);
        log.info("insertAccount: {}", num);
        if (num > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean rollback(BusinessActionContext actionContext) {
        AccountDTO accountDTO = (AccountDTO) actionContext.getActionContext("accountDTO");
        String xid = actionContext.getXid();
        log.info("rollback xid: {}", xid);
        accountService.deleteAccount(accountDTO.getId());
        ResultHolder.setActionOneResult(xid, "R");
        return true;
    }
}
