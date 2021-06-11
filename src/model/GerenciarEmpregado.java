package model;

import java.util.ArrayList;

/**
 *
 * @author Giovane de Oliveira
 */
public class GerenciarEmpregado {
    
    //coleção de empregados
    static ArrayList<Empregado> listaEmpregados = new ArrayList();
    
    
    //Adiciona um empregado na coleção de empregados
    public boolean adicionarEmpregado(Empregado e){
        if (e.getCodigoEmpregado() == 0){
            return false;
        }
        else {
            listaEmpregados.add(e);
            return true;
        }        
    }
    
    //Devolve a lista de empregados
    public ArrayList<Empregado> listaDeEmpregados(){
        return listaEmpregados;
    }
    
    //Remove um empregado da coleção de empregados
    public boolean removerEmpregado (Empregado e){
        
        if (verificarExistencia(e)){
            try {
            listaEmpregados.remove(e);
            return true;
            }
            catch(Exception exc){
                return false;
            }
        }
        else {
            return false;
        }
    }
       
    //Verifica a existência de um empregado
    private boolean verificarExistencia (Empregado e){
        
        for(int i = 0; i < listaEmpregados.size(); i ++){
            if(listaEmpregados.get(i).getCodigoEmpregado() == e.getCodigoEmpregado()){
                return true;
            }
        }
        
        return false;
    }
    
    //Seleciona um empregado apenas pelo código
    public Empregado selecionarEmpregado (int codigo){
        for(int i = 0; i < listaEmpregados.size(); i ++){
            if(listaEmpregados.get(i).getCodigoEmpregado() == codigo){
                return listaEmpregados.get(i);
            }
        }
        return null;
    }
}
