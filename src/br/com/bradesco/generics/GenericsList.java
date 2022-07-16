package br.com.bradesco.generics;

import br.com.bradesco.caixaeletronico.model.Conta;

import java.util.ArrayList;
import java.util.List;


import br.com.bradesco.caixaeletronico.model.Conta;

import java.util.ArrayList;
import java.util.List;

public class GenericsList {

    public static void main(String[] args) {


        List <Integer> primos = new ArrayList(); // uso <> para travar o tipo que será minha variável
        primos.add(1);
        primos.add(2);
        primos.add(3);
        int numero = 0;
        numero = numero + primos.get(0); // não tem mais necessidade de colocar "(int)"


    }
}