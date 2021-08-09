package com.laercio.compralogo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ComprasComercioController {

    @RequestMapping(method = RequestMethod.GET, value = "/compras")
    public String compras(){
        return "page/compras";
    }
}
