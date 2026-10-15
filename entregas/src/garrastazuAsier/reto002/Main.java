impor.java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("¿Cuántos euros debe pagar?: ");
        int dineroAPagar = scanner.nextInt();
        
        System.out.print("¿Con cuanto dinero paga?: ");
        int dineroPagado = scanner.nextInt();
        int cambio = dineroPagado - dineroAPagar;

        if (cambio < 0) {
            System.out.println("El dinero pagado es insuficiente.");
            return;
        }

        
        int billetesDeCien = cambio / 100;
        int billetesDeCincuenta = (cambio % 100) / 50;
        int billetesDeVeinte = (cambio % 50) / 20;
        int billetesDeDiez = (cambio % 20) / 10;
        int billetesDeCinco = (cambio % 10) / 5;
        int monedasDeDos = (cambio % 5) / 2;
        int monedasDeUno = cambio % 2;

        System.out.println("El cambio es: " + cambio + " euros");
        System.out.println("Billetes de 100 euros: " + billetesDeCien);
        System.out.println("Billetes de 50 euros: " + billetesDeCincuenta);
        System.out.println("Billetes de 20 euros: " + billetesDeVeinte);
        System.out.println("Billetes de 10 euros: " + billetesDeDiez);
        System.out.println("Billetes de 5 euros: " + billetesDeCinco);
        System.out.println("Monedas de 2 euros: " + monedasDeDos);
        System.out.println("Monedas de 1 euro: " + monedasDeUno);

    }
}