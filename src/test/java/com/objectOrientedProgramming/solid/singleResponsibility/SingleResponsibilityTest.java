package com.objectOrientedProgramming.solid.singleResponsibility;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * Single Responsibility — Responsabilidade Única:
 * Uma classe deve ter apenas uma responsabilidade.
 * Benefícios:
 * Teste — Uma classe com uma responsabilidade será mais fácil de testar.
 * Menor acoplamento — Menos funcionalidades em uma classe, menos dependências.
 * Organização — Classes menores e bem organizadas são mais fáceis de entender.
 */
@RunWith(MockitoJUnitRunner.class)
public class SingleResponsibilityTest {

    /**
     * Representa a classe que será testada.
     */
    @InjectMocks
    private MessageService messageService;

    /**
     * Representa a classe com a responsabilidade unica de definir o modelo da mensagem.
     */
    private Message message;

    /**
     * Mensagem criada.
     */
    @Before
    public void create() {
        message = new Message("1. Single Responsibility");
    }

    /**
     * Deve ser testado o envio da mensagem.
     * As responsabilidades de definir o modelo da mensagem e do envio da mensagem estão separados.
     */
    @Test
    public void test() {
        messageService.send(message);
    }

}