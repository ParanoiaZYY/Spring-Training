package site.paranoia.storage.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import site.paranoia.api.OrderService;
import site.paranoia.storage.mapper.StoprageMapper;

@DubboService
public class StorageServiceImpl implements OrderService {

    @Autowired
    StoprageMapper stoprageMapper;

    @Override
    public int insertOrder() {
        return 0;
    }
}
