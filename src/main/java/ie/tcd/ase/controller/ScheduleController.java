package ie.tcd.ase.controller;

import com.alibaba.fastjson.JSON;
import ie.tcd.ase.dao.TripMapper;
import ie.tcd.ase.entity.*;
import ie.tcd.ase.service.ScheduleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/schedule")
public class ScheduleController {

    @Autowired
    ScheduleService scheduleService;

    @Autowired
    private TripMapper tripMapper;

    private Logger logger = LoggerFactory.getLogger(ScheduleController.class);

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public String add(@RequestBody Schedule schedule) {

        scheduleService.save(schedule);

        logger.info("Save schedule information successfully");

        return "ok";
    }


    @RequestMapping(value = "/schedules", method = RequestMethod.GET)
    @ResponseBody
    public String schedules(@RequestParam("userId") int userId) {
        List<Schedule> schedules = scheduleService.getScheduleList(userId);
        return JSON.toJSONString(schedules);
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ResponseBody
    public String users(@RequestParam("scheduleId") int scheduleId) {
        List<UserInfo> userInfos = new ArrayList<>();

        TripExample example = new TripExample();
        TripExample.Criteria criteria = example.createCriteria();
        criteria.andScheduleIdEqualTo(scheduleId);
        List<Trip> trips = tripMapper.selectByExample(example);

        int groupId = trips.get(0).getGroupId();
        TripExample example2 = new TripExample();
        TripExample.Criteria criteria2 = example2.createCriteria();
        List<Trip> trips2 = tripMapper.selectByExample(example);

        List<Integer> userIds = new ArrayList<>();
        for (int i = 0; i < trips2.size(); i++) {
            //userIds.add(trips2.get(i).getUserId());
        }

        UserInfoExample userInfoExample = new UserInfoExample();
        UserInfoExample.Criteria criteria3 = userInfoExample.createCriteria();


        return JSON.toJSONString(userInfos);
    }

}
