package main.list.OperacoeBasicas;

public class Item {

    private String nome;
    private double preco;
    private int qntd;

    public Item(String nome, double preco, int qntd) {
        this.nome = nome;
        this.preco = preco;
        this.qntd = qntd;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", qntd=" + qntd +
                '}';
    }

    public int getQntd() {
        return qntd;
    }



}