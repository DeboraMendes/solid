package com.objectOrientedProgramming.solid.singleResponsibility;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * Representa uma mensagem
 */
@Getter
@ToString
@AllArgsConstructor
public class Message {

    private final String content;

}
