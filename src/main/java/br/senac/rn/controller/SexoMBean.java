package br.senac.rn.controller;

import br.senac.rn.dao.SexoDAO;
import br.senac.rn.model.Sexo;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class SexoMBean {
    
    private Sexo sexo = new Sexo();

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
    
    public String salvar(){
        SexoDAO dao = new SexoDAO();
        if(sexo.getId() ==0){
            dao.insert(sexo);
        }else{
            dao.update(sexo);
        }       
        sexo = new Sexo();
        return null;
    }

    public List<Sexo> getListaCompleta() {
        SexoDAO dao = new SexoDAO();
        return dao.selectAll();
    }

    public String excluir(Sexo sexo) {
        SexoDAO dao = new SexoDAO();
        dao.delete(sexo);
        return null;
    }
    
    public String editar(Sexo s) {
        SexoDAO dao = new SexoDAO();
        dao.update(s);
        sexo = new Sexo();
        return null;
    }
    
    public String selecionar(Sexo sexo){
        this.sexo = sexo;
        return null;
    }
}
