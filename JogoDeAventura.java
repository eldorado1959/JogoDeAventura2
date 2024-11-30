package JogoDeAventura;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class JogoDeAventura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jogo de Aventuras!");
        System.out.print("Qual o nome do seu personagem? ");
        String nome = scanner.nextLine();

        System.out.println("Escolha sua classe: ");
        System.out.println("1 - Guerreiro");
        System.out.println("2 - Mago");
        System.out.println("3 - Arqueiro");
        int escolha = scanner.nextInt();

        Personagem personagem;
        
        switch (escolha) {
    case 1:
        personagem = new Guerreiro(nome);
        break;
    case 2:
        personagem = new Mago(nome); // Crie a classe `Mago`.
        break;
    case 3:
        personagem = new Arqueiro(nome); // Crie a classe `Arqueiro`.
        break;
    default:
        System.out.println("Opção inválida. Criando Guerreiro por padrão.");
        personagem = new Guerreiro(nome);
        break;
}

        
        System.out.println("Bem-vindo, " + nome );

        // Exemplo de combate
        while (personagem.getVida() > 0) {
            System.out.println("\n Encontrou monstro");
            System.out.println("1 - Atacar");
            System.out.println("2 - Fugir");
            int acao = scanner.nextInt();

            if (acao == 1) {
                personagem.atacar();
                int danoRecebido = Dados.rolarVarios(2, 6);
                personagem.setVida(personagem.getVida() - danoRecebido);
                System.out.println("Sofreu " + danoRecebido + " de dano. resta " + personagem.getVida() + "de vida");
            } else if (acao == 2) {
                personagem.fugir();
                break;
            } else {
                System.out.println("Ação inválida!");
            }
        }

        if (personagem.getVida() <= 0) {
            System.out.println("Você foi derrotado. Fim de jogo!");
        } else {
            System.out.println("Você escapou! Sua aventura continua...");
        }

        scanner.close();
    }
}


    
    

