
public class Mago extends Personagem {
    public Mago(String nome) {
        super(nome, Dados.rolarVarios(4, 2), Dados.rolarVarios(6, 3), Dados.rolarVarios(8, 4), Dados.rolarVarios(6, 2));
    }

    @Override
    public void atacar() {
        System.out.println(nome + " ataca com sua varinha, causando " + forca + " de dano!");
    }

    @Override
    public void usarMagia() {
        System.out.println(nome + " lança uma magia poderosa, gastando mana!");
        mana -= 5;
    }

    @Override
    public void usarItem() {
        System.out.println(nome + " usa um item mágico para recuperar mana!");
        mana += 10;
    }

    @Override
    public void fugir() {
        System.out.println(nome + " tenta fugir!");
    }
}
