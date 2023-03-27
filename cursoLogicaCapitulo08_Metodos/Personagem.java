package cursoLogicaCapitulo08_Metodos;

import java.util.Random;

public class Personagem {
    String nome;
    Integer nivel;
    Integer forca;

    int calculoDanoCausado() {
        Random gerador = new Random();
        int dado20Faces = 1 + gerador.nextInt(19);
        int dano = forca + dado20Faces;
        return dano;
    }

    // void > significa que não esta retornando nada
    void mostrarStatus() {
        System.out.format("Personagem: %s (lvl %d) com %d de força.\n", nome, nivel, forca);
    }

    // metodo atacar que não retorna nada porem recebe como argumento um valor que é
    // do tipo string
    void atacar(String alvo, String habilidade) {
        Integer danoCausado = calculoDanoCausado();
        if (habilidade.length() == 0) {
            System.out.format("%s atacou %s e causou %d de dano.\n ", nome, alvo, danoCausado);
        } else {
            System.out.format("%s usou %s contra o %s e causou %d de dano. \n", nome, habilidade, alvo, danoCausado);
        }

    }

}
