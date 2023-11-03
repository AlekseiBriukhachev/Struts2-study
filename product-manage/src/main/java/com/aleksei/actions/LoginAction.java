package com.aleksei.actions;

import com.aleksei.dao.LoginDAO;
import com.aleksei.model.LoginInfo;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginAction extends ActionSupport {
    private String username;
    private String password;
    public String execute() {
        boolean isUserValid = LoginDAO.isUserValid(new LoginInfo(username, password));
        return isUserValid ? SUCCESS : INPUT;
    }

}
