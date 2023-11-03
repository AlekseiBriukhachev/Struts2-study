package com.aleksei.actions;

import com.aleksei.dao.ProductManagementDAO;
import com.aleksei.model.Product;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class WelcomeAction extends ActionSupport {
    private List<Product> products;
    public void initialProducts() {
        products = ProductManagementDAO.getAllProducts();
    }
    public String execute() {
        initialProducts();
        return SUCCESS;
    }
}
