package site.paranoia.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.extern.apachecommons.CommonsLog;

@Data
@TableName("s_user")
public class User {

    @TableId
    private Integer id;

    @TableField("user_name")
    private String userName;

    @TableField("password")
    private String password;

    @TableField("real_name")
    private String realName;

    @TableField("created_by")
    private Integer createdBy;
}
