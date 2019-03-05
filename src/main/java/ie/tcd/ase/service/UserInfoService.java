package ie.tcd.ase.service;

import ie.tcd.ase.entity.UserInfo;

public interface UserInfoService {

    /**
     * For sign in. Insert the user's information into the database.
     * @param userInfo user's information.
     * @return The number of records that are inserted into the database.
     */
    int insertUserInfo(UserInfo userInfo);

    /**
     * For the profile page. Select the user's profile from the database.
     * @param id The unique op the user.
     * @return User's information
     */
    UserInfo selectByUserId(int id);

}
