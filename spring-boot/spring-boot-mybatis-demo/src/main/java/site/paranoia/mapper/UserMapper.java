package site.paranoia.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import site.paranoia.domain.User;

import java.util.List;

@Mapper
public interface UserMapper {

    @Insert("INSERT INTO USER(name, age, email) values (#{user.name}, #{user.age}, #{user.email})")
    void insertUser(@Param("name") User user);

    User selectById(@Param("id") Integer id);

    List<User> selectAllUser();
}
