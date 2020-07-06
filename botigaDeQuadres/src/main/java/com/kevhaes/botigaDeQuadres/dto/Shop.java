/**
 * @author KevHaes
 *
 */
package com.kevhaes.botigaDeQuadres.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author KevHaes
 *
 */
@Entity
public class Shop {
	/////////////// ATRIBUTES ///////////////
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private int capacity;

	@OneToMany
	@JoinColumn(name = "id")
	private List<Painting> paintings;

	/////////////// CONSTRUCTORS ///////////////
	public Shop(Long id, String name, int capacity, List<Painting> paintings) {
		this.id = id;
		this.name = name;
		this.capacity = capacity;
		this.paintings = paintings;
	}

	public Shop() {
	}

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
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	// relation getter setter
	/**
	 * @return the paintings
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Painting")
	public List<Painting> getPaintings() {
		return paintings;
	}

	/**
	 * @param paintings the paintings to set
	 */
	public void setPaintings(List<Painting> paintings) {
		this.paintings = paintings;
	}

	/////////////// TOSTRING ///////////////
	@Override
	public String toString() {
		return "Shop [id=" + id + ", name=" + name + ", capacity=" + capacity + ", paintings=" + paintings + "]";
	}

}
