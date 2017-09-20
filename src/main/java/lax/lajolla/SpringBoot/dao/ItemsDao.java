package lax.lajolla.SpringBoot.dao;

import java.util.List;

import lax.lajolla.SpringBoot.items.Palabras;

public interface ItemsDao {

    public List<Palabras> getAll();

    public Palabras save(Palabras palabra);
}