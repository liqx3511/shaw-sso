package com.show;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 *
 * @author liqingxiao
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ShowApplication {
    public static void main(String[] args) {
        System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(ShowApplication.class, args);
        System.out.println("=====================================Start-up Success=====================================");
    }
}
