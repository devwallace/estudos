
package br.com.cupoms.DAO;

import br.com.cupoms.entities.Entitie;
import br.com.cupoms.entities.Usuario;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoUsuario extends DAO implements DaoFunctions{

    @Override
    public boolean add(Entitie entitie) {
        Usuario usu = (Usuario) entitie;
        String comando = "insert into usuario (nome,cpf) values (?,?)";
        try{
            this.conectar();
            this.stmt = this.conn.prepareStatement(comando);
            this.stmt.setString(1,usu.getNome());
            this.stmt.setString(2, usu.getCpf());
            this.stmt.execute();
        }catch(SQLException ex){
            System.out.println("Erro oa inserir Usuario"+ex.getMessage());
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
    	String comando = "delete from usuario where id =? ";
    		try {
    			this.conectar();
    			this.stmt = this.conn.prepareStatement(comando);
    			this.stmt.setInt(1, id);
    			this.stmt.execute();
    		}catch(SQLException ex) {
    			System.out.println("Erro ao deletar usuario"+ex.getMessage());
    			return false;
    			
    		}
    		return true;

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
