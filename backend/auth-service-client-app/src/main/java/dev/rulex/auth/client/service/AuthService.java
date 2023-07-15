package dev.rulex.auth.client.service;


import dev.rulex.auth.server.service.AuthRequest;
import dev.rulex.auth.server.service.AuthServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @GrpcClient("auth-service")
    private AuthServiceGrpc.AuthServiceBlockingStub authServiceBlockingStub;

    public String authorize(String username, String password) {
        AuthRequest request = AuthRequest.newBuilder()
                .setUsername(username)
                .setPassword(password)
                .build();
        return authServiceBlockingStub.authorize(request).getToken();
    }

}
