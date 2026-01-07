package org.javarevision.loosecoupling;

public class UserWebProvider implements UserDataProvider{
    public String getUserData() {
        return "UserData from UserWebProvider";
    }
}
