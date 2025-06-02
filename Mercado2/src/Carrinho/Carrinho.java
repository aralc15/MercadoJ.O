package Carrinho;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import utlis.utils;

public class Carrinho {  // Nome de classe deve começar com maiúscula
    private List<Item> items;

    public Carrinho() {  // Construtor com maiúscula
        items = new ArrayList<>();
    }

    public void adicionarItem(Item item) {  // Corrigido nome do método e tipo do parâmetro
        items.add(item);
    }

    public void mostrarCarrinho(){
        if (items.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O carrinho está vazio.");
            return;
        }
        StringBuilder sb = new StringBuilder("Items no Carrinho:\n\n");
        double totalGeral = 0;

        for (Item item : items) {
            sb.append(item.getNome())
          .append(" - Quantidade: ").append(item.getQuantidade())
          .append(" - Total: R$ ").append(utils.doubleToString(item.getTotal()))
          .append("\n");
        totalGeral += item.getTotal();
        }

        sb.append("\nTotal Geral: R$ ").append(utils.doubleToString(totalGeral));
        JOptionPane.showMessageDialog(null, sb.toString());
        
    }

    
}
