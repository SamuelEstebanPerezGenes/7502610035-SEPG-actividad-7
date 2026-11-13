package ejercicio1;

public class Empleado {

    // Atributos
    public String nombre;
    private double salario;

    // Constructor
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        setSalario(salario);
    }

    // Metodo get para consultar el salario
    public double getSalario() {
        return salario;
    }

    // Metodo set para modificar el salario
    public void setSalario(double salario) {

        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("Error: el salario no puede ser negativo.");
        }
    }
}
