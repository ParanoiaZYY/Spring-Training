package site.paranoia.account.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import site.paranoia.account.domain.Account;
import site.paranoia.account.mapper.AccountMapper;
import site.paranoia.api.AccountService;

@DubboService
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountMapper accountMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int insertAccount() {
        Account account = new Account();
        account.setAmount(1d);
        account.setUserId("1");
        accountMapper.insert(account);
        return 0;
    }
}
