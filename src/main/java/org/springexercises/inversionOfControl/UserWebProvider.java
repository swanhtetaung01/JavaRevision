package org.springexercises.inversionOfControl;

public class UserWebProvider implements UserDataProvider {
    @Override
    public String getUserData() {
        return "UserData from UserWebProvider";
    }
}
