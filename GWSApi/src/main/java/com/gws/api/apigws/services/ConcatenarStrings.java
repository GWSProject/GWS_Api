package com.gws.api.apigws.services;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.StringJoiner;

@Service
public class ConcatenarStrings {

    public String juntarStrings(List<String> minhasStrings) throws IOException {

            // Usando StringJoiner
            StringJoiner joiner = new StringJoiner(", ");
            for (String str : minhasStrings) {
                joiner.add(str);
            }

            // Obtendo a string resultante
            String resultado = joiner.toString();

            // Imprimindo o resultado
            return resultado;
    }


}
