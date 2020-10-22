package site.paranoia;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import site.paranoia.order.OrderApplication;
import site.paranoia.order.service.TccTransactionService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = OrderApplication.class)
public class SimpleTest {

    @Autowired
    TccTransactionService tccTransactionService;

    @Test
    public void insertOrder() {
        tccTransactionService.doTransactionCommit();
    }
}
