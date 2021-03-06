package Produtos;

import Objetos.ArmazenaDados;
import java.util.Scanner;

public class RemoverProduto extends ArmazenaDados implements IConfirmaRemover{

    public static void executar(Scanner sc){
        System.out.println("Digite o produto que deseja remover: ");
        System.out.println("1 - Pizza");
        System.out.println("2 - Bebida");
        System.out.println("3 - Sobremesa");
        String action = sc.nextLine();

        switch (action) {
            case "1", "2", "3" -> remover(sc, action);
            default -> System.out.println("Opção inválida");
        }

    }

    public static void remover(Scanner sc, String action){
        String nome;
        boolean existe = false;


        switch (action){
            case "1":
                imprimirProdutos("pizza");
                System.out.println("Digite o nome do produto que deseja remover: ");
                nome = sc.nextLine();

                if (nome.matches("[0-9]+")){
                    existe = ProdutoExisteNumero(Integer.parseInt(nome), "pizza");
                    removerPeloNome(existe, sc, nome);
                }else {
                    existe = produtoExisteNome(nome, "pizza");
                    removerPeloNome(existe, sc, nome);
                }
                return;

            case "2":
                imprimirProdutos("bebida");
                System.out.println("Digite o nome do produto que deseja remover: ");
                nome = sc.nextLine();

                if (nome.matches("[0-9]+")){
                    existe = ProdutoExisteNumero(Integer.parseInt(nome), "bebida");
                    removerPeloNome(existe, sc, nome);
                }else {
                    existe = produtoExisteNome(nome, "bebida");
                    removerPeloNome(existe, sc, nome);
                }
                return;

            case "3":
                imprimirProdutos("sobremesa");
                System.out.println("Digite o nome do produto que deseja remover: ");
                nome = sc.nextLine();

                if (nome.matches("[0-9]+")){
                    existe = ProdutoExisteNumero(Integer.parseInt(nome), "sobremesa");
                    removerPeloNome(existe, sc, nome);
                }else {
                    existe = produtoExisteNome(nome, "sobremesa");
                    removerPeloNome(existe, sc, nome);
                }
                return;
        }

    }
    public static void removerPeloNome(boolean existe, Scanner sc, String nome){
        boolean validaRemover = false;

        if (existe){
            validaRemover = IConfirmaRemover.confirmaRemover(sc);
            if (validaRemover){
                excluirProduto(nome);
                return;
            }else {
                System.out.println("Produto não foi removido");
                System.out.println();
                return;
            }
        }else {
            System.out.println("Produto não encontrado no sistema");
            return;
        }

    }
}
