package ie.tcd.ase.dao;

import ie.tcd.ase.entity.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/*.xml")
public class UserInfoMapperTest {

    @Autowired
    UserInfoMapper userInfoMapper;

    @Test
    public void insert() {
        System.out.println("enter test");
        UserInfo record = new UserInfo();
        record.setCreateDate(new Date());
        record.setUpdateDate(new Date());
        record.setGender("1");
        record.setEmail("1111@gmail.com");
        record.setPhoneNumber(993883838);
        record.setUserName("John");
        record.setCreateBy("sys");
        record.setUpdateBy("sys");
        userInfoMapper.insert(record);
    }


}