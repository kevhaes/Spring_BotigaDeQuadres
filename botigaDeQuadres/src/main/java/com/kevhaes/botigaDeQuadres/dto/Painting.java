/**
 * @author KevHaes
 *
 */
package com.kevhaes.botigaDeQuadres.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author KevHaes
 *
 */
@Entity
public class Painting {
	/////////////// ATRIBUTES ///////////////
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private double price;

	@ManyToOne
	@JoinColumn(name = "author_id")
	private Author author;

	private Date date = new Date();

	@ManyToOne
	@JoinColumn(name = "shop_id")
	private Shop shop;

	/////////////// CONSTRUCTORS ///////////////

	public Painting(Long id, String name, double price, Author author, Shop shop) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.author = author;
		this.shop = shop;
		createCurrentDate();
	}

	// 'empty' constructor with timeStamp method
	public Painting() {
		createCurrentDate();
	};

	/////////////// GETTERS & SETTERS ///////////////
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	// getters setters FK
	/**
	 * @return the shop
	 */
	public Shop getShop() {
		return shop;
	}

	/**
	 * @param shop the shop to set
	 */
	public void setShop(Shop shop) {
		this.shop = shop;
	}

	/**
	 * @return the author
	 */
	public Author getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(Author author) {
		this.author = author;
	}

	/////////////// METHODS ///////////////

	public void createCurrentDate() {
		this.date = new Date();
	}

	/////////////// TO STRING ///////////////
	@Override
	public String toString() {
		return "Painting [id=" + id + ", name=" + name + ", price=" + price + ", author=" + author + ", date=" + date
				+ ", shop=" + shop + "]";
	}

}
