import iface.Model;
import iface.Presenter;
import iface.View;
import impl.LoginModel;
import impl.LoginPresenter;
import impl.LoginView;

import javax.swing.*;

public class MVP {


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                Model loginModel = new LoginModel();
                Presenter loginPresenter = new LoginPresenter();
                loginPresenter.setModel(loginModel);
                View loginView = new LoginView();
                loginPresenter.setView(loginView);
                loginPresenter.setOnLogin(new Runnable() {

                    @Override
                    public void run() {
                        JOptionPane.showMessageDialog(null, "Welcome user!");
                    }
                });
                loginPresenter.run();
            }
        });
    }

}
