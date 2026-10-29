package org.example;

public class ItemList {
    private int id;
    private String product;
    private float price;
    private String department;

    public ItemList(String department, float price, String product, int id) {
        this.department = department;
        this.price = price;
        this.product = product;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
