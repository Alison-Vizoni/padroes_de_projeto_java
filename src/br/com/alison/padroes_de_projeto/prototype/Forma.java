package br.com.alison.padroes_de_projeto.prototype;

import java.util.Objects;

public abstract class Forma {
    public int x;
    public int y;
    public String color;

    public Forma() {
    }

    public Forma(Forma alvo){
        if(alvo != null){
            x = alvo.x;
            y = alvo.y;
            color = alvo.color;
        }
    }

    public abstract Forma clone();

    public boolean compararObjetos(Object objeto){
        if (!(objeto instanceof Forma)) return false;
        Forma forma = (Forma) objeto;
        return forma.x == x && forma.y == y && Objects.equals(forma.color, color);
    }
}
