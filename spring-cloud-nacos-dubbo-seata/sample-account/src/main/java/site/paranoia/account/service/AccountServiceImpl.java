package site.paranoia.account.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import site.paranoia.account.mapper.AccountMapper;
import site.paranoia.api.ChargeService;

@DubboService
public class AccountServiceImpl implements ChargeService {

    @Autowired
    AccountMapper accountMapper;

    @Override
    public int insertCharge() {
        return 0;
    }
}
