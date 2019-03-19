package ie.tcd.ase.service.impl;

import ie.tcd.ase.dao.ScheduleMapper;
import ie.tcd.ase.dao.UserInfoMapper;
import ie.tcd.ase.entity.Schedule;
import ie.tcd.ase.entity.ScheduleExample;
import ie.tcd.ase.entity.UserInfo;
import ie.tcd.ase.entity.UserInfoExample;
import ie.tcd.ase.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MatchServiceImpl implements MatchService {

    @Autowired
    private ScheduleMapper scheduleMapper;
    @Autowired
    private UserInfoMapper userInfoMapper;


    @Override
    public List<UserInfo> travellers(Schedule schedule) {
        ScheduleExample example = new ScheduleExample();
        ScheduleExample.Criteria criteria = example.createCriteria();
        criteria.andStartDuration2LessThan(schedule.getStartDuration());
        criteria.andEndDuration2GreaterThan(schedule.getEndDuration());

        List<Schedule> schedules = scheduleMapper.selectByExample(example);
        List<Integer> userIds = new ArrayList<>();
        for (int i = 0; i < schedules.size(); i++) {
            userIds.add(schedules.get(i).getId());
        }

        UserInfoExample userInfoExample = new UserInfoExample();
        UserInfoExample.Criteria criteria1 = userInfoExample.createCriteria();
        criteria1.andIdIn(userIds);
        List<UserInfo> userInfos = new ArrayList<>();

        return userInfos;
    }
}
