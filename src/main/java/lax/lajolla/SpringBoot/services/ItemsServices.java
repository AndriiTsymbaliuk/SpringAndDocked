package lax.lajolla.SpringBoot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lax.lajolla.SpringBoot.dao.ItemsDao;
import lax.lajolla.SpringBoot.items.Palabra;

@Component
public class ItemsServices {
	
	@Autowired
	private ItemsDao itemsDao;
	
	public List<Palabra> getAll()
	{
		return itemsDao.getAll();
	}
	
	public void createNew(Palabra palabra)
	{
		itemsDao.createNew(palabra);
	}
	
}
