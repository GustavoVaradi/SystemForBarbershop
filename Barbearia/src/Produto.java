/*
 *  Classe filha que recebe os dados da principal, no caso, Cliente
 * 
 *  cria-se métodos para receber os valores de shampoo, condicionador, mascara e òleo reparador.
 * 
 *  é criado tambem um método para somar tudo que foi gasto dentro da classe, para 
 *  poder enviar como parâmetro para a classe override, contaSomada
 * 
 *  recebe uma sobre-escrita (override) que vai entregar o valor gasto dentro
 *  da classe Produto, enviando para o cliente o que foi gasto
 */

public class Produto extends Cliente {

    private double shampoo;
    private double condicionador;
    private double mascara;
    private double oleoReparador;


    public double getShampoo() {
        return shampoo;
    }

    public void setShampoo(double shampoo) {
        this.shampoo = shampoo;
    }

    public double getCondicionador() {
        return condicionador;
    }

    public void setCondicionador(double condicionador) {
        this.condicionador = condicionador;
    }

    public double getMascara() {
        return mascara;
    }

    public void setMascara(double mascara) {
        this.mascara = mascara;
    }

    public double getOleoReparador() {
        return oleoReparador;
    }

    public void setOleoReparador(double oleoReparador) {
        this.oleoReparador = oleoReparador;
    }

    public double somaTotalProdutos() {
        return (getCondicionador() + getMascara() + getOleoReparador() + getShampoo()); 
    }

    @Override
    public double contaSomada(double valor){
        return super.contaSomada(somaTotalProdutos());
    }
    
}
