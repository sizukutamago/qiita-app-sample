package com.qiita.app.repository;

import com.qiita.app.domain.QiitaItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QiitaRepository extends JpaRepository<QiitaItem, String> {
}
