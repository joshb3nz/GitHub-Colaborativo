package github.colaborativo;
// Clase principal
public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int resultadoSuma = calc.sumar(2, 3);
        int resultadoResta = calc.restar(5, 2);
        System.out.println("El resultado de la suma es: " + resultadoSuma);
        System.out.println("El resultado de la resta es: " + resultadoResta);
    }
}