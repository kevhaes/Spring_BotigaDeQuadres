/**
 * @author KevHaes
 *
 */
package com.kevhaes.botigaDeQuadres.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kevhaes.botigaDeQuadres.dto.Painting;
import com.kevhaes.botigaDeQuadres.dto.Shop;
import com.kevhaes.botigaDeQuadres.service.ShopService;

/**
 * @author KevHaes
 *
 */
@RestController
@RequestMapping("/api/shops")
public class ShopController {
	/////////////// ATRIBUTES ///////////////
	@Autowired
	ShopService shopService;

	/////////////// METHODS ///////////////
	@PostMapping
	public Shop createShop(@RequestBody Shop shop) {
		return shopService.createShop(shop);
	}

	@GetMapping
	public List<Shop> showAllShops() {
		return shopService.showAllShops();
	}

	// select one shop by ID
	@GetMapping("{id}")
	public Shop showOneShopByid(@PathVariable("id") Long id) {
		return shopService.showOneShopByid(id);
	}

	@GetMapping("{id}/paintings")
	public List<Painting> showAllPaintingsFromOneShopByid(@PathVariable("id") Long id) {
		return shopService.showAllPaintingsFromOneShopByid(id);
	}
}
