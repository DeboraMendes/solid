package com.objectOrientedProgramming.solid.liskovSubstitution;

import com.objectOrientedProgramming.solid.openClosed.EmailMessage;
import com.objectOrientedProgramming.solid.singleResponsibility.Message;
import com.objectOrientedProgramming.solid.singleResponsibility.MessageService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * Liskov Substitution — Substituição de Liskov:
 * Se a classe B for um subtipo da classe A, deve ser possível de substituir A por B, sem interromper o comportamento do programa.
 * Benefício:
 * Hierarquia em conformidade — Garante que a modelagem da hierarquia está correta.
 */
@RunWith(MockitoJUnitRunner.class)
public class LiskovSubtitutionTest {

    /**
     * Representa a classe que será testada.
     */
    @InjectMocks
    private MessageService messageService;

    /**
     * Representa a classe A.
     */
    private Message message;

    /**
     * Representa a classe B, um subtipo de A.
     */
    private EmailMessage emailMessage;

    /**
     * A e B são criados.
     */
    @Before
    public void create() {
        message = new Message(
                "2. Open/Closed"
        );
        emailMessage = new EmailMessage(
                "2. Open/Closed",
                "remetente@email.com",
                "destinatario@email.com",
                "SOLID"
        );
    }

    /**
     * Deve ser testado o conteúdo e o envio da mensagem.
     * É possível substituir A por B, sem interromper o comportamento do programa.
     */
    @Test
    public void test() {
        messageService.send(message);
        Assert.assertEquals("2. Open/Closed", message.getContent());
        messageService.send(emailMessage);
        Assert.assertEquals("2. Open/Closed", emailMessage.getContent());
    }

}