/**
 * @author KevHaes
 *
 */
package com.kevhaes.botigaDeQuadres.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevhaes.botigaDeQuadres.dao.IPaintingDao;
import com.kevhaes.botigaDeQuadres.dto.Painting;

/**
 * @author KevHaes
 *
 */
@Service
public class PaintingService implements IPaintingService {

	/////////////// ATRIBUTES ///////////////
	@Autowired
	IPaintingDao iPaintingDao;

	/////////////// METHODS ///////////////
	@Override
	public Painting createPainting(Painting painting) {
		return iPaintingDao.save(painting);
	}

	@Override
	public List<Painting> showPaintings() {
		return iPaintingDao.findAll();
	}

	@Override
	public void deleteAllPaintings() {
		iPaintingDao.deleteAll();
	}

}
