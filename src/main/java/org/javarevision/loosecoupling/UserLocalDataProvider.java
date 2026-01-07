package org.javarevision.loosecoupling;

public class UserLocalDataProvider implements UserDataProvider{
    public String getUserData() {
        return "UserData from UserLocalDataProvider";
    }
}
