import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Verifica verifica = new Verifica();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu peso: ");

        Double peso = scanner.nextDouble();

        System.out.print("Digite a sua altura: ");

        Double altura = scanner.nextDouble();

        Double IMC = peso/ (altura*altura);
        String resultado = String.format("%.2f", IMC);

        System.out.println("O IMC eh: " + resultado);

        verifica.intervalos(IMC);
        scanner.close();
    }
}

class Verifica {
    void intervalos(Double IMC){
        if (IMC <= 18.5){
            System.out.println("Abaixo do peso.");
        } else if (IMC <= 24.9){
            System.out.println("Peso normal.");    
        } else if (IMC <= 29.9){
            System.out.println("Sobrepeso.");  
        } else if (IMC <= 34.9){
            System.out.println("Obesidade Grau I."); 
        } else if (IMC <= 39.9){
            System.out.println("Obesidade Grau II."); 
        } else {
            System.out.println("Obesidade Grau III."); 
        }
    }
}
