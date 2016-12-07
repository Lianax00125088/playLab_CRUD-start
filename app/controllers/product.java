package model;

import java.util.*;
import javax.persistence.*;

import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

//product entity managed by the ORM
@Entity


public class product extends Model{
    	//properties
	//Annotate id as the primary key
	@id 
	private Long id;

	@contstraints.Required 
	private String name;

	@contstraints.Required 
	private String description;

	@contstraints.Required 
	private int stock;

	@contstraints.Required 
	private double price;

	//default constructor
	public Product (){
	}

	//constructor to initialise object
	public Product(Long id, String name, String description, int stock, double price){
	this.id = id;
	this.name = name;
	this.decription = description;
	this.stock = stock;
	this.price = price;
	}
	
	public Long getId(){
		return id;
	}
 	
	public void setId(Long id) {
		this.id = id;
	}

	public String getName(){
		return name;
	}

	}
