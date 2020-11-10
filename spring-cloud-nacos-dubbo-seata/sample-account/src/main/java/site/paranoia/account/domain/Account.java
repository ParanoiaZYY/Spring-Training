package site.paranoia.account.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

/**
 * <p>
 * 
 * </p>
 *
 * @author heshouyou
 * @since 2019-01-13
 */
@Data
@TableName("t_account")
public class Account {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "user_id")
    private Integer userId;

    @TableField(value = "order_id")
    private String orderId;

    private BigDecimal amount;
}
