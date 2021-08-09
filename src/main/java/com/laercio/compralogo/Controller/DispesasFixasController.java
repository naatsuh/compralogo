package com.laercio.compralogo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DispesasFixasController {

    @RequestMapping(method = RequestMethod.GET, value = "/dispesasfixas")
    public String dispesasFixas(){
        return "page/dispesasfixas";
    }
}
