package ie.tcd.ase.service.impl;

import ie.tcd.ase.dao.ScheduleMapper;
import ie.tcd.ase.entity.Schedule;
import ie.tcd.ase.entity.ScheduleExample;
import ie.tcd.ase.entity.UserInfo;
import ie.tcd.ase.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {

    @Autowired
    private ScheduleMapper scheduleMapper;

    @Override
    public int save(Schedule schedule) {
        schedule.setCreateBy("SYS");
        schedule.setUpdateBy("SYS");
        schedule.setStatus(0);
        schedule.setWeekday(1);
        schedule.setCurrentServer("1");
        schedule.setStartDuration(new Date());
        schedule.setStartDuration2(new Date());
        schedule.setEndDuration(new Date());
        schedule.setEndDuration2(new Date());
        schedule.setCreateDate(new Date());
        schedule.setUpdateDate(new Date());
        return scheduleMapper.insert(schedule);
    }

    @Override
    public List<Schedule> getScheduleList(int userId) {
        ScheduleExample example = new ScheduleExample();
        ScheduleExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userId);

        return scheduleMapper.selectByExample(example);
    }

    @Override
    public List<UserInfo> getUsersBySchedule(int scheduleId) {
        List<UserInfo> userInfos =  scheduleMapper.selectByScheduleId(scheduleId);
        return userInfos;
    }


}
