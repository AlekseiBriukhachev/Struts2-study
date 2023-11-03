package com.aleksei.actions;

import com.aleksei.dao.ProductManagementDAO;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeleteAction extends ActionSupport {
    private int id;
    public String execute() {
        int recordDelete = ProductManagementDAO.deleteProduct(id);
        return recordDelete == 1 ? SUCCESS : ERROR;
    }
}
