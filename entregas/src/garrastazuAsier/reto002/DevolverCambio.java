impor.java.util.Scanner;

public class DevolverCambio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("¿Cuántos euros debe pagar?: ");
        double dineroAPagar = scanner.nextDouble();
        
        System.out.print("¿Con cuanto dinero paga?: ");
        double dineroPagado = scanner.nextDouble();
        double cambio = dineroPagado - dineroAPagar;

        if (cambio < 0) {
            System.out.println("El dinero pagado es insuficiente.");
            return;
        }

        
        int billetesDeCien = (int) (cambio / 100);
        int billetesDeCincuenta = (int) ((cambio % 100) / 50);
        int billetesDeVeinte = (int) ((cambio % 50) / 20);
        int billetesDeDiez = (int) ((cambio % 20) / 10);
        int billetesDeCinco = (int) ((cambio % 10) / 5);
        int monedasDeDos = (int) ((cambio % 5) / 2);
        int monedasDeUno = (int) (cambio % 2);
        int monedasDeCincuentaCentimos = (int) ((cambio * 100) % 100 / 50);
        int monedasDeVeinteCentimos = (int) ((cambio * 100) % 50 / 20);
        int monedasDeDiezCentimos = (int) ((cambio * 100) % 20 / 10);
        int monedasDeCincoCentimos = (int) ((cambio * 100) % 10 / 5);
        int monedasDeDosCentimos = (int) ((cambio * 100) % 5 / 2);
        int monedasDeUnCentimo = (int) ((cambio * 100) % 2);

        System.out.println("El cambio es: " + cambio + " euros");
        System.out.println("Billetes de 100 euros: " + billetesDeCien);
        System.out.println("Billetes de 50 euros: " + billetesDeCincuenta);
        System.out.println("Billetes de 20 euros: " + billetesDeVeinte);
        System.out.println("Billetes de 10 euros: " + billetesDeDiez);
        System.out.println("Billetes de 5 euros: " + billetesDeCinco);
        System.out.println("Monedas de 2 euros: " + monedasDeDos);
        System.out.println("Monedas de 1 euro: " + monedasDeUno);
        System.out.println("Monedas de 50 céntimos: " + monedasDeCincuentaCentimos);
        System.out.println("Monedas de 20 céntimos: " + monedasDeVeinteCentimos);
        System.out.println("Monedas de 10 céntimos: " + monedasDeDiezCentimos);
        System.out.println("Monedas de 5 céntimos: " + monedasDeCincoCentimos);
        System.out.println("Monedas de 2 céntimos: " + monedasDeDosCentimos);
        System.out.println("Monedas de 1 céntimo: " + monedasDeUnCentimo);

    }
}