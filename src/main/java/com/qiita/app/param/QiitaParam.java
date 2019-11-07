package com.qiita.app.param;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "qiita.param")
public class QiitaParam {
    private String url;

    private Integer limit;
}
