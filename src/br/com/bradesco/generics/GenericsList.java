package br.com.bradesco.generics;

import br.com.bradesco.caixaeletronico.model.Conta;

import java.util.ArrayList;
import java.util.List;

public class GenericsList {

    public static void main(String[] args) {
//
//       List lista = new ArrayList();
//       lista.add ("Elemento 1");
//       lista.add(1);
//       lista.add (new Conta());

        List <String> primos = new ArrayList<>();
        primos.add("Igor");
        primos.add("Bruno");
        primos.add("Lucas");

        primos.get(0);

        System.out.println(primos       );




    }
}
