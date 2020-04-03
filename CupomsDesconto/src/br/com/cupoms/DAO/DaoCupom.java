package br.com.cupoms.DAO;

import br.com.cupoms.entities.Cupom;
import br.com.cupoms.entities.Entitie;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoCupom extends DAO implements DaoFunctions {

    @Override
    public boolean add(Entitie entitie) {
        Cupom cu = (Cupom) entitie;
        String comando = "insert into cupom (descricao,numPontos) values (?,?)";
        try{
            this.conectar();
            this.stmt = this.conn.prepareStatement(comando);
            this.stmt.setString(1,cu.getDescricao());
            this.stmt.setInt(2,cu.getNumPontos());
            this.stmt.execute();
        }catch(SQLException ex){
            System.out.println("Erro oa inserir Cupom"+ex.getMessage());
            return false;
        }
        finally{
            try {
                this.conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return true;
        
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Entitie entitie) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Entitie find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Entitie> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  


    
}
