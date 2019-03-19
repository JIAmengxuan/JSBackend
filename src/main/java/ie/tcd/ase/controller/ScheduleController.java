package ie.tcd.ase.controller;

import ie.tcd.ase.entity.Schedule;
import ie.tcd.ase.entity.UserInfo;
import ie.tcd.ase.service.ScheduleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/schedule")
public class ScheduleController {

    @Autowired
    ScheduleService scheduleService;

    private Logger logger = LoggerFactory.getLogger(ScheduleController.class);

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public String add(@RequestBody Schedule schedule) {

        scheduleService.save(schedule);

        logger.info("Save schedule information successfully");

        return "ok";
    }



}
