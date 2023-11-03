package com.aleksei.dao;

import com.aleksei.dbutil.DBUtil;
import com.aleksei.model.LoginInfo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginDAO {
    public static boolean isUserValid(LoginInfo userDetail) {
        boolean validStatus = false;
        try {
            Connection connection = DBUtil.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM login_info WHERE username = '" + userDetail.getName() + "' AND password= '" + userDetail.getPassword() + "'");
            while (resultSet.next()) {
                validStatus = true;
            }
            DBUtil.closeConnection(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return validStatus;
    }
}
