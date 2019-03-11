package ie.tcd.ase.controller;

import ie.tcd.ase.entity.UserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserInfoController {

    private Logger logger = LoggerFactory.getLogger(UserInfoController.class);

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @ResponseBody
    public String add(@RequestBody UserInfo info) {
        logger.info(info.getUserName());
        return "ok";
    }
}
