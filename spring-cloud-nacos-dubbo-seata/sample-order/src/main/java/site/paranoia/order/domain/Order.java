package site.paranoia.order.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

@Data
@TableName("t_order")
public class Order {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "order_no")
    private String orderNo;

    @TableField(value = "user_id")
    private String userId;

    private BigDecimal amount;

}
