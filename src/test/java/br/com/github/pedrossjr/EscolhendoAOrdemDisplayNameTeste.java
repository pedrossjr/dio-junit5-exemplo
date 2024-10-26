package br.com.github.pedrossjr;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class EscolhendoAOrdemDisplayNameTeste {

    @DisplayName("Teste que valida se o usuário foi criado")
    @Test
    void validaFluxoA(){
        Assertions.assertTrue(true);
    }

    @DisplayName("B")
    @Test
    void validaFluxoB(){
        Assertions.assertTrue(true);
    }

    @DisplayName("C")
    @Test
    void validaFluxoC(){
        Assertions.assertTrue(true);
    }

    @Test
    @DisplayName("D")
    void validaFluxoD(){
        Assertions.assertTrue(true);
    }
}

