package site.paranoia.domain;


import lombok.Data;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

@Data
public class SUser implements RowMapper<SUser> {
    private Integer id;
    private String name;
    private Integer age;

    @Override
    public SUser mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        SUser sUser = new SUser();
        sUser.setId(resultSet.getInt("id"));
        sUser.setName(resultSet.getString("name"));
        sUser.setAge(resultSet.getInt("age"));
        return sUser;
    }
}
