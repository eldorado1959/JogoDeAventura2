/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public interface Personagem {
    void atacar();
    void usarMagia();
    void usarItem();
    void fugir();
    int getVida();
    void setVida(int vida);
}

