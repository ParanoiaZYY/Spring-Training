package site.paranoia.service;


import site.paranoia.domain.SUser;

import java.util.List;

public interface UserService {
    int insertUsers();
    List<SUser> selectAllUsers();
}
