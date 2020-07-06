/**
 * @author KevHaes
 *
 */
package com.kevhaes.botigaDeQuadres.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kevhaes.botigaDeQuadres.dto.Painting;
import com.kevhaes.botigaDeQuadres.service.PaintingService;

/**
 * @author KevHaes
 *
 */
@RestController
@RequestMapping("api/paintings")
public class PaintingController {
	/////////////// ATRIBUTES ///////////////
	@Autowired
	PaintingService paintingService;

	/////////////// METHODS ///////////////
	@PostMapping
	public Painting createPainting(@RequestBody Painting painting) {
		return paintingService.createPainting(painting);
	}

	@GetMapping
	public List<Painting> showPaintings() {
		return paintingService.showPaintings();
	}

	@DeleteMapping
	public void deleteAllPaintings() {
		paintingService.deleteAllPaintings();
	}

}
