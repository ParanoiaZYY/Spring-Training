package site.paranoia;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;
import lombok.NonNull;

import java.math.BigDecimal;

/**
 * Created by Paranoia on 2019/9/10 人间不值得
 **/
@Data
public class ExcelData {
    @ExcelProperty("费种代码")
    private String code;
    @ExcelProperty("费种名称")
    private String name;
    @ExcelProperty("应收金额")
    private BigDecimal amountReceivable;
    @ExcelProperty("应付金额")
    private BigDecimal amountPayable;
}
