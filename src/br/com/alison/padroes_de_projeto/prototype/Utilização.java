package br.com.alison.padroes_de_projeto.prototype;

import java.util.ArrayList;
import java.util.List;

public class Utilização {
    public static void main(String[] args) {
        List<Forma> formas = new ArrayList<>();
        List<Forma> copiaDasFormas = new ArrayList<>();

        Circulo circulo_1 = new Circulo();
        circulo_1.x = 5;
        circulo_1.y = 10;
        circulo_1.raio = 7;
        circulo_1.color = "Amarelo";
        formas.add(circulo_1);

        Circulo circulo_2 = (Circulo) circulo_1.clone();
        formas.add(circulo_2);

        Retangulo retangulo_1 = new Retangulo();
        retangulo_1.altura = 5;
        retangulo_1.largura = 15;
        retangulo_1.color = "Verde";
        formas.add(retangulo_1);

        clonarEComparar(formas, copiaDasFormas);

    }

    private static void clonarEComparar(List<Forma> formas, List<Forma> copiaDasFormas) {
        for(Forma forma: formas){
            copiaDasFormas.add(forma.clone());
        }

        System.out.println(formas);
        System.out.println(copiaDasFormas);
        for(int i=0; i < formas.size(); i++){
            if(formas.get(i) != copiaDasFormas.get(i)){
                System.out.println(i + " As formas são objetos diferentes em memória!");
                if(formas.get(i).compararObjetos(copiaDasFormas.get(i))){
                    System.out.println(i + " E elas são identicas");
                } else {
                    System.out.println(i + " Porem elas não são identicas");
                }
            } else {
                System.out.println(i + " Os objetos e formas são os mesmos");
            }
        }
    }
}
