import java.util.Scanner;

public class examen {
    public static void main(String[] args) {
        // Objeto Scanner para leer entradas de la consola
        Scanner scanner = new Scanner(System.in);

        // Definición de variables
        String nombre;
        double ingreso;
        double mSolicitado;
        int meses;
        double mMaximo;
        double interes;
        double interesTotal;
        double montoTotal;
        double pagoMensual;

        // Solicitud y lectura de datos
        System.out.print("Ingrese el nombre del solicitante: ");
        nombre = scanner.nextLine();

        System.out.print("Ingrese el ingreso mensual: ");
        ingreso = scanner.nextDouble();

        System.out.print("Ingrese el monto solicitado: ");
        mSolicitado = scanner.nextDouble();

        System.out.print("Ingrese el número de meses para pagar: ");
        meses = scanner.nextInt();

        // Cálculo del monto máximo
        mMaximo = ingreso * 3;

        // Estructura condicional
        if (mSolicitado <= mMaximo) {

            if (meses <= 12) {
                interes = 0.03;
            } else if (meses <= 24) {
                interes = 0.05;
            } else {
                interes = 0.07;
            }

            interesTotal = mSolicitado * interes * meses;
            montoTotal = mSolicitado + interesTotal;
            pagoMensual = montoTotal / meses;

            System.out.println("\nPRÉSTAMO APROBADO");
            System.out.println("Nombre: " + nombre);
            System.out.println("Monto solicitado: $" + mSolicitado);
            System.out.println("Porcentaje de interés mensual: " + (interes * 100) + "%");
            System.out.println("Número de mensualidades: " + meses);
            System.out.println("Pago mensual: $" + pagoMensual);
            System.out.println("Monto total a pagar: $" + montoTotal);

        } else {

            System.out.println("\nPRÉSTAMO RECHAZADO");
            System.out.println("El monto máximo que puede solicitar es: $" + mMaximo);

        }

        scanner.close(); // Buena práctica: cerrar el objeto Scanner
    }
}