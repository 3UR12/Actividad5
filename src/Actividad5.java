import java.util.Scanner;

public class Actividad5 {

    // Métodos para calcular el área y perímetro de cada figura
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public static double calcularPerimetroCirculo(double radio) {
        return 2 * Math.PI * radio;
    }

    public static double calcularAreaCuadrado(double lado) {
        return lado * lado;
    }

    public static double calcularPerimetroCuadrado(double lado) {
        return 4 * lado;
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return 0.5 * base * altura;
    }

    public static double calcularPerimetroTriangulo(double lado1, double lado2, double lado3) {
        return lado1 + lado2 + lado3;
    }

    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    public static double calcularPerimetroRectangulo(double base, double altura) {
        return 2 * (base + altura);
    }

    public static double calcularAreaPentagono(double lado, double apotema) {
        return (5 * lado * apotema) / 2;
    }

    public static double calcularPerimetroPentagono(double lado) {
        return 5 * lado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la calculadora geométrica.");
        System.out.println("Elige la figura: ");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");
        System.out.println("4. Rectángulo");
        System.out.println("5. Pentágono");

        int opcionFigura = scanner.nextInt();
        System.out.println("Elige la operación: ");
        System.out.println("1. Área");
        System.out.println("2. Perímetro");

        int opcionOperacion = scanner.nextInt();

        switch (opcionFigura) {
            case 1: // Círculo
                System.out.println("Ingresa el radio del círculo: ");
                double radio = scanner.nextDouble();
                if (opcionOperacion == 1) {
                    System.out.println("El área del círculo es: " + calcularAreaCirculo(radio));
                } else {
                    System.out.println("El perímetro del círculo es: " + calcularPerimetroCirculo(radio));
                }
                break;

            case 2: // Cuadrado
                System.out.println("Ingresa el lado del cuadrado: ");
                double ladoCuadrado = scanner.nextDouble();
                if (opcionOperacion == 1) {
                    System.out.println("El área del cuadrado es: " + calcularAreaCuadrado(ladoCuadrado));
                } else {
                    System.out.println("El perímetro del cuadrado es: " + calcularPerimetroCuadrado(ladoCuadrado));
                }
                break;

            case 3: // Triángulo
                System.out.println("Ingresa la base del triángulo: ");
                double baseTriangulo = scanner.nextDouble();
                System.out.println("Ingresa la altura del triángulo: ");
                double alturaTriangulo = scanner.nextDouble();
                if (opcionOperacion == 1) {
                    System.out.println("El área del triángulo es: " + calcularAreaTriangulo(baseTriangulo, alturaTriangulo));
                } else {
                    System.out.println("Ingresa los tres lados del triángulo: ");
                    double lado1 = scanner.nextDouble();
                    double lado2 = scanner.nextDouble();
                    double lado3 = scanner.nextDouble();
                    System.out.println("El perímetro del triángulo es: " + calcularPerimetroTriangulo(lado1, lado2, lado3));
                }
                break;

            case 4: // Rectángulo
                System.out.println("Ingresa la base del rectángulo: ");
                double baseRectangulo = scanner.nextDouble();
                System.out.println("Ingresa la altura del rectángulo: ");
                double alturaRectangulo = scanner.nextDouble();
                if (opcionOperacion == 1) {
                    System.out.println("El área del rectángulo es: " + calcularAreaRectangulo(baseRectangulo, alturaRectangulo));
                } else {
                    System.out.println("El perímetro del rectángulo es: " + calcularPerimetroRectangulo(baseRectangulo, alturaRectangulo));
                }
                break;

            case 5: // Pentágono
                System.out.println("Ingresa el lado del pentágono: ");
                double ladoPentagono = scanner.nextDouble();
                if (opcionOperacion == 1) {
                    System.out.println("Ingresa el apotema del pentágono: ");
                    double apotema = scanner.nextDouble();
                    System.out.println("El área del pentágono es: " + calcularAreaPentagono(ladoPentagono, apotema));
                } else {
                    System.out.println("El perímetro del pentágono es: " + calcularPerimetroPentagono(ladoPentagono));
                }
                break;

            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}
