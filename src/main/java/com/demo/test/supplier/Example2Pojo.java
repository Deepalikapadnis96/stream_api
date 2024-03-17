package com.demo.test.supplier;

public class Example2Pojo {
private String productName;
private String id;
private String price;
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public Example2Pojo(String productName, String id, String price) {
	super();
	this.productName = productName;
	this.id = id;
	this.price = price;
}

@Override
public String toString() {
	return "Example2Pojo [productName=" + productName + ", id=" + id + ", price=" + price + "]";
}

}
