package kr.co;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class ModuleGyeongnamApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModuleGyeongnamApiApplication.class, args);
    }
//ㅊㅊ
}
