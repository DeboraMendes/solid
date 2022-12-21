package com.objectOrientedProgramming.solid.interfaceSegregation;

import com.objectOrientedProgramming.solid.interfaceSegregation.model.Cat;
import com.objectOrientedProgramming.solid.interfaceSegregation.model.Fish;
import com.objectOrientedProgramming.solid.interfaceSegregation.model.Snake;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * Interface Segregation — Segregação de Interface:
 * Interfaces maiores devem ser divididas em menores.
 * Benefício:
 * Implementações especializadas — Classes de implementação só precisam se preocupar com os métodos que são do seu interesse.
 */
@RunWith(MockitoJUnitRunner.class)
public class InterfaceSegregationTest {

    /**
     * Deve ser testado o comportamento de cada animal.
     * A cobra rasteja e faz ssssss.
     * O gato anda e faz miaaauuuu.
     * O Peixe nada e não emite som.
     * Os comportamentos para mover-se e emitir som estão separados.
     */
    @Test
    public void test() {
        Snake snake = new Snake();
        Assert.assertEquals("rastejar", snake.move());
        Assert.assertEquals("ssssss", snake.emit());

        Cat cat = new Cat();
        Assert.assertEquals("andar", cat.move());
        Assert.assertEquals("miaaauuuu", cat.emit());

        Fish fish = new Fish();
        Assert.assertEquals("nadar", fish.move());
        //o peixe não emite som
    }

}