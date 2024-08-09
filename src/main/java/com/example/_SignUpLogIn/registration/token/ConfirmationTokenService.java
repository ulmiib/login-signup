package com.example._SignUpLogIn.registration.token;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
@Getter
@Setter
@Repository
public class ConfirmationTokenService {
    private ConfirmationTokenRepository confirmationTokenRepository;

    public String confirmedAt;

    public void saveConfirmationToken(ConfirmationToken token) {
        confirmationTokenRepository.save(token);
    }


}
