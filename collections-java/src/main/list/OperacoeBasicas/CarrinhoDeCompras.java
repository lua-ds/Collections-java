package main.list.OperacoeBasicas;

import java.util.ArrayList;
import java.util.List;


public class CarrinhoDeCompras {

    private List<Item> listaItem;

    private CarrinhoDeCompras() {
        this.listaItem = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int qntd) {
        Item item = new Item(nome, preco, qntd);
        this.listaItem.add(item);
    }

    public void removerItem(String nome) {
        List<Item> listaItemParaRemover = new ArrayList<>();
        if (!listaItem.isEmpty()) {
            for (Item i : listaItem) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    listaItemParaRemover.add(i);
                }
            }
            listaItem.removeAll(listaItemParaRemover);
        } else {
            System.out.println("A lista já está vazia");

        }

    }


    public double calcularValorTotal() {
        double valorTotal = 0d;
        for (Item item : listaItem) {
            double valorItem = item.getPreco() * item.getQntd();
            valorTotal += valorItem;

        }
        return valorTotal;
    }


    public void exibirItens(){
        System.out.println(this.listaItem);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Caneta" ,2d,5);
        carrinhoDeCompras.adicionarItem("Chuveiro" ,30d,1);
        carrinhoDeCompras.adicionarItem("Brinquedo" ,5d,5);
        carrinhoDeCompras.adicionarItem("Brinquedo" ,10d,3);


        carrinhoDeCompras.removerItem("brinquedo");

        carrinhoDeCompras.exibirItens();

        System.out.println(carrinhoDeCompras.calcularValorTotal());

    }


}






