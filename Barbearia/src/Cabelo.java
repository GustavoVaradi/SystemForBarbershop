/*
 * Classe filha que recebe os dados da principal, no caso, Cliente
 * 
 *  Cria-se dois métodos, corte e pintar, servem para sinalizar o que pode ser 
 *  feito dentro da barbearia
 * 
 *  é criado tambem um método para somar tudo que foi gasto dentro da classe, para 
 *  poder enviar como parâmetro para a classe override, contaSomada
 * 
 *  recebe uma sobre-escrita (override) que vai entregar o valor gasto dentro
 *  da classe Cabelo, enviando para o cliente o que foi gasto
 */


public class Cabelo extends Cliente {

    private double corte;
    private double pintar;

    public double getCorte() {
        return corte;
    }

    public void setCorte(double corte) {
        this.corte = corte;
    }

    public double getPintar() {
        return pintar;
    }
    public void setPintar(double pintar) {
        this.pintar = pintar;
    }

    @Override
    public double contaSomada(double valor){
        return super.contaSomada(somaTotalCabelo());
    }

    public double somaTotalCabelo() {
        return (getCorte() + getPintar()); 
    }
    
}
