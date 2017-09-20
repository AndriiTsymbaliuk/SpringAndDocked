package lax.lajolla.SpringBoot.controllers;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lax.lajolla.SpringBoot.items.Palabras;
import lax.lajolla.SpringBoot.services.ItemsServices;

@RestController
public class ItemsContoller {
    @Autowired
    private ItemsServices itemsServices;

    @RequestMapping("/")
    String getWellcomeScreen() {
        return "<b>Wellcome Screen </b> <br> " + "<a href=\"/all\">La lista de palabras</a>";
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON, path = "/all")
    List<Palabras> getAlllItems() {

        return itemsServices.getAll();
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON, path = "/create")
    void createNewItem(@RequestBody Palabras palabra) {
        itemsServices.createNew(palabra);
    }
}
