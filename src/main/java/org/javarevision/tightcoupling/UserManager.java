package org.javarevision.tightcoupling;

import org.javarevision.loosecoupling.UserDataProvider;

public class UserManager {
    private UserDataBaseProvider userDataBaseProvider;

    public UserManager (UserDataBaseProvider userDataBaseProvider) {
        this.userDataBaseProvider = userDataBaseProvider;
    }

    public String getUserData() {
        return userDataBaseProvider.getUserDetails();
    }
}
