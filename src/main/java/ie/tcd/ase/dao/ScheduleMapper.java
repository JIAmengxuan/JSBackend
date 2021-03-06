package ie.tcd.ase.dao;

import ie.tcd.ase.entity.Schedule;
import ie.tcd.ase.entity.ScheduleExample;
import java.util.List;

import ie.tcd.ase.entity.UserInfo;
import org.apache.ibatis.annotations.Param;

public interface ScheduleMapper {
    int countByExample(ScheduleExample example);

    int deleteByExample(ScheduleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Schedule record);

    int insertSelective(Schedule record);

    List<Schedule> selectByExample(ScheduleExample example);

    Schedule selectByPrimaryKey(Integer id);

    List<Schedule> selectByUserId(Integer userId);

    int updateByExampleSelective(@Param("record") Schedule record, @Param("example") ScheduleExample example);

    int updateByExample(@Param("record") Schedule record, @Param("example") ScheduleExample example);

    int updateByPrimaryKeySelective(Schedule record);

    int updateByPrimaryKey(Schedule record);

    List<UserInfo> selectByScheduleId(Integer scheduleId);
}