package site.paranoia.service;

import org.springframework.beans.factory.annotation.Autowired;
import site.paranoia.domain.Charge;
import site.paranoia.mapper.ChargeMapper;

public class ChargeServiceImpl {

    @Autowired
    ChargeMapper chargeMapper;

    public void addUser() {
        Charge charge = new Charge();
    }
}
