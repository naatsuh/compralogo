package com.laercio.compralogo.Controller;

import java.util.List;

import com.laercio.compralogo.Model.Comercio;
import com.laercio.compralogo.service.ComercioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class ComprasComercioController {

    @Autowired
    private ComercioService comercioService;


    @RequestMapping(method = RequestMethod.GET, value = "/compras")
    public String compras(Model model) {
        return findPaginated(1, "tipoDoComercio", "asc", model);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/comercio/novaCompra")
    public String novacompra(Model model) {
        Comercio comercio = new Comercio();
        model.addAttribute("comercio", comercio);
        return "page/comercio/novaCompra";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/saveComercio")
    public String saveComercio(@ModelAttribute("comercio") Comercio comercio) {
        comercioService.saveComercio(comercio);
        return "redirect:/compras";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/comercio/editarcomercio/{id}")
    public String editarComercio(@PathVariable(value = "id") long id, Model model) {
        Comercio comercio = comercioService.getComercioById(id);

        model.addAttribute("comercio", comercio);
        return "page/comercio/editarcomercio";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/comercio/deletarcomercio/{id}")
    public String deletarComercio(@PathVariable(value = "id") long id) {
        this.comercioService.deletarComercioById(id);
        return "redirect:/compras";
    }


    @RequestMapping(method = RequestMethod.GET, value = "/page/{pageNo}")
    public String findPaginated(@PathVariable (value = "pageNo") int pageNo,
                                @RequestParam("sortField") String sortField,
                                @RequestParam("sortDir") String sortDir,
                                Model model) {
        int pageSize = 5;

        Page<Comercio> page = comercioService.findPaginated(pageNo, pageSize, sortField, sortDir);
        List<Comercio> listaDeComercio = page.getContent();

        model.addAttribute("currentPage", pageNo);
        model.addAttribute("totalPages", page.getTotalPages());
        model.addAttribute("totalItems", page.getTotalElements());

        model.addAttribute("sortField", sortField);
        model.addAttribute("sortDir", sortDir);
        model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");

        model.addAttribute("listaDeComercio", listaDeComercio);
        return "page/comercio";
    }
}
