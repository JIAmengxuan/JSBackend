package ie.tcd.ase.service;

public interface LoginService {

    /**
     * For the login page. Check if the phone number and password matches.
     * @param phoneNum The input phone number
     * @param password The input password
     * @return Return true if the @param phoneNum and @param password could match.
     */
    boolean checkUser(String phoneNum, String password);

}
