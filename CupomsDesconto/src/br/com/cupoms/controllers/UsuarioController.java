
package br.com.cupoms.controllers;

import br.com.cupoms.DAO.DaoUsuario;
import br.com.cupoms.entities.Usuario;


public class UsuarioController {
    public boolean adicionarUsuario (Usuario usu){     
        DaoUsuario usuDao = new DaoUsuario();
        return usuDao.add(usu);
    }
    
    public boolean deletarUsuario (int id) {
    	DaoUsuario usuDaoDl = new DaoUsuario();
    	return usuDaoDl.delete(id);
    }
    
}
