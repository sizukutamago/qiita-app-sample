package com.qiita.app.controller;

import com.qiita.app.domain.QiitaItem;
import com.qiita.app.service.QiitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class QiitaController {
    @Autowired
    QiitaService qiitaService;

    @GetMapping("/items")
    public ModelAndView showAllItemsPage() {
        ModelAndView mv = new ModelAndView("items");
        List<QiitaItem> items = qiitaService.findAll();
        mv.addObject("items", items);
        return mv;
    }
}
