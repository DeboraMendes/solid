package com.objectOrientedProgramming.solid.singleResponsibility;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Responsável por enviar a mensagem
 */
@Slf4j
@Service
public class MessageService {

    public void send(Message message) {
        log.info("mensagem enviada: " + message);
    }

}
