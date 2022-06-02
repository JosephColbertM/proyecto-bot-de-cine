package com.botcine.bot_cine.api;

import com.botcine.bot_cine.bl.ProductoBl;
import com.botcine.bot_cine.dto.ProductoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT})
public class ProductosApi {
    private ProductoBl productoBl;

    @Autowired
    public ProductosApi(ProductoBl productoBl){
        this.productoBl=productoBl;
    }
    @GetMapping(value = "/producto", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ProductoDto> findLast10PermissionsByChatId() {
        return productoBl.findLast10PermissionsByChatId();
    }

}
