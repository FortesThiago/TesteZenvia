package jonkenpo;

import java.util.Scanner;

import static jonkenpo.Juiz.jogada;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Jogador jogador = new Jogador();
        System.out.println("Jogador Um: Digite o seu item: ");
        jogador.setJogador1(ler.nextLine());
        System.out.println("Jogador Dois: Digite o seu item");
        jogador.setJogador2(ler.nextLine());

        System.out.println(jogada(jogador.getJogador1(), jogador.getJogador2()));

    }
}
