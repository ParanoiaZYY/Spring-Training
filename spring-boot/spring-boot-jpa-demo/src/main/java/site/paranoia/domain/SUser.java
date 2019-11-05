package site.paranoia.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "s_user")
public class SUser extends BaseEntity{

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
}
