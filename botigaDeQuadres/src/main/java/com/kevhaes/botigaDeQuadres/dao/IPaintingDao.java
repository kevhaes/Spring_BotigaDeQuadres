/**
 * @author KevHaes
 *
 */
package com.kevhaes.botigaDeQuadres.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kevhaes.botigaDeQuadres.dto.Painting;

/**
 * @author KevHaes
 *
 */
public interface IPaintingDao extends JpaRepository<Painting, Long> {
}
