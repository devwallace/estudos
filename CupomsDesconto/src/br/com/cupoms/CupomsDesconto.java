
package br.com.cupoms;

import br.com.cupoms.controllers.CupomController;
import br.com.cupoms.controllers.UsuarioController;
import br.com.cupoms.entities.Cupom;
import br.com.cupoms.entities.Usuario;


public class CupomsDesconto {


    public static void main(String[] args) {
        Usuario user = new Usuario();
        user.setNome("Renato");
        user.setCpf("12345678910");
        
        Cupom cup =  new Cupom();
        cup.setCodCupom(123);
        cup.setDescricao("Este cupom é uma merda");

       UsuarioController usuCon = new UsuarioController();
       usuCon.adicionarUsuario(user);
       
       CupomController cuCon = new CupomController();
       cuCon.adicionarCupom(cup);
      
       UsuarioController usCon = new UsuarioController ();
       usCon.deletarUsuario(6267);

    }
    
}
