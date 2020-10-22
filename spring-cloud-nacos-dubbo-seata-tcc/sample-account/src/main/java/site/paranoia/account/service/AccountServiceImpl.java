package site.paranoia.account.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import site.paranoia.account.domain.Account;
import site.paranoia.account.mapper.AccountMapper;
import site.paranoia.api.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountMapper accountMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int insertAccount() {
        var query = new LambdaQueryWrapper<Account>()
                .eq(Account::getUserId, 1)
                .eq(Account::getId, 9);
        var account = accountMapper.selectOne(query);
        account.setAmount(account.getAmount() + 1);
        int num = accountMapper.update(account, query);
        if (num != 1) {
            throw new RuntimeException();
        }
        return 0;
    }
}
