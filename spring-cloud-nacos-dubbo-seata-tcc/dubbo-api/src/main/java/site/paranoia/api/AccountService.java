package site.paranoia.api;

import site.paranoia.domain.AccountDTO;

public interface AccountService {
    public int insertAccount(AccountDTO accountDTO);

    public int deleteAccount(int id);
}
