package ejercicio3;

public class Main {

    public static void main(String[] args) {

        Utilidades operaciones = new Utilidades();

        double numero1 = 20;
        double numero2 = 5;

        System.out.println("===== OPERACIONES MATEMATICAS =====");

        System.out.println("Primer numero: " + numero1);
        System.out.println("Segundo numero: " + numero2);

        System.out.println("\n===== RESULTADOS =====");

        System.out.println("Suma: " +
                operaciones.sumar(numero1, numero2));

        System.out.println("Resta: " +
                operaciones.restar(numero1, numero2));

        System.out.println("Multiplicacion: " +
                operaciones.multiplicar(numero1, numero2));

        System.out.println("Division: " +
                operaciones.dividir(numero1, numero2));

        System.out.println("\n===== PRUEBA DE DIVISION ENTRE CERO =====");

        System.out.println("Resultado: " +
                operaciones.dividir(numero1, 0));
    }
}
