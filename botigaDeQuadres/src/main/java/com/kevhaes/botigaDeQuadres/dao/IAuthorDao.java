/**
 * @author KevHaes
 *
 */
package com.kevhaes.botigaDeQuadres.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kevhaes.botigaDeQuadres.dto.Author;

/**
 * @author KevHaes
 *
 */
public interface IAuthorDao extends JpaRepository<Author, Long> {

}
