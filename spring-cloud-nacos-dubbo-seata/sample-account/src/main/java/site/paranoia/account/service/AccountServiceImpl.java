package site.paranoia.account.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import site.paranoia.account.domain.Account;
import site.paranoia.account.mapper.AccountMapper;
import site.paranoia.api.AccountService;

@DubboService
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountMapper accountMapper;

    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
    @Override
    public int insertAccount() {
        var account = accountMapper.selectById(9);
        account.setAmount(account.getAmount() + 1);
        accountMapper.updateById(account);
        return 0;
    }
}
