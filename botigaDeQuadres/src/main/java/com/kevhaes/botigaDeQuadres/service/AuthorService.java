/**
 * @author KevHaes
 *
 */
package com.kevhaes.botigaDeQuadres.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevhaes.botigaDeQuadres.dao.IAuthorDao;
import com.kevhaes.botigaDeQuadres.dto.Author;

/**
 * @author KevHaes
 *
 */
@Service
public class AuthorService implements IAuthorService {

	/////////////// ATRIBUTES ///////////////
	@Autowired
	IAuthorDao iAuthorDao;

	/////////////// METHODS ///////////////
	@Override
	public Author createAuthor(Author author) {
		return iAuthorDao.save(author);
	}

	/////////////// CONSTRUCTORS ///////////////

	/////////////// GETTERS & SETTERS ///////////////

	/////////////// TOSTRING ///////////////

}
