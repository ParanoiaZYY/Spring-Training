package site.paranoia.domain;

import lombok.Data;

import javax.persistence.*;

@Table(name = "db_config")
@Data
public class DatabaseConfig {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String url;
    private String username;
    private String password;

    @Column(name = "driver_name")
    private String driveName;
}
