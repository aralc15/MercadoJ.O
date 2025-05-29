package main;

import modelo.Produto;
import ListProduto.ProductList;
import Carrinho.*;


import javax.swing.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Mercado {
    Scanner entrada = new Scanner(System.in);
    static ArrayList<Produto> produtos;
    static ArrayList<Item> carrinho;

    public static void main(String[] args) {
        produtos = new ArrayList<>();
        carrinho = new ArrayList<>();
        ProductList produto = new ProductList();

        int opcao = 0;
        while (opcao != 4) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("""
                    Olá quem é você?
                    1 - Cliente 
                    2 - Trabalhador
                    3 - Listar Produtos
                    4 - EXIT
                    """));
            switch (opcao) {
                case 1 -> {
                    int opcaoCliente = 0;
                    opcaoCliente = Integer.parseInt(JOptionPane.showInputDialog("""
                    Em qual departamento deseja comprar?
                    1 - Salgadinhos
                    2 - Limpeza e Higiene
                    3 - Mostrar carrinho
                    4 - EXIT
                    """));
                    switch (opcaoCliente) {
                    
                        case 1 -> {
                            produto.produtosEsco1();
                        }
                        case 2 -> {
                            produto.produtosEsco2();

                        }
                        case 3 -> {
                            return;
                        }
                    
                    }
                    
                    
                    

                }
                case 2 -> {

                }
                case 3 -> {


                }
                

            }
        }
    }


   
   
}