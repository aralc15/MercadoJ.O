package Carrinho;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Carrinho.Item;
import utlis.utils;

public class carrinho {
    private List<Item> items;

    public carrinho() {
        items = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
    items.add(item);
}


    public void mostrarCarrinho() {
    if (items.isEmpty()) {
        JOptionPane.showMessageDialog(null, "O carrinho está vazio.");
        return;
    }

    StringBuilder sb = new StringBuilder("Itens no Carrinho:\n\n");
    double totalGeral = 0;

    for (Item item : items) {
        sb.append(item.getNome())  // certifique-se de que há um método getNome() na classe Item
          .append(" - Quantidade: ").append(item.getQuantidade())
          .append(" - Total: R$ ").append(utils.Utils.doubleToString(item.getTotal()))
          .append("\n");
        totalGeral += item.getTotal();
    }

    sb.append("\nTotal Geral: R$ ").append(utils.Utils.doubleToString(totalGeral));
    JOptionPane.showMessageDialog(null, sb.toString());
}
    


    
}
