package dev.rulex.auth.server.app;

import dev.rulex.auth.server.config.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(Config.class)
public class AuthServiceServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthServiceServerApplication.class, args);
    }

}
