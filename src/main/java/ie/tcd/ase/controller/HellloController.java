package ie.tcd.ase.controller;

import com.alibaba.fastjson.JSON;
import ie.tcd.ase.dao.ResultData;
import ie.tcd.ase.entity.UserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.HashSet;

@Controller
@RequestMapping("/controller")
public class HellloController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String helloWorld(HttpServletResponse response) {
        logger.info("Entered hello world controller");
        HashSet set = new HashSet();
        set.add(1);
        Cookie cookie = new Cookie("cookie", "1238475757");
        response.addCookie(cookie);

        ResultData result = new ResultData();
        result.setStatus("success");
        UserInfo info = new UserInfo();
        info.setPhoneNumber(11111);
        info.setUserName("ddddd");
        result.setData(info);
        return JSON.toJSONString(result);
    }

}
