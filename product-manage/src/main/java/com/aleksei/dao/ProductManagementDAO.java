package com.aleksei.dao;

import com.aleksei.dbutil.DBUtil;
import com.aleksei.model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductManagementDAO {
    public static List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        try {
            Connection connection = DBUtil.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM product");
            while (resultSet.next()) {
                Product product = new Product(resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("category"),
                        resultSet.getInt("price"));
                products.add(product);
            }
            DBUtil.closeConnection(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }
    public static int addProduct(Product product) {
        int status = 0;
        try {
            Connection connection = DBUtil.getConnection();
            PreparedStatement statement = connection.prepareStatement("INSERT INTO product VALUES(?,?,?,?)");
            statement.setInt(1, product.getId());
            statement.setString(2, product.getName());
            statement.setString(3, product.getCategory());
            statement.setInt(4, product.getPrice());
            status = statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
    public static Product getProductById(int id) {
        Product product = null;
        try {
            Connection connection = DBUtil.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM product WHERE id=?");
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                product = new Product(resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("category"),
                        resultSet.getInt("price"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return product;
    }
    public static int updateProduct(Product product) {
        int status = 0;
        try {
            Connection connection = DBUtil.getConnection();
            PreparedStatement statement = connection.prepareStatement("UPDATE  product SET name=?, category=?, price=? WHERE id=?");
            statement.setString(1, product.getName());
            statement.setString(2, product.getCategory());
            statement.setInt(3, product.getPrice());
            statement.setInt(4, product.getId());
            status = statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
    public static int deleteProduct(int id) {
        int status = 0;
        try {
            Connection connection = DBUtil.getConnection();
            PreparedStatement statement = connection.prepareStatement("DELETE FROM product WHERE id=?");
            statement.setInt(1, id);
            status = statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
}
