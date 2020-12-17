package site.paranoia.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import site.paranoia.domain.User;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {

    public List<User> selectUserList();

}
