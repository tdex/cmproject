package com.cmproject.dao;

/**
 * Created by tarcisio on 01/06/15.
 */

import com.cmproject.daoEntidades.Visitante;
import com.cmproject.conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class VisitanteDAOImp implements DAO{
    private Connection conn;

    public VisitanteDAOImp()throws Exception{
        try {
            this.conn = Conexao.getConnection();
        }catch (Exception e){
            throw new Exception("Erro: "+"\n"+e.getMessage());
        }
    }


    @Override
    public void atualizarVisitante(Visitante visitante) throws Exception {

    }

    @Override
    public void excluirVisitante(Visitante visitante) throws Exception {

    }

    @Override
    public Visitante procurarVisitante(Integer id) throws Exception {
        return null;
    }

    @Override
    public void salvarVisitante(Visitante visitante) throws Exception {
        PreparedStatement ps = null;
        Connection conn = null;
        if (visitante == null)throw new Exception("O valor passado não pode ser nulo");

        try{
            String sql = "INSERT INTO Visitante (nome, telefone, email, senha, endereco)"+"values(?,?,?,?,?)";
            conn = this.conn;
            ps = conn.prepareStatement(sql);
            ps.setString(1, visitante.getName());
            ps.setString(2, visitante.getTelefone());
            ps.setString(3, visitante.getEmail());
            ps.setString(4, visitante.getSenha());
            ps.setString(5, visitante.getEndereco());

            ps.executeUpdate();
        } catch (SQLException sqle){
            throw new Exception("Erro ao inserir dados "+ sqle);
        } finally {
            Conexao.closeConnection(conn, ps);
        }
    }

    @Override
    public List todosVisitantes() throws Exception {
        return null;
    }
}
