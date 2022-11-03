import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

/*
 * Classe principal
 * Classe que cria e recebe os dados princiapis, sendo eles:
 *      -> A janela de interação;
 *      -> os métodos de interação;
 *      -> e mostra a soma da compra total dentro da barbearia
 *      -> Calcula o valor total a ser pago dentro do estabelecimento;
 */


public class Cliente {

    private String name;
    private double valorConta;
    private double bebida;
    private double cabelo;
    
    private double barba;
    private double produto;

    
    public void insertDatas() {
        JOptionPane.showMessageDialog(null, "CARDAPIO");
        this.name = JOptionPane.showInputDialog("Nome: ");
        this.bebida = Double.parseDouble(JOptionPane.showInputDialog("Bebida: "));
        this.produto = Double.parseDouble(JOptionPane.showInputDialog("produto: "));
        this.barba = Double.parseDouble(JOptionPane.showInputDialog("Barba: "));
        this.cabelo = Double.parseDouble(JOptionPane.showInputDialog("Cabelo: "));
        // this.valorConta = Double.parseDouble(JOptionPane.showInputDialog("Custo: "));

    }

    public void show(){
        
        String mensagem = "Objeto Celular criado a partir da Classe Produto \n";
		mensagem += "\nNome do cliente: " + this.getName();
		mensagem += "\nBebida escolhida: " + this.getBebida();
		mensagem += "\nProduto escolhido: " + this.getProduto();
		mensagem += "\nBarba escolhida: " + this.getBarba();
		mensagem += "\nCabelo escolhido: " + this.getCabelo();
		NumberFormat formatar = DecimalFormat.getCurrencyInstance();
		mensagem += "\nValor da Conta: " + formatar.format(contaSomada(this.valorConta));
		
		
		JOptionPane.showMessageDialog(null, mensagem);
    }
    
    
    public String getName() {
        return name;
    }
    
    
    public void setName(String name) {
        this.name = name;
    }


    public double getValorConta() {
        return valorConta;
    }

    
    public void setValorConta(double valorConta) {
        this.valorConta = valorConta;
    }
    
    
    public double getBebida() {
        return bebida;
    }
    
    
    public void setBebida(double bebida) {
        this.bebida = bebida;
    }
    
    
    public double getCabelo() {
        return cabelo;
    }
    
    public void setCabelo(double cabelo) {
        this.cabelo = cabelo;
    }

    public double getBarba() {
        return barba;
    }


    public void setBarba(double barba) {
        this.barba = barba;
    }


    public double getProduto() {
        return produto;
    }


    public void setProduto(double produto) {
        this.produto = produto;
    }


    public double contaSomada(double valor) {
        this.valorConta += this.getBarba() + this.getProduto() + this.getCabelo() + this.getBebida();
        return this.valorConta;
    }

}