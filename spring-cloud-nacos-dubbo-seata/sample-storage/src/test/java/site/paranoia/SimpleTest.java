package site.paranoia;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import site.paranoia.storage.StorageApplication;
import site.paranoia.storage.domain.Storage;
import site.paranoia.storage.mapper.StoprageMapper;

import java.util.List;
import java.util.UUID;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = StorageApplication.class)
public class SimpleTest {

    @Autowired
    StoprageMapper stoprageMapper;

    @Test
    public void insertOrder() {
        Storage storage = new Storage();
        storage.setOrderNo(UUID.randomUUID().toString());
        stoprageMapper.insert(storage);
    }

    @Test
    public void testSelect() {
        List<Storage> storageList = stoprageMapper.selectList(new QueryWrapper<>());
        storageList.forEach(System.out::println);
    }
}
