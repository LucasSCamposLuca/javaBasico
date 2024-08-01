package anatomiaDasClasses;
import javax.print.DocFlavor.STRING;

public class Boletim {
    public static void main(String[] args) {
        int notaDaProva = 4;

        if (notaDaProva < 5){
            System.out.println("REPROVADO!");
        } else if (notaDaProva >=5 && notaDaProva <= 10) {
            System.out.println("APROVADO!");
        } else{
            System.out.println("Notas acima de 10 não são permitidas");
        }

        System.out.println("--------------------------------------------------------------");


    }
}
