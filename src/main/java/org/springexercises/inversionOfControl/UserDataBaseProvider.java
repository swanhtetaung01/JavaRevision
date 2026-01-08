package org.springexercises.inversionOfControl;

public class UserDataBaseProvider implements UserDataProvider {

    @Override
    public String getUserData()  {
        return "UserData from UserDataBaseProvider";
    }
}
