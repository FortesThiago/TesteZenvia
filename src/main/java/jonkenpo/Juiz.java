package jonkenpo;

public class Juiz {
    public static String jogada(String jogador1String, String jogador2String) {
        Jogadas jogador1;
        Jogadas jogador2;

        try {
            jogador1 = Jogadas.valueOf(jogador1String.toUpperCase());
        } catch (IllegalArgumentException e){
            return "jogador1 invalido";
        }

        try {
            jogador2 = Jogadas.valueOf(jogador2String.toUpperCase());
        } catch (IllegalArgumentException e){
            return "jogador2 invalido";
        }

        return jogada(jogador1, jogador2);
    }

    public static String jogada(Jogadas jogador1,  Jogadas jogador2) {
        if (jogador1.equals(jogador2)) return "empate";

        if (jogador1.ganhaDe(jogador2)) return jogador1 + " ganha";

        if (jogador2.ganhaDe(jogador1)) return jogador2 + " ganha";

        return null;
    }
}
