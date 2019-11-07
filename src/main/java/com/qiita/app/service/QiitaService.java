package com.qiita.app.service;

import com.qiita.app.domain.QiitaItem;
import com.qiita.app.repository.QiitaRepository;
import com.qiita.app.repository.RestComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class QiitaService {
    RestComponent restComponent;

    QiitaRepository qiitaRepository;

    @Autowired
    public QiitaService(
            RestComponent restComponent,
            QiitaRepository qiitaRepository
    ){
        this.restComponent = restComponent;
        this.qiitaRepository = qiitaRepository;
    }

    @Transactional(readOnly = false)
    public void crawlItems() {
        List<QiitaItem> items = restComponent.getItems();
        qiitaRepository.saveAll(items);
    }

    @Transactional(readOnly = true)
    public List<QiitaItem> findAll() {
        return qiitaRepository.findAll();
    }
}
