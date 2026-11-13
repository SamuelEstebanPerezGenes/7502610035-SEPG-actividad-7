package ejercicio2;

public class Main {

    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria(
                "123456789",
                2500000,
                "Ahorros"
        );

        System.out.println("===== DATOS DE LA CUENTA =====");
        cuenta1.mostrarDetalles();

        System.out.println("\n===== MODIFICAR SALDO =====");
        cuenta1.setSaldo(3000000);
        System.out.println("Nuevo saldo: " + cuenta1.getSaldo());

        System.out.println("\n===== PRUEBA DE VALIDACION =====");
        cuenta1.setSaldo(-500000);
        System.out.println("Saldo actual: " + cuenta1.getSaldo());

        System.out.println("\n===== ACCESO AL ATRIBUTO PUBLICO =====");
        cuenta1.tipoCuenta = "Corriente";
        System.out.println("Tipo de cuenta actualizado: " + cuenta1.tipoCuenta);

        System.out.println("\n===== PRUEBA DE ACCESO PRIVADO =====");

        // La siguiente linea genera un error de compilacion
        // porque numeroCuenta es un atributo privado.

        // System.out.println(cuenta1.numeroCuenta);

    }
}

