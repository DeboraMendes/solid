package com.objectOrientedProgramming.solid.dependencyInversion.message;

import com.objectOrientedProgramming.solid.singleResponsibility.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Representa o envio da mensagem via e-mail, uma implementação
 */
@Slf4j
@Service
public class EmailMensageService implements MensageService {


    @Override
    public void send(Message message) {
        log.info("mensagem enviada por e-mail: " + message);
    }

}
