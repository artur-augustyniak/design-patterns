package impl;

import iface.Model;

public class LoginModel implements Model {

    String user;

    @Override
    public String getUser() {
        return user;
    }

    @Override
    public void setUser(String user) {
        this.user = user;
    }
}