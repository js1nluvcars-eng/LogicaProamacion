import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double peso = 0;
        double estatura = 0;
        char continuar = 'N';

        do {
            System.out.println("CALCULADORA DE IMC ");
            
            System.out.println("Ingresa tu peso en kilogramos: ");
            peso = scanner.nextDouble();
            
            System.out.println("Ingresa tu estatura en metros: ");
            estatura = scanner.nextDouble();


            double imc = peso / (estatura * estatura);
            int categoria = 0;

            if (imc < 18.5) {
                categoria = 1; 
            } else if (imc >= 18.5 && imc < 25.0) {
                categoria = 2;
            } else if (imc >= 25.0 && imc < 30.0) {
                categoria = 3;
            } else if (imc >= 30.0 && imc < 35.0) {
                categoria = 4;
            } else if (imc >= 35.0 && imc < 40.0) {
                categoria = 5; 
            } else {
                categoria = 6;
            }

            System.out.printf("%nTu Índice de Masa Corporal (IMC) es: %.2f%n", imc);
    

            switch (categoria) {
                case 1:
                    System.out.println("Clasificación: Bajo peso");
                    System.out.println("Acciones recomendadas:");
                    System.out.println(" 1. Consultar a un nutricionista para diseñar una dieta hipercalórica equilibrada.");
                    System.out.println(" 2. Realizar entrenamiento de fuerza para incrementar la masa muscular.");
                    break;

                case 2:
                    System.out.println("Clasificación: Peso normal");
                    System.out.println("Acciones recomendadas:");
                    System.out.println(" 1. Mantener una alimentación balanceada variando fuentes de proteína y fibra.");
                    System.out.println(" 2. Realizar al menos 150 minutos de actividad física moderada a la semana.");
                    break;

                case 3:
                    System.out.println("Clasificación: Sobrepeso");
                    System.out.println("Acciones recomendadas:");
                    System.out.println(" 1. Reducir el consumo de azúcares refinados, refrescos y alimentos ultraprocesados.");
                    System.out.println(" 2. Incrementar la actividad física diaria incorporando caminatas de 30 a 45 minutos.");
                    break;

                case 4:
                    System.out.println("Clasificación: Obesidad Tipo 1 (Leve)");
                    System.out.println("Acciones recomendadas:");
                    System.out.println(" 1. Solicitar una evaluación médica integral para analizar perfil lipídico y glucemia.");
                    System.out.println(" 2. Iniciar un plan de alimentación con déficit calórico moderado supervisado.");
                    break;

                case 5:
                    System.out.println("Clasificación: Obesidad Tipo 2 (Moderada)");
                    System.out.println("Acciones recomendadas:");
                    System.out.println(" 1. Establecer un plan multidisciplinario (médico, nutricionista y psicólogo).");
                    System.out.println(" 2. Implementar rutina de ejercicio de bajo impacto articular (ej. natación o elíptica).");
                    break;

                case 6:
                    System.out.println("Clasificación: Obesidad Tipo 3 (Mórbida)");
                    System.out.println("Acciones recomendadas:");
                    System.out.println(" 1. Acudir a consulta prioritaria con un especialista en manejo de obesidad extrema.");
                    System.out.println(" 2. Evaluar riesgos cardiovasculares y considerar tratamientos clínicos o quirúrgicos.");
                    break;

                default:
                    System.out.println("Ocurrió un error al clasificar el IMC.");
                    break;
            }
            System.out.print("¿Deseas calcular el IMC de otra persona? (Si/No): ");
            continuar = scanner.next().toUpperCase().charAt(0);
            System.out.println();

        } while (continuar == 'S');

        System.out.println("Programa finalizado. ¡Gracias por utilizar la calculadora!");
        scanner.close();
    }
}