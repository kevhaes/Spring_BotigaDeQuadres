/**
 * @author KevHaes
 *
 */
package com.kevhaes.botigaDeQuadres.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevhaes.botigaDeQuadres.dao.IShopDao;
import com.kevhaes.botigaDeQuadres.dto.Painting;
import com.kevhaes.botigaDeQuadres.dto.Shop;

/**
 * @author KevHaes
 *
 */
@Service
public class ShopService implements IShopService {

/////////////// ATRIBUTES ///////////////
	@Autowired
	IShopDao iShopDao;

/////////////// CRUD METHODS to implement ///////////////
	@Override
	public Shop createShop(Shop shop) {
		return iShopDao.save(shop);
	}

	@Override
	public List<Shop> showAllShops() {
		return iShopDao.findAll();
	}

	@Override
	public Shop showOneShopByid(Long id) {
		return iShopDao.findById(id).get();
	}

	@Override
	public List<Painting> showAllPaintingsFromOneShopByid(Long id) {
		return iShopDao.findById(id).get().getPaintings();
	}

}
