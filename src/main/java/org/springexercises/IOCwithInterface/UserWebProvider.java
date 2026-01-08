package org.springexercises.IOCwithInterface;

public class UserWebProvider implements UserDataProvider {
    @Override
    public String getUserData() {
        return "UserData from UserWebProvider";
    }
}
