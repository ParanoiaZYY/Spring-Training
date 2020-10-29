package site.paranoia.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author heshouyou
 * @since 2019-01-13
 */
@Data
public class AccountDTO implements Serializable {

    private Integer id;
    private String userId;
    private Double amount;
}
