import modelos.Produto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Produto> carrinho = new ArrayList<>();
        double limite = 0;
        int escolha = 0;


        System.out.println("*****************************");
        System.out.println("Programa de carrinho");
        System.out.println("*****************************");

        System.out.println("Digite o limite de seu cartão");
        limite = sc.nextDouble();

        do{

            System.out.println("Deseja adicionar um novo produto?");
            System.out.println("1 - para Sim");
            System.out.println("0 - para Não");
            escolha = sc.nextInt();

            if(escolha == 1){
               Produto produto = new Produto();

                System.out.println("Digite a descrição da compra");
                produto.setDescricao(sc.next());

                System.out.println("Digite o valor da compra");
                produto.setValor(Double.parseDouble(sc.next()));


                if(produto.getValor() > limite){
                    System.out.println("Limite insuficiente para compra");
                    System.out.println("Programa Encerrado por falta de limite");
                    escolha = 0;
                }

                carrinho.add(produto);
                limite -= produto.getValor();
                System.out.println("Saldo atual: "+limite);
            }

        }while (escolha!=0);

        System.out.println("FATURA");
        Collections.sort(carrinho);
        System.out.println(carrinho);

    }
}
