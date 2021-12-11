package br.com.alison.padroes_de_projeto.padroes_comportamentais.prototype;

public class Circulo extends Forma{

    public int raio;

    public Circulo() {
    }

    public Circulo(Circulo alvo) {
        super(alvo);
        if(alvo != null) {
            raio = alvo.raio;
        }
    }

    @Override
    public Forma clone() {
        return new Circulo(this);
    }

    @Override
    public boolean compararObjetos(Object objeto){
        if (!(objeto instanceof Circulo) || super.equals(objeto)) return false;
        Circulo circulo = (Circulo) objeto;
        return circulo.raio == raio;
    }
}
