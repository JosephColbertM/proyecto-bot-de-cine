package com.botcine.bot_cine.bl;

import com.botcine.bot_cine.dao.MenuCandybarDao;
import com.botcine.bot_cine.dao.PeliculasDao;
import com.botcine.bot_cine.dto.MenuCandybarDto;
import com.botcine.bot_cine.dto.PeliculasDto;

import java.util.List;

public class MenuCandybarBL {
    private MenuCandybarDao menuCandybarDao;
    public MenuCandybarBL(MenuCandybarDao menuCandybarDao) {this.menuCandybarDao=menuCandybarDao;}

    public List<MenuCandybarDto> findLast10PermissionsByChatId(Long chatId) {
        List<MenuCandybarDto> Menu = menuCandybarDao.findAllCandy();
        return Menu;
    }

}
