package com.aleksei.actions;

import com.aleksei.dao.ProductManagementDAO;
import com.aleksei.model.Product;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateDateAction extends ActionSupport {
    private int id;
    private String name;
    private String category;
    private int price;

    public String execute() {
        Product product = ProductManagementDAO.getProductById(id);
        id = product.getId();
        name = product.getName();
        category = product.getCategory();
        price = product.getPrice();
        return SUCCESS;
    }
}
