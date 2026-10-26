package com.tdd.senha;

import java.util.ArrayList;
import java.util.List;

public class ValidadorSenha {

    public ResultadoValidacao validar(String senha) {
        List<String> erros = new ArrayList<>();

        if (senha == null || senha.length() < 8) {
            erros.add("A senha deve ter pelo menos 8 caracteres");
        }

        long quantidadeDigitos = senha != null ? senha.chars().filter(Character::isDigit).count() : 0;
        if (quantidadeDigitos < 2) {
            erros.add("A senha deve conter pelo menos 2 dígitos");
        }

        boolean valido = erros.isEmpty();
        return new ResultadoValidacao(valido, erros);
    }
}