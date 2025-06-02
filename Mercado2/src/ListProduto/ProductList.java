package ListProduto;

import javax.swing.*;

import Carrinho.*;

import java.util.Scanner;

public class ProductList {
    Scanner entrada = new Scanner(System.in);

    private Carrinho carrinho;

    public ProductList(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    String sku; // sku é um codigo que identifica unicamente o produto (vamos criar um conversão pro sku)
    String nome; // nome é
    double valor1;
    double valor2;
    String totalpagar;
        // getters e setters: Os
    // métodos GET e SET são técnicas padronizadas para gerenciamento sobre o acesso dos atributos.

    public void Listar1(){
        int Listar = 0;
        JOptionPane.showMessageDialog(null,
        "1 - Cheetos REQUEJÃO 115G R$ 04,50\r\n" + //
        "2 - Cheetos REQUEJÃO 280G R$ 08,50\r\n" + //
        "3 - Rufles Tradicional 115G R$ 05,50\r\n" + //
        "4 - Rufles Tradicional 280G R$ 10,50\r\n" + //
        "5 - Doritos Tradicional 115G R$ 06,00\r\n" + //
        "6 - Doritos Tradicional 280G R$ 12,50", null, Listar);
    }

    public String produtosEsco1() {
        System.out.println(" // Estes são nossos Produtos em estoque //");
        int esco1 = Integer.parseInt(JOptionPane.showInputDialog("""
                 1 - Cheetos REQUEJÃO 115G R$ 04,50
                 2 - Cheetos REQUEJÃO 280G R$ 08,50
                 3 - Rufles Tradicional 115G R$ 05,50
                 4 - Rufles Tradicional 280G R$ 10,50
                 5 - Doritos Tradicional 115G R$ 06,00
                 6 - Doritos Tradicional 280G R$ 12,50
                 """));
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("//# " +
                "Em qual quantidade você deseja comprar este item #//"));
        switch (esco1) {
            case 1 -> {
                double valor1 = quantidade * 4.5;
                carrinho.adicionarItem(new Item(1, "Cheetos REQUEIJÃO 115G", quantidade, 4.50));
                JOptionPane.showMessageDialog(null," Você quer comprar: " + quantidade + " Cheetos de 115g , isso vai dar um total de: " +
                valor1);
                carrinho.mostrarCarrinho();
            }
            case 2 -> {
                double valor1 = quantidade * 8.5;
                carrinho.adicionarItem(new Item(2, "Cheetos REQUEIJÃO 280G", quantidade, 8.50));
                JOptionPane.showMessageDialog(null," Você quer comprar: " + quantidade + " Cheetos de 280g , isso vai dar um total de: " +
                valor1);
                carrinho.mostrarCarrinho();
            }
            case 3 -> {
                double valor1 = quantidade * 5.5;
                
                JOptionPane.showMessageDialog(null," Você quer comprar: " + quantidade + " Rufles de 15g , isso vai dar um total de: " +
                valor1);carrinho.adicionarItem(new Item(1, "Rufles de 15g", quantidade, 5.50));
                carrinho.mostrarCarrinho();
            }
            case 4 -> {
                double valor1 = quantidade * 10.5;
                carrinho.adicionarItem(new Item(1, "Rufles de 280g", quantidade, 10.50));
                JOptionPane.showMessageDialog(null," Você quer comprar: " + quantidade + " Rufles de 280g , isso vai dar um total de: " +
                valor1);
                carrinho.mostrarCarrinho();
            }
            case 5 -> {
                double valor1 = quantidade * 6;
                carrinho.adicionarItem(new Item(1, "Doritos de 115g", quantidade, 6));
                JOptionPane.showMessageDialog(null," Você quer comprar: " + quantidade + " Doritos de 115g , isso vai dar um total de: " +
                valor1);
                carrinho.mostrarCarrinho();
                
            }
            case 6 -> {
                double valor1 = quantidade * 12.50;
                carrinho.adicionarItem(new Item(1, "Doritos de 280g", quantidade, 12.50));
                JOptionPane.showMessageDialog(null," Você quer comprar: " + quantidade + " Doritos de 280g , isso vai dar um total de: " +
                valor1);
                carrinho.mostrarCarrinho();
            }

        }

        return null;
    }

