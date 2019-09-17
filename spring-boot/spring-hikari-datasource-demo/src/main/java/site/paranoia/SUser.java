package site.paranoia;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "s_user")
public class SUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
}
