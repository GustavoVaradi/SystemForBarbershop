/*
 * Classe filha que recebe os dados da principal, no caso, Cliente
 * 
 *  cria-se métodos para receber o valor da barba.
 * 
 *  é criado tambem um método para somar tudo que foi gasto dentro da classe, para 
 *  poder enviar como parâmetro para a classe override, contaSomada
 * 
 * recebe uma sobre-escrita (override) que vai entregar o valor gasto dentro
 *  da classe Barba, enviando para o cliente o que foi gasto
 */

public class Barba extends Cliente {
    
    private double valorBarba;

    public double getValorBarba() {
        return valorBarba;
    }

    public void setValorBarba(double valor) {
        this.valorBarba = valor;
    }

    @Override
    public double contaSomada(double valor){
        return super.contaSomada(somaTotalBarba());
    }

    public double somaTotalBarba() {
        return (getValorBarba()); 
    }
    
}