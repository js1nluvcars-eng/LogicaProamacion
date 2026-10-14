import java.util.Scanner;

public class paletas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] Sabores = {"Fresa", "Limón", "Coco"};
        int[] Precio = {15, 12, 18};
        int dias = 2;

        int[] paletasPorDia = new int[dias];
        int[] dineroPorDia = new int[dias];

        int totalpaletas = 0;
        int totalingresos = 0;

        for (int dia = 1; dia <= dias; dia++) {
            System.out.println("\n--- Día " + dia + " ---");

            int paletasDia = 0;
            int dineroDia = 0;

            for (int i = 0; i < Sabores.length; i++) {
                System.out.print("¿Cuántas paletas de " + Sabores[i] + " se vendieron? ");
                int cantidad = scanner.nextInt();

                paletasDia += cantidad;
                dineroDia += cantidad * Precio[i];
            }

            paletasPorDia[dia - 1] = paletasDia;
            dineroPorDia[dia - 1] = dineroDia;

            totalpaletas += paletasDia;
            totalingresos += dineroDia;
        }

        System.out.println("\n= Resultados =");
        for (int dia = 1; dia <= dias; dia++) {
            System.out.println("Día " + dia + ": " + paletasPorDia[dia - 1]
                    + " paletas vendidas, dinero recaudado: $" + dineroPorDia[dia - 1]);
        }

        System.out.println("\nTotal de paletas vendidas: " + totalpaletas);
        System.out.println("Total de dinero recaudado: $" + totalingresos);

        scanner.close();
    }
}