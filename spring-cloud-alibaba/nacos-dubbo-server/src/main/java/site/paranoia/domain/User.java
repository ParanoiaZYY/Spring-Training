package site.paranoia.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Table(name = "s_user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String passWord;

    @Column(name = "real_name")
    private String realName;

    /**
     * 创建人
     */
    @Column(name = "created_by")
    private Integer createdBy;

    /**
     * 创建时间
     */
    @Column(name = "created_time")
    private Date createdTime;

    /**
     * 最后修改人
     */
    @Column(name = "last_modified_by")
    private Integer lastModifiedBy;

    /**
     * 最后修改时间
     */
    @Column(name = "last_modified_time")
    private Date lastModifiedTime;

    /**
     * 逻辑删除标记
     */
    @Column(name = "delete_flag")
    private Integer deleteFlag;
}
