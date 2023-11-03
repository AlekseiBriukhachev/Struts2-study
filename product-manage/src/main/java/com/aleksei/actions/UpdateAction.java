package com.aleksei.actions;

import com.aleksei.dao.ProductManagementDAO;
import com.aleksei.model.Product;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateAction extends ActionSupport {
    private int id;
    private String name;
    private String category;
    private int price;
    public String execute() {
        Product product = new Product(id, name, category, price);
        int recordUpdate = ProductManagementDAO.updateProduct(product);
        return recordUpdate == 1 ? SUCCESS : ERROR;
    }
}
