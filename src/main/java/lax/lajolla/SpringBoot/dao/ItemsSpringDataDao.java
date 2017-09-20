package lax.lajolla.SpringBoot.dao;

import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import lax.lajolla.SpringBoot.items.Palabras;
@Profile({"SpringData"})
public interface ItemsSpringDataDao extends CrudRepository<Palabras, Long>, ItemsDao {
    
    @Query(value="select * from Palabras p", nativeQuery = true) 
    public List<Palabras> getAll();
    
    public Palabras save(Palabras palabra);
}