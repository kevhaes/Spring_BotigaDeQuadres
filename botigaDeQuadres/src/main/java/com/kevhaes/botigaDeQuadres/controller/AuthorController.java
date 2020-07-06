/**
 * @author KevHaes
 *
 */
package com.kevhaes.botigaDeQuadres.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kevhaes.botigaDeQuadres.dto.Author;
import com.kevhaes.botigaDeQuadres.service.AuthorService;

/**
 * @author KevHaes
 *
 */
@RestController
@RequestMapping("/api/authors")
public class AuthorController {
	/////////////// ATRIBUTES ///////////////
	@Autowired
	AuthorService authorService;

	/////////////// METHODS ///////////////
	@PostMapping
	public Author createAuthor(@RequestBody Author author) {
		return authorService.createAuthor(author);
	}

	/////////////// TOSTRING ///////////////
	@Override
	public String toString() {
		return "AuthorController [authorService=" + authorService + "]";
	}

}
