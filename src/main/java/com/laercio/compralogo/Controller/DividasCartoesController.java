package com.laercio.compralogo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DividasCartoesController {

    @RequestMapping(method = RequestMethod.GET, value = "/dividascartoes")
    public String compras(){
        return "page/dividascartoes";
    }
}
