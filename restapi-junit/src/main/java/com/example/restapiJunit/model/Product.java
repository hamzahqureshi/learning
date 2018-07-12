package com.example.restapiJunit.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Product implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7557081944873868186L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private Double price;
	public String getName ()
	{
		return name;
	}
	public void setName (String name)
	{
		this.name = name;
	}
	public Double getPrice ()
	{
		return price;
	}
	public void setPrice (Double price)
	{
		this.price = price;
	}
	public Category getCategory ()
	{
		return category;
	}
	public void setCategory (Category category)
	{
		this.category = category;
	}
	public void setId (Integer id)
	{
		this.id = id;
	}
	public Integer getId ()
	{
		return id;
	}
	
	@OneToOne
	@JoinColumn(name="category_id", referencedColumnName="id")
	private Category category;
	
	
}
