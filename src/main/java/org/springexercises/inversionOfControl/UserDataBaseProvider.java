package org.springexercises.inversionOfControl;

import org.javarevision.loosecoupling.UserDataProvider;

public class UserDataBaseProvider implements UserDataProvider {
    @Override
    public String getUserData()  {
        return "UserData from UserDataBaseProvider";
    }
}
