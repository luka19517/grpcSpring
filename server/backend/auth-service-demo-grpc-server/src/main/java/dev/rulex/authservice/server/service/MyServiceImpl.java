package dev.rulex.authservice.server.service;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.stereotype.Service;

@Service
@GrpcService
public class MyServiceImpl extends AuthServiceGrpc.AuthServiceImplBase {

    @Override
    public void authorize(AuthRequest helloRequest, StreamObserver<AuthResponse> responseObserver) {
        AuthResponse reply = AuthResponse.newBuilder()
                .setToken(helloRequest.getUsername() + "-" + helloRequest.getPassword())
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
