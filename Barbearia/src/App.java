/*
 *  Classe onde irá rodar todo o código, onde chamaremos a classe principal, chamada
 *  'Cliente', e iremos mostrar a funcionalidade total dele.
 * 
 *  Foi colocado exemplos chamando classe a classe, sem a necessidade do cliente (classe cuja
 *  função é ter a interação gráfica e ágil de todo o sistema, com o conjunto de resultado final
 *  sem a necessidade de chamar classe a classe).
 * 
 */

public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();
        cliente.insertDatas();
        cliente.show();

        Cabelo clienteCabelo = new Cabelo();
        clienteCabelo.setCorte(50.50);
        clienteCabelo.setPintar(79.99);
        
        System.out.println("Valor total de Cabelereiro: " + clienteCabelo.somaTotalCabelo());

        Produto clienteProduto = new Produto();
        clienteProduto.setShampoo(56.89);
        clienteProduto.setCondicionador(57.89);
        clienteProduto.setOleoReparador(15.55);

        System.out.println("Valor total de produtos: " + clienteProduto.somaTotalProdutos());

        Bebida clienteBebida = new Bebida();
        clienteBebida.setRefrigerante(8.99);
        clienteBebida.setAgua(5.49);
        clienteBebida.setCerveja(11.99);
        clienteBebida.setCafe(0);

        System.out.println("Valor total de Bebidas: " + clienteBebida.somaTotalBebida());
        
        Barba clienteBarba = new Barba();
        clienteBarba.setValorBarba(59.99);

        System.out.println("Valor total da Barbearia: " + clienteBarba.somaTotalBarba());



    }
}
