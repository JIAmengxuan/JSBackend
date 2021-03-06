package ie.tcd.ase.service;

import ie.tcd.ase.entity.Schedule;
import ie.tcd.ase.entity.UserInfo;

import java.util.List;

public interface ScheduleService {

    /**
     * For schedule page. When user press the 'schedule' button, the schedule information will be saved into the server.
     * @param schedule Schedule information
     * @return The number of records that are inserted into the database.
     */
    int save(Schedule schedule);

    /**
     * For the commute page. Get the schedule history from the database.
     * @param userId The unique phone number of the user.
     * @return The list of schedule history.
     */
    List<Schedule> getScheduleList(int userId);

    List<UserInfo> getUsersBySchedule(int scheduleId);
}
