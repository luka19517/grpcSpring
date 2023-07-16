package dev.rulex.auth.server.service;

import dev.rulex.auth.server.domain.KorisnikEntity;
import dev.rulex.auth.server.domain.KorisnikRepository;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@GrpcService
public class MyServiceImpl extends AuthServiceGrpc.AuthServiceImplBase {

    @Autowired
    KorisnikRepository korisnikRepository;

    @Override
    public void authorize(AuthRequest helloRequest, StreamObserver<AuthResponse> responseObserver) {
        String username = helloRequest.getUsername();
        String password = helloRequest.getPassword();

        KorisnikEntity korisnik = korisnikRepository.findByUsername(username);
        String token = "invalid token";
        if (korisnik != null && korisnik.getPassword().equals(password)) {
            token = username + "&&" + password;
        }

        AuthResponse reply = AuthResponse.newBuilder()
                .setToken(token)
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
