package site.paranoia.account.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import site.paranoia.account.domain.Account;
import site.paranoia.account.mapper.AccountMapper;
import site.paranoia.api.AccountService;

import java.math.BigDecimal;

@DubboService
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService {

    @Autowired
    AccountMapper accountMapper;

    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
    @Override
    public int insertAccount() {
        var account = new Account();
        account.setUserId(1);
        account.setOrderId("A001");
        account.setAmount(BigDecimal.ONE);
        var num = accountMapper.insert(account);

        if (num != 1) {
            throw new RuntimeException();
        }
        return 0;
    }
}
