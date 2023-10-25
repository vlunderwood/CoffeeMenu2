package coffee.beans;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


//@author valei - vlunderwood CIS175 - Fall 2023 Oct 15, 2023


@Entity
public class Menu {
	//instance variables
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String itemName;
	private String itemDescription;
	private double itemPrice;
	
	//no arg default constructor
	public Menu() {
		super();
	}

	//getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	@Override
	public String toString() {
		return "Menu [Id=" + id + ", Item Name=" + itemName + ", Item Description=" + itemDescription + "itemPrice=" + itemPrice + "]";
	}

	public List<Menu> getAllMenuItems() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
