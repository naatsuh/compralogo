package com.laercio.compralogo.Controller;


import com.laercio.compralogo.Model.DespesasFixas;
import com.laercio.compralogo.service.DespesasFixasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class DespesasFixasController {

    @Autowired
    private DespesasFixasService despesasFixasService;


    @RequestMapping(method = RequestMethod.GET, value = "/despesasFixas")
    public String despesasFixas(Model model) {
        return findPaginated(1, "agua", "asc", model);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/despesasfixas/novasDespesasFixas")
    public String novaDespesasFixas(Model model) {
        DespesasFixas despesasFixas = new DespesasFixas();
        model.addAttribute("despesasFixas", despesasFixas);
        return "page/despesasfixas/novasdespesasFixas";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/saveDespesasFixas")
    public String saveDespesasFixas(@ModelAttribute("comercio") DespesasFixas despesasFixas) {
        this.despesasFixasService.saveDespesasFixas(despesasFixas);
        return "redirect:/despesasFixas";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/despesasfixas/editardespesasfixas/{id}")
    public String editarDespesasFixas(@PathVariable(value = "id") long id, Model model) {
        DespesasFixas despesasFixas = this.despesasFixasService.getDespesasFixasById(id);

        model.addAttribute("despesasFixas", despesasFixas);
        return "page/despesasFixas/editardespesasfixas";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/deletardespesasfixas/{id}")
    public String deletarDespesasFixas(@PathVariable(value = "id") long id) {
        this.despesasFixasService.deletarDespesasFixasById(id);
        return "page/despesasfixas";
    }


    @RequestMapping(method = RequestMethod.GET, value = "/page/despesasfixas/{pageNo}")
    public String findPaginated(@PathVariable (value = "pageNo") int pageNo,
                                @RequestParam("sortField") String sortField,
                                @RequestParam("sortDir") String sortDir,
                                Model model) {
        int pageSize = 5;

        Page<DespesasFixas> page = this.despesasFixasService.findPaginated(pageNo, pageSize, sortField, sortDir);
        List<DespesasFixas> listaDeDespesasFixas = page.getContent();

        model.addAttribute("currentPage", pageNo);
        model.addAttribute("totalPages", page.getTotalPages());
        model.addAttribute("totalItems", page.getTotalElements());

        model.addAttribute("sortField", sortField);
        model.addAttribute("sortDir", sortDir);
        model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");

        model.addAttribute("listaDeDespesasFixas", listaDeDespesasFixas);
        return "page/despesasFixas";
    }
}
