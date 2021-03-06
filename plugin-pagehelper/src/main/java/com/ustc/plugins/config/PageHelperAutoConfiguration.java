package com.ustc.plugins.config;

import com.ustc.plugins.PageHelperAspect;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * company: guochuang software co.ltd<br>
 * date: 2020/2/19<br>
 * filename: OperationLogAutoConfiguration<br>
 * <p>
 * description:<br>
 * 操作日志配置类
 * </p>
 *
 * @author xie.bowen@ustcinfo.com
 */
@Configuration
@ConditionalOnWebApplication
public class PageHelperAutoConfiguration {

    @Bean
    public PageHelperAspect pageHelperAspect() {
        return new PageHelperAspect();
    }

}
