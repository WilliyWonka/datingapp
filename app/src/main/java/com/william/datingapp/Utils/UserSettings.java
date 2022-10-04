package com.william.datingapp.Utils;

public class UserSettings {

    private com.william.datingapp.Utils.User user;

    public UserSettings(com.william.datingapp.Utils.User user) {
        this.user = user;
    }

    public UserSettings() {
    }

    public com.william.datingapp.Utils.User getUser() {
        return user;
    }

    public void setUser(com.william.datingapp.Utils.User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserSettings{" +
                "user=" + user +
                '}';
    }
}
