package com.cmproject.dao;

/**
 * Created by tarcisio on 01/06/15.
 */

import com.cmproject.daoEntidades.Visitante;
import java.util.List;

public interface DAO {
    void atualizarVisitante(Visitante visitante) throws Exception;

    void excluirVisitante(Visitante visitante) throws Exception;

    Visitante procurarVisitante(Integer id) throws Exception;

    void salvarVisitante(Visitante visitante) throws Exception;

    List todosVisitantes() throws Exception;
}
