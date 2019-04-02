package ie.tcd.ase.service.impl;

import ie.tcd.ase.controller.UserInfoController;
import ie.tcd.ase.dao.UserInfoMapper;
import ie.tcd.ase.entity.UserInfo;
import ie.tcd.ase.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public int insertUserInfo(UserInfo userInfo) {
        userInfo.setUserName(String.valueOf(userInfo.getPhoneNumber()));
        return userInfoMapper.insert(userInfo);
    }

    @Override
    public UserInfo selectByUserId(int id) {
        return userInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public UserInfo selectByPhoneNum(int phoneNumber) {
        return userInfoMapper.selectByPhoneNum(phoneNumber);
    }
}
