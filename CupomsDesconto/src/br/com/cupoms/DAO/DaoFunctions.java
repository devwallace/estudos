package br.com.cupoms.DAO;

import br.com.cupoms.entities.Entitie;
import java.util.List;

public interface DaoFunctions {

    public boolean add(Entitie entitie);

    public boolean delete(int id);

    public boolean update(Entitie entitie);

    public Entitie find(int id);

    public List<Entitie> findAll();

}
