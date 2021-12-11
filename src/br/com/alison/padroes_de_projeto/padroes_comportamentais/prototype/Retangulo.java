package br.com.alison.padroes_de_projeto.padroes_comportamentais.prototype;

public class Retangulo extends Forma{
    public int largura;
    public int altura;

    public  Retangulo(){
    }

    public  Retangulo(Retangulo alvo){
        super(alvo);
        if(alvo != null){
            largura = alvo.largura;
            altura = alvo.altura;
        }
    }

    @Override
    public Forma clone() {
        return new Retangulo(this);
    }

    @Override
    public boolean compararObjetos(Object objeto){
        if (!(objeto instanceof Retangulo) || super.equals(objeto)) return false;
        Retangulo retangulo = (Retangulo) objeto;
        return retangulo.largura == largura && retangulo.altura == altura;
    }

}
