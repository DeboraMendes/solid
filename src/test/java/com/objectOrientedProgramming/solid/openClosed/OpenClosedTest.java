package com.objectOrientedProgramming.solid.openClosed;

import com.objectOrientedProgramming.solid.singleResponsibility.Message;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * Open/Closed — Aberto para Extensão, Fechado para Modificação:
 * As classes devem ser abertas para extensão, mas fechadas para modificação.
 * Benefício:
 * Menor bugs — Não modificar o código existente evita o aparecimento de novos bugs.
 */
@RunWith(MockitoJUnitRunner.class)
public class OpenClosedTest {

    /**
     * Representa a extenção, uma classe B que é um subtipo da classe A.
     */
    private EmailMessage emailMessage;

    /**
     * B é criado.
     */
    @Before
    public void create() {
        emailMessage = new EmailMessage(
                "2. Open/Closed",
                "remetente@email.com",
                "destinatario@email.com",
                "SOLID"
        );
    }

    /**
     * Deve ser testado se B é um subtipo de A.
     */
    @Test
    public void test() {
        Assert.assertTrue(emailMessage instanceof Message);
    }

}