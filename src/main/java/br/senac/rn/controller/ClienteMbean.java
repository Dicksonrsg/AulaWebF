
package br.senac.rn.controller;

import br.senac.rn.dao.ClienteDAO;
import br.senac.rn.model.Cliente;
import br.senac.rn.model.Sexo;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class ClienteMbean {
    
    private Cliente cliente = new Cliente();
    private Sexo sexo = new Sexo();
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
 
    public String salvar(){
        ClienteDAO cdao = new ClienteDAO();
        if(cliente.getId() == 0){
            cliente.setSexo(sexo);
            cdao.insert(cliente);
        }else{
            cdao.update(cliente);
        }
        return null;
    }
    
    public List<Cliente> getClientes(){
        ClienteDAO cldao = new ClienteDAO();
        return cldao.selectAll();
    }
}
