import java.util.Scanner;

class Calculatrice {
    public double addition(double a, double b) {
        return a + b;
    }

    public double soustraction(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Erreur : Division par zéro !");
        }
        return a / b;
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculatrice calc = new Calculatrice();

        System.out.println("Bienvenue dans la calculatrice !");
        System.out.println("Operations disponibles : +, -, *, /");

        while (true) {
            System.out.print("Entrez le premier nombre (ou 'q' pour quitter) : ");
            if (scanner.hasNext("q")) {
                break;
            }
            double num1 = scanner.nextDouble();

            System.out.print("Entrez l'opération (+, -, *, /) : ");
            String operation = scanner.next();

            System.out.print("Entrez le deuxieme nombre : ");
            double num2 = scanner.nextDouble();

            try {
                double resultat = 0;
                switch (operation) {
                    case "+":
                        resultat = calc.addition(num1, num2);
                        break;
                    case "-":
                        resultat = calc.soustraction(num1, num2);
                        break;
                    case "*":
                        resultat = calc.multiplication(num1, num2);
