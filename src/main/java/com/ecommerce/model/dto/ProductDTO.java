package com.ecommerce.model.dto;

public class ProductDTO {
    private String name;
    private Double price;
    private Integer stockQuantity;

    public ProductDTO() {}

  
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }
    public Integer getStockQuantity() { return stockQuantity; }
    public void setStockQuantity(Integer stockQuantity) { this.stockQuantity = stockQuantity; }
}
