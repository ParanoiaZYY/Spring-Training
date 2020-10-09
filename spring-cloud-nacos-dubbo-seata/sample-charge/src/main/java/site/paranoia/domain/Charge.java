package site.paranoia.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.extern.apachecommons.CommonsLog;

@Data
@TableName("t_charge")
public class Charge {

    @TableId
    private Integer id;

    @TableField("order_no")
    private String orderNo;

    @TableField("charge_id")
    private String chargeId;
}
