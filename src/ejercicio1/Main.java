package ejercicio1;

public class Main {

    public static void main(String[] args) {

        // Crear el primer empleado
        Empleado empleado1 = new Empleado("Carlos", 1500000);

        // Mostrar informacion inicial
        System.out.println("===== DATOS DEL EMPLEADO =====");
        System.out.println("Nombre: " + empleado1.nombre);
        System.out.println("Salario: " + empleado1.getSalario());

        // Modificar el nombre y el salario
        empleado1.nombre = "Andres";
        empleado1.setSalario(2000000);

        // Mostrar informacion actualizada
        System.out.println("\n===== DATOS ACTUALIZADOS =====");
        System.out.println("Nombre: " + empleado1.nombre);
        System.out.println("Salario: " + empleado1.getSalario());

        // Comprobar la validacion del salario
        System.out.println("\n===== PRUEBA DE VALIDACION =====");
        empleado1.setSalario(-500000);

        System.out.println("Salario actual: " + empleado1.getSalario());
    }
}
