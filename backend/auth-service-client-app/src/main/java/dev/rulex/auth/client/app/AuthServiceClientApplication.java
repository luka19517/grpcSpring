package dev.rulex.auth.client.app;

import dev.rulex.auth.client.config.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(Config.class)
@SpringBootApplication
public class AuthServiceClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthServiceClientApplication.class, args);
    }

}
