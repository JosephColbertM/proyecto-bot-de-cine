package com.botcine.bot_cine.bl;

import com.botcine.bot_cine.dao.CandyBarDao;
import com.botcine.bot_cine.dto.CandyBarDto;
import com.botcine.bot_cine.dto.PeliculasDto;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class CandyBarBl {
    private CandyBarDao candyBarDao;
    @Autowired
    public CandyBarBl(CandyBarDao candyBarDao) {
        this.candyBarDao = candyBarDao;
    }
    public List<CandyBarDto> findLast10PermissionsByChatId(Long chatId) {
        List<CandyBarDto> Prod = candyBarDao.findAllCandyBar();
        return Prod;

    }
}
