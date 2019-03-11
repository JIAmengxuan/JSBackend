package ie.tcd.ase.service.impl;

import ie.tcd.ase.dao.UserInfoMapper;
import ie.tcd.ase.entity.UserInfo;
import ie.tcd.ase.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public int insertUserInfo(UserInfo userInfo) {
        userInfoMapper.insert(userInfo);
        return 0;
    }

    @Override
    public UserInfo selectByUserId(int id) {
        UserInfo record = userInfoMapper.selectByPrimaryKey(id);
        return record;
    }
}