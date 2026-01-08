package org.springexercises.IOCwithInterface;

public class UserLocalDataProvider implements UserDataProvider {
    @Override
    public String getUserData() {
        return "UserData from UserLocalDataProvider";
    }
}
