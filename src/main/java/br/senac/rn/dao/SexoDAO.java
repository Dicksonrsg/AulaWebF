package br.senac.rn.dao;

import br.senac.rn.model.Sexo;

public class SexoDAO extends GenericDAO<Sexo> {

    @Override
    public Class<Sexo> getClassType() {
        return Sexo.class;
    }
    
    
    
}
