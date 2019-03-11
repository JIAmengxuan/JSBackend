package ie.tcd.ase.service.impl;

import ie.tcd.ase.dao.LoginInfoMapper;
import ie.tcd.ase.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginInfoMapper loginInfoMapper;

    @Override
    public boolean checkUser(String phoneNum, String password) {
        return false;
    }
}
