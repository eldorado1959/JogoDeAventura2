

public class Arqueiro extends Personagem {
    public Arqueiro(String nome) {
        super(nome, Dados.rolarVarios(6, 2), Dados.rolarVarios(6, 3), Dados.rolarVarios(4, 2), Dados.rolarVarios(8, 4));
    }

    @Override
    public void atacar() {
        System.out.println(nome + " dispara uma flecha precisa, causando " + forca + " de dano!");
    }

    @Override
    public void usarMagia() {
        System.out.println(nome + " não possui habilidades mágicas.");
    }

    @Override
    public void usarItem() {
        System.out.println(nome + " usa um item para melhorar sua precisão!");
        agilidade += 5;
    }

    @Override
    public void fugir() {
        System.out.println(nome + " tenta fugir com agilidade!");
    }
}
