package site.paranoia.account.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import site.paranoia.account.domain.Account;
import site.paranoia.account.mapper.AccountMapper;
import site.paranoia.api.AccountService;
import site.paranoia.domain.AccountDTO;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountMapper accountMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int insertAccount(AccountDTO account) {
        Account accountInsert = new Account();
        accountInsert.setUserId(account.getUserId());
        accountInsert.setAmount(account.getAmount());
        int num = accountMapper.insert(accountInsert);
        if (num != 1) {
            throw new RuntimeException();
        }
        return num;
    }

    @Override
    public int deleteAccount(int id) {
        var num = accountMapper.deleteById(id);
        return num;
    }
}
