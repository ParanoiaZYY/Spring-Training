package site.paranoia;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "s_user")
public class SUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "pass_word")
    private String passWord;
    @Column(name = "real_name")
    private String realName;
    @Column(name = "mnemonic_code")
    private String mnemonicCode;
    @Column(name = "sex")
    private String sex;
    @Column(name = "created_by")
    private Integer createdBy;
    @Column(name = "created_time",updatable = false)
    private Date createdTime;
    @Column(name = "last_modified_by")
    private Integer lastModifiedBy;
    @Column(name = "last_modified_time")
    private Date lastModifiedTime;
}
