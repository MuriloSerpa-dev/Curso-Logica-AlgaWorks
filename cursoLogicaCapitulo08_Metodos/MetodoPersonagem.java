package cursoLogicaCapitulo08_Metodos;

public class MetodoPersonagem {
    public static void main(String[] args) {
        Personagem heroi = new Personagem();

        heroi.nome = " Hercules";
        heroi.forca = 16;
        heroi.nivel = 2;

        heroi.mostrarStatus();
        heroi.atacar("Hidra", "golpe duplo");
        System.out.println(heroi.calculoDanoCausado());
    }
}
