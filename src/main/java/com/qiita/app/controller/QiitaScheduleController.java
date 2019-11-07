package com.qiita.app.controller;

import com.qiita.app.service.QiitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

@Controller
public class QiitaScheduleController {
    private static final long INTERVAL=900_000;

    @Autowired
    QiitaService qiitaService;

    @Scheduled(fixedRate = INTERVAL)
    public void crawlQiitaItems() {
        qiitaService.crawlItems();
    }
}
