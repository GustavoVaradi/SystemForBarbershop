/*
 *  Classe filha que recebe os dados da principal, no caso, Cliente
 * 
 *  cria-se métodos para receber os valores de refrigerante, água, cerveja e café.
 * 
 *  é criado tambem um método para somar tudo que foi gasto dentro da classe, para 
 *  poder enviar como parâmetro para a classe override, contaSomada
 * 
 *  recebe uma sobre-escrita (override) que vai entregar o valor gasto dentro
 *  da classe Bebida, enviando para o cliente o que foi gasto
 */

public class Bebida extends Cliente {

    private double refrigerante;
    private double agua;
    private double cerveja;
    private double cafe;

    public double getRefrigerante() {
        return this.refrigerante;
    }
    public void setRefrigerante(double refrigerante ) {
        this.refrigerante = refrigerante;
    }
    public double getAgua() {
        return agua;
    }
    public void setAgua(double agua) {
        this.agua = agua;
    }
    public double getCerveja() {
        return cerveja;
    }
    public void setCerveja(double cerveja) {
        this.cerveja = cerveja;
    }
    public double getCafe() {
        return cafe;
    }
    public void setCafe(double cafe) {
        this.cafe = cafe;
    }

    @Override
    public double contaSomada(double valor){
        return super.contaSomada(somaTotalBebida());
    }

    public double somaTotalBebida() {
        return (getCafe() + getCerveja() + getAgua() + getRefrigerante()); 
    }

    
}
