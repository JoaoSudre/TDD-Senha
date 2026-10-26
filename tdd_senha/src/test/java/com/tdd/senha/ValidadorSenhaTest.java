package com.tdd.senha;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ValidadorSenhaTest {

    @Test
    void deveAceitarSenhaValida() {
        ValidadorSenha validador = new ValidadorSenha();
        ResultadoValidacao resultado = validador.validar("Senha123!");
        
        assertTrue(resultado.isValido());
        assertTrue(resultado.getErros().isEmpty());
    }
}