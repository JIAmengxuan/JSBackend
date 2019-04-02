package ie.tcd.ase.controller;

import com.alibaba.fastjson.JSON;
import ie.tcd.ase.dao.ResultData;
import ie.tcd.ase.entity.ScheduleExample;
import ie.tcd.ase.entity.UserInfo;
import ie.tcd.ase.entity.UserInfoExample;
import ie.tcd.ase.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/user")
public class UserInfoController {

    @Autowired
    UserInfoService userInfoService;

    private Logger logger = LoggerFactory.getLogger(UserInfoController.class);

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public String add(@RequestBody UserInfo info) {
        ResultData resultData = new ResultData();
        logger.info("user info is null :{}", info == null);
        if (info != null) {
            logger.info("user info: {}", JSON.toJSONString(info));
        }
        // check phone number
        UserInfo oldUser = userInfoService.selectByPhoneNum(info.getPhoneNumber());
        if (oldUser != null) {
            logger.info("repeatable data of user phone number");
            resultData.setStatus("fail");
            resultData.setData("repeated data");
            return JSON.toJSONString(resultData);
        }

        info.setCreateDate(new Date());
        info.setEmail(info.getPhoneNumber().toString());

        userInfoService.insertUserInfo(info);
        int userId = info.getId();
        logger.info("id:" + String.valueOf(userId));


        resultData.setStatus("success");
        resultData.setData(info);
        return JSON.toJSONString(resultData);
    }

    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo();
        DateFormat format = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String time = "2019-01-19 13:01:01";
        try {
            userInfo.setCreateDate(format.parse(time));
        } catch (ParseException e) {
            System.out.println(e);
        }
        System.out.println(JSON.toJSON(userInfo));
    }
}
