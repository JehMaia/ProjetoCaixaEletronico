
package br.com.bradesco.caixaeletronico.Repository;

import java.util.List;

public interface BaseRepository <T> {

    List<T> findAll();

    T findById(int id);

    void adiciona (T Objeto) ;

   }
