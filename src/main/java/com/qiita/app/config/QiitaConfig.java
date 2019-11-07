package com.qiita.app.config;

import com.qiita.app.param.QiitaParam;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QiitaConfig {
    @Bean
    public QiitaParam qiitaParam() {
        return new QiitaParam();
    }
}
