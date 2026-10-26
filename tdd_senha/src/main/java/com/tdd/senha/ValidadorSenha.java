package com.tdd.senha;

import java.util.ArrayList;

public class ValidadorSenha {

    public ResultadoValidacao validar(String senha) {
        return new ResultadoValidacao(true, new ArrayList<>());
    }
}