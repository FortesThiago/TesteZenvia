package jonkenpo;

enum Jogadas {
    PAPEL("PEDRA"),
    PEDRA("TESOURA"),
    TESOURA("PAPEL");

    private String ganhaDeString;

    Jogadas(String ganhaDeString) {
        this.ganhaDeString = ganhaDeString;
    }

    public boolean ganhaDe(Jogadas jogada){
        return valueOf(ganhaDeString).equals(jogada);
    }

    public String toString(){
        return name().substring(0,1).toUpperCase() + name().substring(1).toLowerCase();
    }
}
