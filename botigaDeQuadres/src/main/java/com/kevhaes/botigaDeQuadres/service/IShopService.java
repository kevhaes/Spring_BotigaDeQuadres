/**
 * @author KevHaes
 *
 */
package com.kevhaes.botigaDeQuadres.service;

import java.util.List;

import com.kevhaes.botigaDeQuadres.dto.Painting;
import com.kevhaes.botigaDeQuadres.dto.Shop;

/**
 * @author KevHaes
 *
 */
public interface IShopService {

// crud methods
	public Shop createShop(Shop shop);

	public List<Shop> showAllShops();

	public Shop showOneShopByid(Long id);

	public List<Painting> showAllPaintingsFromOneShopByid(Long id);

}