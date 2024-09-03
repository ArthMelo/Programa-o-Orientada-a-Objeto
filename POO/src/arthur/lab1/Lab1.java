package study.arthur.lab1;
import java.util.*;

class Lab1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Calcular area da coroa circular
        double raio1 = scanner.nextDouble();
        double raio2 = scanner.nextDouble();
        double pi = 3.14159;

        double area = pi * ((raio1*raio1)-(raio2*raio2));

        System.out.println(area);

        //Imprimir nome, idade e altura
        String name = scanner.next();
        int age = scanner.nextInt();
        double height = scanner.nextDouble();

        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
        System.out.println("Altura: " + height);

        // Aprovação de aluno
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();


        double mediaFinal = (nota1+nota2)/2;
        if(mediaFinal >= 7) {
            System.out.println("Aluno APROVADO! Média: "+mediaFinal);
        } else if(mediaFinal < 3) {
            System.out.println("Aluno REPROVADO! Média: "+mediaFinal);
        } else {
            System.out.println("Aluno em prova final");
        }

        // Fatorial
        int number = scanner.nextInt();
        if(number >= 0 && number <= 20){
            long resultado = Fatorial(number);
            System.out.println("O fatorial de "+number+" é igual a "+resultado);
        } else {
            System.out.println("Numero invalido");
        }

        // Maior Inteiro
        int tamanho = 5;
        int[] valores = new int[tamanho];

        for(int i = 0; i < tamanho; i++) {
            valores[i] = scanner.nextInt();
        }

        for(int i = tamanho-1; i> 0; i--) {
            for(int j = 0; j < i; j++) {
                int aux = 0;
                if(valores[j]>valores[j+1]){
                    aux = valores[j];
                    valores[j] = valores[j+1];
                    valores[j+1] = aux;
                }
            }
        }

        int maior = valores[tamanho-1];

        System.out.println("O maior valor é: "+maior);


        scanner.close();
    }

    public static long Fatorial(int number) {
        if(number == 0 || number == 1) {
            return 1;
        } 
         return number * Fatorial(number-1);
}
}


