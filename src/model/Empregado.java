package model;

/**
 *
 * @author Giovane de Oliveira
 */
public class Empregado {
    private int codigoEmpregado;
    private String nomeEmpregado;
    private String setor;
    private double salarioBruto;
    private double recInss;
    
   public int getCodigoEmpregado (){
       return codigoEmpregado;
   }
   
   public String getNomeEmpregado (){
       return nomeEmpregado;
   }
   
   public double getRecInss (){
       return recInss;
   }
   
   public double getSalarioBruto (){
       return salarioBruto;
   }
   
   public String getSetor (){
       return setor;
   }
   
   public void setCodigoEmpregado (int codigoEmpregado){
       this.codigoEmpregado = codigoEmpregado;
   }
   
   public void setNomeEmpregado (String nomeEmpregado){
       this.nomeEmpregado = nomeEmpregado;
   }
   
   public void setRecInss (double recInss){
       this.recInss = recInss;
   }
   
   public void setSalarioBruto (double salarioBruto){
       this.salarioBruto = salarioBruto;
   }
   
   public void setSetor (String setor){
       this.setor = setor;
   }
  
}
