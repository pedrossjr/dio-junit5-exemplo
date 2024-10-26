package br.com.github.pedrossjr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {

    @Test
    void validarAlgoSomenteNoUsuarioWillyan1() {
        Assumptions.assumeFalse("pedro".equals((System.getenv("USER"))));
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    void validarAlgoSomenteNoUsuarioWillyan2() {
        Assumptions.assumeTrue("pedro".equals((System.getenv("USER"))));
        Assertions.assertEquals(10, 5 + 5);
    }

}
