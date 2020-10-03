package ru.accounting_point.task.savinov.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.accounting_point.task.savinov.entities.ObjRow;
import ru.accounting_point.task.savinov.services.ObjRowService;

import java.util.List;

@Controller
public class MainController {
    private ObjRowService objRowService;

    @Autowired
    public MainController(ObjRowService objRowService) {
        this.objRowService = objRowService;
    }


    @GetMapping("/tree")
    public String detailsPage(Model model) {
        List<ObjRow> objRowList = objRowService.getListObjRow();
        System.out.println(objRowList);
        model.addAttribute("objRowList", objRowList);
//        ModelAndView mav = new ModelAndView("tree.html");
        return "tree";
    }

}