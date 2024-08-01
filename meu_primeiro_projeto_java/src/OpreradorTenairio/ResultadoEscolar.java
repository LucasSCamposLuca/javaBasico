package OpreradorTenairio;

// Cenário 2
public class ResultadoEscolar {
	public static void main(String[] args) {
		int nota = 6;
		String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado);

		int nota2 = 7;
		String resultado2 = nota2 >=7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado2);
	}
}
