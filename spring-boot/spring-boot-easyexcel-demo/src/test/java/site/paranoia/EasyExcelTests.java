package site.paranoia;

import com.alibaba.excel.EasyExcel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class EasyExcelTests {

    @Test
    public void test() {
        List<ExcelData> excelDataList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ExcelData excelData = new ExcelData();
            excelData.setCode("2000");
            excelData.setName("应收账款");
            excelData.setAmountReceivable(new BigDecimal(124555));
            excelData.setAmountPayable(new BigDecimal(121212));
            excelDataList.add(excelData);
        }
        String fileName = "/Users/paranoia/Desktop/" + "simpleWrite" + System.currentTimeMillis() + ".xlsx";
        EasyExcel.write(fileName, ExcelData.class).sheet("模板").doWrite(excelDataList);
    }

}
