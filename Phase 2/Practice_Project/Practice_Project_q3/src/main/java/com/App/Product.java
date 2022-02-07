package com.App;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@javax.persistence.Entity
@Table(name = "product1")
public class Product {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name = "name")
	String name;
	
	@Column(name = "price")
	int price;
	
//	@Column(name = "qty")
//	int qty;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

//	@Override
//	public String toString() {
//		return "Product1 [id=" + id + ",name=" + name + ",price=" + price +",qty=" +qty
//				+ "]";
//	}
	@Override
	public String toString() {
		return "Product1 [id=" + id + ",name=" + name + ",price=" + price
				+ "]";
	}

	public Product(String name, int price) {
	    //this.id=id;
		this.name = name;
		this.price = price;
//		this.qty=qty;
	}
	
}