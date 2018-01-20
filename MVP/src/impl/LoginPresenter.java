package impl;

import iface.Model;
import iface.Presenter;
import iface.View;

public class LoginPresenter implements Presenter {

    Model loginModel;
    View loginView;
    private Runnable onLogin;

    @Override
    public Model getModel() {
        return loginModel;
    }

    @Override
    public void setModel(Model loginModel) {
        this.loginModel = loginModel;
    }

    @Override
    public View getView() {
        return loginView;
    }

    @Override
    public void setView(View loginView) {
        this.loginView = loginView;
    }

    @Override
    public void setOnLogin(Runnable onLogin) {
        this.onLogin = onLogin;
    }

    @Override
    public void run() {
        loginModel.setUser("previousUser");
        loginView.setPresenter(this);
        loginView.updateViewFromModel();
        loginView.open();
    }

    @Override
    public void login() {
        loginView.updateModelFromView();
        if (loginModel.getUser().equalsIgnoreCase("root")) {
            loginView.close();
            loginView.setPresenter(null);// for memory sanity.
            onLogin.run();
        } else {
            loginView.userRejected();
        }
    }
}
