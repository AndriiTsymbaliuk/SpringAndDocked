package lax.lajolla.SpringBoot.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import lax.lajolla.SpringBoot.items.Palabras;

@Component
@Profile({ "JdbcTemplate" })
public class ItemsJdbcTemplateDao implements ItemsDao {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    Environment env;

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Palabras> getAll() {
        logger.info("getAll::" + env.getActiveProfiles());
        return jdbcTemplate.query("select * from Palabras", new BeanPropertyRowMapper<Palabras>(Palabras.class));
    }

    public Palabras save(Palabras palabra) {
        logger.info("Save::" + env.getActiveProfiles());
        jdbcTemplate.update("INSERT INTO Palabras(value,idioma) VALUES(?,?)", palabra.getValue(), palabra.getIdioma());
        return palabra;
    }

}
