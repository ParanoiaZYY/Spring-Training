package site.paranoia.account.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
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
        var query = new LambdaQueryWrapper<Account>()
                .eq(Account::getUserId, 1)
                .eq(Account::getId, 9);
        var account = accountMapper.selectOne(query);

        var accountUpdate = new Account();
        accountUpdate.setAmount(account.getAmount() + 1);
        accountMapper.update(accountUpdate, query);
        return 0;
    }
}
