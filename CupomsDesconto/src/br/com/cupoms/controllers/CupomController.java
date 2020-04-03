
package br.com.cupoms.controllers;

import br.com.cupoms.DAO.DaoCupom;
import br.com.cupoms.entities.Cupom;


public class CupomController {
    public boolean adicionarCupom(Cupom cu){
    DaoCupom cuDao = new DaoCupom();
    return cuDao.add(cu);
    }
        
}
