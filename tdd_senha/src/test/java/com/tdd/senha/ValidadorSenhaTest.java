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

    @Test
    void deveRejeitarSenhaCurta() {
        ValidadorSenha validador = new ValidadorSenha();
        ResultadoValidacao resultado = validador.validar("Sen1!");
        
        assertFalse(resultado.isValido());
        assertTrue(resultado.getErros().contains("A senha deve ter pelo menos 8 caracteres"));
    }

    @Test
    void deveExigirPeloMenosDoisDigitos() {
        ValidadorSenha validador = new ValidadorSenha();
        ResultadoValidacao resultado = validador.validar("SenhaFort!"); // Apenas 0 dígitos
        
        assertFalse(resultado.isValido());
        assertTrue(resultado.getErros().contains("A senha deve conter pelo menos 2 dígitos"));
    
}