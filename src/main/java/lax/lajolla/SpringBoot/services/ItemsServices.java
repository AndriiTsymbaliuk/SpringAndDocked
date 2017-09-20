package lax.lajolla.SpringBoot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lax.lajolla.SpringBoot.dao.ItemsDao;
import lax.lajolla.SpringBoot.items.Palabras;

@Component
public class ItemsServices {
    
    @Autowired
    private ItemsDao itemsDao;

    public List<Palabras> getAll() {
        return itemsDao.getAll();
    }

    public void createNew(Palabras palabra) {
        itemsDao.save(palabra);
    }

}
