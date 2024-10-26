package br.com.github.pedrossjr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {

    @Test
    void validarCenarioDeExcecaoNaTransferencia1() {
        Conta contaOrigem = new Conta ("123456",0);
        Conta contaDestino = new Conta ("523456",100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, () ->
                transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1)
                );
    }

    @Test
    void validarCenarioDeExcecaoNaTransferencia2() {
        Conta contaOrigem = new Conta ("123456",0);
        Conta contaDestino = new Conta ("523456",100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertDoesNotThrow(() ->
                transferenciaEntreContas.transfere(contaOrigem, contaDestino, 20)
        );
    }
}
