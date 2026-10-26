package com.tdd.senha;

import java.util.ArrayList;
import java.util.List;

public class ValidadorSenha {

    public ResultadoValidacao validar(String senha) {
        List<String> erros = new ArrayList<>();

        if (senha == null || senha.length() < 8) {
            erros.add("A senha deve ter pelo menos 8 caracteres");
        }

        boolean valido = erros.isEmpty();
        return new ResultadoValidacao(valido, erros);
    }
}