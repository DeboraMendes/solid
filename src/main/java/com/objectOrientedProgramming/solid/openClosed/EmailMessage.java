package com.objectOrientedProgramming.solid.openClosed;

import com.objectOrientedProgramming.solid.singleResponsibility.Message;
import lombok.Getter;

/**
 * Responsável por representar um tipo mais específico de mensagem, mensagem de e-mail
 */
@Getter
public class EmailMessage extends Message {

    private final String from;
    private final String to;
    private final String subject;

    public EmailMessage(String content,
                        String from,
                        String to,
                        String subject) {
        super(content);
        this.from = from;
        this.to = to;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "EmailMessage{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", subject='" + subject + '\'' +
                ", content='" + getContent() + '\'' +
                '}';
    }
}
