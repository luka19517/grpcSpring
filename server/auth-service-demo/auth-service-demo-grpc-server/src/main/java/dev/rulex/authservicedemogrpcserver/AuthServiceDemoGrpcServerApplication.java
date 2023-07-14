package dev.rulex.authservicedemogrpcserver;

import dev.rulex.authservice.server.config.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(Config.class)
public class AuthServiceDemoGrpcServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthServiceDemoGrpcServerApplication.class, args);
    }

}
