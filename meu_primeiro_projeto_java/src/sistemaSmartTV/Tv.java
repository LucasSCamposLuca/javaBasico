package sistemaSmartTV;
//     Vamos criar um exemplo de uma classe para representar uma SmartTV onde:

// Ela tenha as características: ligada (boolean), canal (int) e volume (int);

// Nossa TV poderá ligar e desligar e assim mudar o estado ligada;

// Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1;

// Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente.
public class Tv {
    
    boolean TvSmart = false;
    int canal = 8;
    int volume = 25;

    public void liga(){
        TvSmart = true;
    }

    public void Desligada(){
        TvSmart = false;
    }

    public void maisUmCanal(){
        canal += 1;
    }

    public void menosUmCanal(){
        canal -= 1;
    }

    public void definindoCanal(int canalDefinido){
        int canalDef = canalDefinido;
    }

}
