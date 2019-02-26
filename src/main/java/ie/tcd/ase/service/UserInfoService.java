package ie.tcd.ase.service;

import ie.tcd.ase.entity.UserInfo;

public interface UserInfoService {

    int insertUserInfo(UserInfo userInfo);

    UserInfo selectByUserId(int id);

}
