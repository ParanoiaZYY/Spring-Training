package site.paranoia.domain;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.HeadFontStyle;
import com.alibaba.excel.annotation.write.style.HeadStyle;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by Paranoia on 2019/9/10 人间不值得
 **/
@Data
@HeadFontStyle(fontHeightInPoints = 12)
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
