package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itensList;

    public CarrinhoDeCompras() {
        this.itensList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itensList.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itensList.isEmpty()) {
            for (Item i : itensList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            itensList.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia.");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!itensList.isEmpty()) {
            for (Item item : itensList) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia.");
        }
    }

    public void exibirItens() {
        if (!itensList.isEmpty()) {
            System.out.println(this.itensList);
        } else {
            System.out.println("A lista está vazia.");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itensList=" + itensList +
                '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

       carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("Lápis");

        carrinhoDeCompras.exibirItens();

        System.out.println("O valor da compra é = " + carrinhoDeCompras.calcularValorTotal());

    }
}
