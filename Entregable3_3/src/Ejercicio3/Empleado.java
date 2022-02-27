package Ejercicio3;

public class Empleado {
    /* ------- CONSTRUCTOR -------- */
    public Empleado(){};

    public float calculaSalarioBruto (int tipoEmpleado, float ventasMes, float horasExtras){
        float salario = 0;

        switch (tipoEmpleado){
            case 1:
                salario = 1000;
                break;
            case 2:
                salario = 1500;
                break;
            default:
                throw new java.lang.IllegalArgumentException("ERROR EN LOS DATOS");
        }

        if (ventasMes < 0 || horasExtras < 0) {
            throw new java.lang.IllegalArgumentException("ERROR EN LOS DATOS");
        } else if (ventasMes >= 1500) {
            salario +=200;
        } else if (ventasMes >= 1000){
            salario += 100;
        }

        salario += (horasExtras * 20);
        return salario;
    }

    public float calculaSalarioNeto (float salarioBruto){
        float salarioNeto = 0;
        if (salarioBruto < 1000){
            return salarioBruto;
        } else if (salarioBruto < 1500) {
            salarioNeto = salarioBruto - (salarioBruto * 16 / 100);
        } else if (salarioBruto >= 1500 ) {
            salarioNeto = salarioBruto - (salarioBruto * 18 / 100);
        }
        if (salarioNeto < 0 ) {
            throw new java.lang.IllegalArgumentException("EL SALARIO NETO DEBE SER POSITIVO");
        }
        return salarioNeto;
    }
}
