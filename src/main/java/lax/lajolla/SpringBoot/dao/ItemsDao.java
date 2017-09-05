package lax.lajolla.SpringBoot.dao;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import lax.lajolla.SpringBoot.items.Palabra;

@Component
public class ItemsDao {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	public List<Palabra> getAll() {
		logger.info("getAll");
		Palabra palabra = new Palabra();
		palabra.setIdioma("es");
		palabra.setValue("objetivo");
		List<Palabra> result = new ArrayList<>();
		result.add(palabra);
		return result;
	}

	public void createNew(Palabra palabra) {
		logger.info("createNew");
	}

}
