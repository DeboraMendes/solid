package com.objectOrientedProgramming.solid.dependencyInversion;

import com.objectOrientedProgramming.solid.dependencyInversion.message.MensageService;
import com.objectOrientedProgramming.solid.dependencyInversion.solicitation.Solicitation;
import com.objectOrientedProgramming.solid.dependencyInversion.solicitation.SolicitationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * Dependency Inversion — Inversão de Dependência:
 * Depender de abstrações como interfaces ou classes abstratas, ao invés de implementações das classes concretas.
 * Benefício:
 * Desaclopamento — Possibilita que a implementação seja alterada sem a necessidade de ajustar diversos pontos do código.
 */
@RunWith(MockitoJUnitRunner.class)
public class DependencyInversionTest {

    /**
     * Representa a classe que será testada.
     */
    @InjectMocks
    private SolicitationService solicitationService;

    /**
     * Representa a dependência.
     * A dependência é uma abstração, a mensagem poderia ser enviada por qualquer canal, whatsapp, e-mail, sms, etc.
     * Cada forma de envio, seria uma classe concreta, possui a sua própria implementação.
     */
    @Mock
    private MensageService mensageService;

    /**
     * Deve ser testado o envio da mensagem de confirmação após salvar o pedido.
     * O envio da mensagem não está acoplado a nenhum canal.
     * O canal de envio da mensagem pode ser alterado sem a necessidade de ajustar diversos pontos do código.
     */
    @Test
    public void test() {
        Solicitation solicitation = new Solicitation(1L);
        solicitationService.save(solicitation);
        Mockito.verify(mensageService, Mockito.times(1)).send(Mockito.any());
    }

}