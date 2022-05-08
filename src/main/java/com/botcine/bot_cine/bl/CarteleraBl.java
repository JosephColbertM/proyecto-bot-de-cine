package com.botcine.bot_cine.bl;

import com.botcine.bot_cine.dao.CarteleraDao;
import com.botcine.bot_cine.dto.CarteleraDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarteleraBl {

    private CarteleraDao carteleraDao;

    @Autowired
    public CarteleraBl(CarteleraDao carteleraDao) {

        this.carteleraDao = carteleraDao;
    }

    public List<CarteleraDto> findLast10PermissionsByChatId(Long chatId) {

        List<CarteleraDto> car = carteleraDao.findAllPeliculas();
        return car;
    }

    public void saveCartelera(Integer cantidad, String nombre_pelicula, String horario){
        carteleraDao.saveCartelera(cantidad,nombre_pelicula,horario);
    }
}