    public void Listar2(){
    int Listar = 0;
    JOptionPane.showMessageDialog(null,
    "1 - Sabonete Lux Botanicals 85 G Orquídea Negra R$ 02,50\r\n" + //
    "2 - Detergente Capim Limão 500 Ml - Ypê R$ 03,50\r\n" + //
    "3 - Sabão em pó Brilhante concentrado Limpeza Total 1,6 Kg R$ 22,50\r\n" + //
    "4 - Kit Dove Reconstrução Completa Shampoo + Condicionador 200ml R$ 27,50\r\n" + //
    "5 - Pomada Para Assaduras Babymed 45g R$ 06,00\r\n" + //
    "6 - Água Sanitaria YPÉ 5l R$ 12,25", null, Listar);
    }

    public String produtosEsco2() {
        System.out.println(" // Estes são nossos Produtos em estoque //");
        System.out.println("\n");

        int esco2 = Integer.parseInt(JOptionPane.showInputDialog("""
                 1 - Sabonete Lux Botanicals 85 G Orquídea Negra R$ 02,50
                 2 - Detergente Capim Limão 500 Ml - Ypê R$ 03,50
                 3 - Sabão em pó Brilhante concentrado Limpeza Total 1,6 Kg R$ 22,50
                 4 - Kit Dove Reconstrução Completa Shampoo + Condicionador 200ml R$ 27,50
                 5 - Pomada Para Assaduras Babymed 45g R$ 06,00
                 6 - Água Sanitaria YPÉ 5l R$ 12,25
                 """));
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("//# " +
                "Em qual quantidade você deseja comprar este item #//"));
        switch (esco2) {
            case 1 -> {
                double valor2 = quantidade * 2.5;
                carrinho.adicionarItem(new Item(1, "Sabonte Lux 85G", quantidade, 2.50));
                JOptionPane.showMessageDialog(null," Você quer comprar: " + quantidade + 
                " Sabonte Lux 85G , isso vai dar um total de: " +valor2);
                carrinho.mostrarCarrinho();

            }
            case 2 -> {
                double valor2 = quantidade * 3.5;
                carrinho.adicionarItem(new Item(1, "Detergente Ypé 500 ml", quantidade, 3.50));
                JOptionPane.showMessageDialog(null," Você quer comprar: " + quantidade +
                " Detergente Ypé 500 ml, isso vai dar um total de: " + valor2);    
                carrinho.mostrarCarrinho();

            }
            case 3 -> {
                double valor2 = quantidade * 22.5;
                carrinho.adicionarItem(new Item(1, "Sabão em Pó BRILHANTE 1,6 Kg", quantidade, 22.50));
                JOptionPane.showMessageDialog(null," Você quer comprar: " +  quantidade + 
                " Sabão em Pó BRILHANTE 1,6 Kg , isso vai dar um total de: " + valor2); 
                carrinho.mostrarCarrinho();      

            }
            case 4 -> {
                double valor2 = quantidade * 27.5;
                carrinho.adicionarItem(new Item(1, "Kit Dove", quantidade, 27.50));
                JOptionPane.showMessageDialog(null," Você quer comprar: " + quantidade + 
                " Kit Dove , isso vai dar um total de: " + valor2);
                carrinho.mostrarCarrinho();       

            }
            case 5 -> {
                double valor2 = quantidade * 6;
                carrinho.adicionarItem(new Item(1, " Pomada Babymede", quantidade, 6));
                JOptionPane.showMessageDialog(null," Você quer comprar: " + quantidade +
                " Pomada Babymed , isso vai dar um total de: " + valor2);
                carrinho.mostrarCarrinho(); 

            }
            case 6 -> {
                double valor2 = quantidade * 3.78;
                carrinho.adicionarItem(new Item(1, "Água Sanitaria YPÉ 2L", quantidade, 3.78));
                JOptionPane.showMessageDialog(null," Você quer comprar: " + quantidade + 
                " Água Sanitaria YPÉ , isso vai dar um total de: " + valor2); 
                carrinho.mostrarCarrinho();
    
            }


        }
        return null;

    }
}


