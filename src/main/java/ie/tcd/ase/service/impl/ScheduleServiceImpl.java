package ie.tcd.ase.service.impl;

import ie.tcd.ase.dao.ScheduleMapper;
import ie.tcd.ase.entity.Schedule;
import ie.tcd.ase.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ScheduleServiceImpl implements ScheduleService {

    @Autowired
    private ScheduleMapper scheduleMapper;

    @Override
    public int save(Schedule schedule) {
        return 0;
    }

    @Override
    public List<Schedule> getScheduleList(String phoneNum) {
        return null;
    }
}
