package ie.tcd.ase.controller;

import com.alibaba.fastjson.JSON;
import ie.tcd.ase.dao.ResultData;
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
        logger.info("schedule info: ", schedule.toString());

        scheduleService.save(schedule);
        logger.info("Save schedule information successfully");
        ResultData result = new ResultData();
        result.setStatus("sucuess");
        result.setData("ok");
        return JSON.toJSONString("ok");
    }


    @RequestMapping(value = "/schedules", method = RequestMethod.GET)
    @ResponseBody
    public String schedules(@RequestParam("userId") int userId) {
        List<Schedule> schedules = scheduleService.getScheduleList(userId);
        ResultData result = new ResultData();
        result.setStatus("sucuess");
        result.setData(schedules);
        return JSON.toJSONString(schedules);
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ResponseBody
    public String users(@RequestParam("scheduleId") int scheduleId) {
        List<UserInfo> userInfos = new ArrayList<>();
        userInfos = scheduleService.getUsersBySchedule(scheduleId);

        ResultData result = new ResultData();
        result.setStatus("sucuess");
        result.setData(userInfos);
        return JSON.toJSONString(result);
    }



}
