package ie.tcd.ase.service;

import ie.tcd.ase.entity.Schedule;
import ie.tcd.ase.entity.UserInfo;

import java.util.List;

public interface MatchService {

    /**
     * For the match page. Receive the match results sent from the server end.
     * @param schedule The schedule used to match.
     * @return The list of matched person.
     */
    List<UserInfo> travellers(Schedule schedule);



}
