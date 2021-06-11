package model;

import java.text.DecimalFormat;

/**
 *
 * @author Giovane de Oliveira
 */
public class ParametroINSS {
    
    //Formatar valores com duas casas decimais
    DecimalFormat decimalFormat = new DecimalFormat("0.00");
   

    public static final double FAIXA1 = 0.075;
    public static final double LIMITEFAIXA1 = 1100.00;
    public static final double FAIXA2 = 0.09;
    public static final double LIMITEFAIXA2 = 2203.48;
    public static final double FAIXA3 = 0.12;
    public static final double LIMITEFAIXA3 = 3305.22;
    public static final double FAIXA4 = 0.14;
    public static final double LIMITEFAIXA4 = 6433.57;
    
   public double calcularInss (double valor){
       
       //variável para cálculo do valor da contribuição
        double contribuicao = 0;
        
        /*variável contribuicao terá o valor incrementado de
        acordo com as regras da tabela de contribuição.
        */
        if (valor >= 0 && valor < LIMITEFAIXA1){
            contribuicao += valor * FAIXA1;
        }
        else if (valor >= LIMITEFAIXA1){
            contribuicao += LIMITEFAIXA1 * FAIXA1;
        }
        
        if (valor > LIMITEFAIXA1 && valor < LIMITEFAIXA2){
            contribuicao += (valor-LIMITEFAIXA1) * FAIXA2;
        }
        else if (valor >= LIMITEFAIXA2) {
            contribuicao += (LIMITEFAIXA2-LIMITEFAIXA1) * FAIXA2;
        }
        
        if (valor > LIMITEFAIXA2 && valor < LIMITEFAIXA3){
            contribuicao += (valor-LIMITEFAIXA2) * FAIXA3;
        }
        else if (valor >= LIMITEFAIXA3) {
            contribuicao += (LIMITEFAIXA3-LIMITEFAIXA2) * FAIXA3;
        }
        
        if (valor > LIMITEFAIXA3 && valor < LIMITEFAIXA4){
            contribuicao += (valor-LIMITEFAIXA3) * FAIXA4;
        }
        else if (valor >= LIMITEFAIXA4) {
            contribuicao += (LIMITEFAIXA4-LIMITEFAIXA3) * FAIXA4;
        }
        
        //String para aplicação da formatação que deixará 
        //a variável contribuição com apenas duas casas decimais
        String mascara = decimalFormat.format(contribuicao);
        return Double.parseDouble(mascara.replaceFirst(",", "."));
    }
    
}
