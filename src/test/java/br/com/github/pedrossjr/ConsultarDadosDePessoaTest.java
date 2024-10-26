package br.com.github.pedrossjr;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class ConsultarDadosDePessoaTest {

    @BeforeAll
    static void configuraConexao (){
        BancoDeDados.iniciarConexao();;
        System.out.println("Rodou configuraConexao ");
    }

    @BeforeEach
    void insereDadosParaTeste() {
        BancoDeDados.insereDados(new Pessoa("João", LocalDate.of(2000,1,1)));
    }

    @AfterEach
    void removeDadosDoTeste() {
        BancoDeDados.removeDados(new Pessoa("João", LocalDate.of(2000,1,1)));
    }

    @Test
    void validarDadosDeRetorno() {
        Assertions.assertTrue(true);
    }

    @Test
    void validarDadosDeRetorno2() {
        Assertions.assertNull(null);
    }

    @AfterAll
    static void finalizarConexao (){
        BancoDeDados.iniciarConexao();;
        System.out.println("Rodou finalizarConexao ");
    }
}
