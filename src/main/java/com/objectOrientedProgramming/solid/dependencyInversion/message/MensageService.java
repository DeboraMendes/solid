package com.objectOrientedProgramming.solid.dependencyInversion.message;

import com.objectOrientedProgramming.solid.singleResponsibility.Message;

/**
 * Representa o contrato para o envio da mensagem, uma abstração
 */
public interface MensageService {

    void send(Message message);

}
