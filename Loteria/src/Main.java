import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
	
	int [] numerosSorteados = new int[6];
	int [] numerosDigitados = new int[6];
	Set<Integer> numerosDigitadosSet = new HashSet<>();
	
	//Sorteio de numeros
	for (int i = 0; i < numerosSorteados.length; i++) {
	    numerosSorteados[i] = random.nextInt(60) + 1;
	    
	}
	
	//valor digitado pelo usuario
	for (int i = 0; i < numerosDigitados.length; i++) {
	    System.out.print("Digite o" + (i +1) + "º numero (entre 1 a 60): " );
	    int numeroDigitado = scanner.nextInt();
	   
	    
	    
	    // Verifica se o número digitado está dentro do intervalo permitido
	    if (numeroDigitado >= 1 && numeroDigitado <= 60) {
	        if (numerosDigitadosSet.contains(numeroDigitado)) {
                    System.out.println("Numero repetido, digite novamente.");
                      i--;
	        }else{
	        numerosDigitados[i] = numeroDigitado;
	            numerosDigitadosSet.add(numeroDigitado);
	        }
	    } else {
	        System.out.print("Numero invalido, Digite novamente.");
	        i--;
	    }
	    
 }
	    
	    boolean acertoutodas = true;
	    for (int i = 0; i < numerosSorteados.length; i++) {
	        if(numerosDigitados[i] != numerosSorteados[i]) {
	            acertoutodas = false;
	            break;
	        }
	    }
	    
	    System.out.println("numeros Sorteados sao: " + Arrays.toString(numerosSorteados));
	    System.out.println("os numeros escolhidos por voce foram " + Arrays.toString(numerosDigitados));
	    
	    
	    if(acertoutodas) {
	        System.out.println("parabens voce ganhou 50 milhoes de reais");
	    } else {
	        System.out.println("Voce nao ganhou na loteria ");
	    }
	    
	    scanner.close();
	    
	
}
}
