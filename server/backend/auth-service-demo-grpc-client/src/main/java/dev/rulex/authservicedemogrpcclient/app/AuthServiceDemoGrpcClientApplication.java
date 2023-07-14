package dev.rulex.authservicedemogrpcclient.app;

import dev.rulex.authservicedemogrpcclient.config.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(Config.class)
@SpringBootApplication
public class AuthServiceDemoGrpcClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthServiceDemoGrpcClientApplication.class, args);
    }

}
