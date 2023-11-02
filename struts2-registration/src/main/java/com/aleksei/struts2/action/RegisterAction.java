package com.aleksei.struts2.action;

import com.aleksei.struts2.Product;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.List;

//public class RegisterAction implements Action {
public class RegisterAction extends ActionSupport {
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private String email;
    private String address;
    private String selectedColor;
    private List<String> colors;
    private boolean subscription;
    private String message;
    private List<String> hobbies;
    private String selectedHobbies;
    private List<Product> products;

    public String execute() {
        System.out.println("execute() method called");
        message = subscription ? "You are subscriber" : "You aren't subscriber";
        System.out.println(message);
        return SUCCESS;
    }
    public String initializeFormFields() {
        initializeColors();
        initializeHobbies();
        initializeProducts();
        return INPUT;
    }
    private void initializeColors() {
        colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("White");
    }
    private void initializeHobbies() {
        hobbies = new ArrayList<>();
        hobbies.add("Drawing");
        hobbies.add("Teaching");
        hobbies.add("Singing");
        hobbies.add("Programming");
    }
    private void initializeProducts() {
        products = new ArrayList<>();
        products.add(new Product(111, "Mobile Phone", 10000));
        products.add(new Product(222, "Camera", 7000));
        products.add(new Product(333, "TV", 20000));
        products.add(new Product(444, "Laptop", 30000));
    }

//    public void validate() {
//        if (firstName.equals("")) addFieldError("firstName", "First Name is required");
//        if (lastName.equals("")) addFieldError("lastName", "Last Name is required");
//        if (gender == null) addFieldError("gender", "Gender is required");
//        if (age == null) addFieldError("age", "Age is required");
//        else if (age < 18) addFieldError("age", "Age should be above 18");
//        if (email.equals("")) addFieldError("email", "Email is required");
//    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSelectedColor() {
        return selectedColor;
    }

    public void setSelectedColor(String selectedColor) {
        this.selectedColor = selectedColor;
    }

    public List<String> getColors() {
        return colors;
    }

    public void setColors(List<String> colors) {
        this.colors = colors;
    }

    public boolean isSubscription() {
        return subscription;
    }

    public void setSubscription(boolean subscription) {
        this.subscription = subscription;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public String getSelectedHobbies() {
        return selectedHobbies;
    }

    public void setSelectedHobbies(String selectedHobbies) {
        this.selectedHobbies = selectedHobbies;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
