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
public class Author {
	/////////////// ATRIBUTES ///////////////
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;

	@OneToMany
	@JoinColumn(name = "id")
	private List<Painting> paintings;

	/////////////// CONSTRUCTORS ///////////////
	public Author(Long id, String name, List<Painting> paintings) {
		this.id = id;
		this.name = name;
		this.paintings = paintings;
	}

	public Author() {
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
		return "Author [id=" + id + ", name=" + name + ", paintings=" + paintings + "]";
	}

}
