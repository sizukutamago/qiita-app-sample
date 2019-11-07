package com.qiita.app.controller;

import com.qiita.app.domain.QiitaItem;
import com.qiita.app.service.QiitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class QiitaRestController {
    @Autowired
    QiitaService qiitaService;

    @GetMapping("/items")
    public ResponseEntity<List<QiitaItem>> getAllItems() {
        List<QiitaItem> items = qiitaService.findAll();
        return ResponseEntity.ok().body(items);
    }
}
