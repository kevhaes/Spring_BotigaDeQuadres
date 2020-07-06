/**
 * @author KevHaes
 *
 */
package com.kevhaes.botigaDeQuadres.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kevhaes.botigaDeQuadres.dto.Shop;

/**
 * @author KevHaes
 *
 */
public interface IShopDao extends JpaRepository<Shop, Long> {

}
