package sistemaSmartTV;

public class TvTeste {
    //     Vamos criar um exemplo de uma classe para representar uma SmartTV onde:

// Ela tenha as características: ligada (boolean), canal (int) e volume (int);

// Nossa TV poderá ligar e desligar e assim mudar o estado ligada;

// Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1;

// Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente.
public static void main(String[] args) {
    Tv tv = new Tv();
    int canalDefinido = 9;

     System.out.println(tv.TvSmart);
     System.out.println(tv.canal);
     System.out.println(tv.volume);

     tv.definindoCanal(25);

    
}

}
