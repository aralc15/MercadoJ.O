package Carrinho;

import java.util.List;

public class Item {
    int esco1;
    String nome;
    int quantidade;
    double precoUnitario;
    double total;

    // Construtor
    public Item(int esco1, String nome, int quantidade, double precoUnitario) {
    this.esco1 = esco1;
    this.nome = nome;
    this.quantidade = quantidade;
    this.precoUnitario = precoUnitario;
    this.total = quantidade * precoUnitario;
}

public String getNome() {
    return nome;
}

public int getQuantidade() {
    return quantidade;
}

public double getPrecoUnitario() {
    return precoUnitario;
}

public double getTotal() {
    return total;
}
    // Método para exibir os detalhes do item
   public String exibirItem() {
    return nome + " - Quantidade: " + quantidade + ", Total: R$ " + total;
}


   public void add(List<Item> items) {
    throw new UnsupportedOperationException("Unimplemented method 'add'");
   }
}
