/**
 * @author KevHaes
 *
 */
package com.kevhaes.botigaDeQuadres.service;

import java.util.List;

import com.kevhaes.botigaDeQuadres.dto.Painting;

/**
 * @author KevHaes
 *
 */
public interface IPaintingService {
	// selected crud functions
	Painting createPainting(Painting painting);

	List<Painting> showPaintings();

	void deleteAllPaintings();
}
