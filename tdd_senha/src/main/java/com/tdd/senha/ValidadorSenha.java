package com.tdd.senha;

import java.util.ArrayList;
import java.util.List;

public class ValidadorSenha {

    public ResultadoValidacao validar(String senha) {
        List<String> erros = new ArrayList<>();

        // Regra 1: Mínimo de 8 caracteres
        if (senha == null || senha.length() < 8) {
            erros.add("A senha deve ter pelo menos 8 caracteres");
        }

        // Regra 2: Mínimo de 2 dígitos
        long quantidadeDigitos = senha != null ? senha.chars().filter(Character::isDigit).count() : 0;
        if (quantidadeDigitos < 2) {
            erros.add("A senha deve conter pelo menos 2 dígitos");
        }

        // Regra 3: Mínimo de uma letra maiúscula
        boolean temMaiuscula = senha != null && senha.chars().anyMatch(Character::isUpperCase);
        if (!temMaiuscula) {
            erros.add("A senha deve conter pelo menos uma letra maiuscula");
        }

        // Regra 4: Mínimo de um caractere especial
        boolean temEspecial = senha != null && senha.chars().anyMatch(ch -> !Character.isLetterOrDigit(ch));
        if (!temEspecial) {
            erros.add("A senha deve conter pelo menos um caractere especial");
        }

        boolean valido = erros.isEmpty();
        return new ResultadoValidacao(valido, erros);
    }
}