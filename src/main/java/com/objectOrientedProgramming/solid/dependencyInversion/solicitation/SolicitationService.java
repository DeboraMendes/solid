package com.objectOrientedProgramming.solid.dependencyInversion.solicitation;


import com.objectOrientedProgramming.solid.dependencyInversion.message.MensageService;
import com.objectOrientedProgramming.solid.singleResponsibility.Message;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Representa a manutenção do pedido
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class SolicitationService {

    /**
     * A dependência é uma abstração, a mensagem poderia ser enviada por qualquer canal, whatsapp, e-mail, sms, etc
     */
    private final MensageService mensageService;

    /**
     * Responsável por salvar o pedido e em seguida enviar uma mensagem de confirmação
     *
     * @param solicitation pedido que deve ser salvo
     */
    public void save(Solicitation solicitation) {
        //primeiro salva o pedido, depois envia a mensagem de confirmação
        Message mensagem = new Message("pedido " + solicitation.getId() + " realizado com sucesso");
        mensageService.send(mensagem);
    }

}
