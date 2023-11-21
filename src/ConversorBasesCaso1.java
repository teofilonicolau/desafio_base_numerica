import java.util.InputMismatchException;
import java.util.Scanner;

public class ConversorBasesCaso1 {

    // Etapa 1: Decimal → Binário + Octal + Hexadecimal
    public static void decimalParaOutrasBases(int numeroDecimal) {
        // Convertendo para Binário
        String binario = Integer.toBinaryString(numeroDecimal);
        System.out.println("Decimal para Binário: " + binario);

        // Convertendo para Octal
        String octal = Integer.toOctalString(numeroDecimal);
        System.out.println("Decimal para Octal: " + octal);

        // Convertendo para Hexadecimal
        String hexadecimal = Integer.toHexString(numeroDecimal);
        System.out.println("Decimal para Hexadecimal: " + hexadecimal);
    }

    // Etapa 2: Binário → Decimal + Octal + Hexadecimal
    public static void binarioParaOutrasBases(String numeroBinario) {
        try {
            // Convertendo para Decimal
            int decimal = Integer.parseInt(numeroBinario, 2);
            System.out.println("Binário para Decimal: " + decimal);

            // Convertendo para Octal
            int octal = Integer.parseInt(numeroBinario, 2);
            String octalString = Integer.toOctalString(octal);
            System.out.println("Binário para Octal: " + octalString);

            // Convertendo para Hexadecimal
            int hexadecimal = Integer.parseInt(numeroBinario, 2);
            String hexadecimalString = Integer.toHexString(hexadecimal);
            System.out.println("Binário para Hexadecimal: " + hexadecimalString);

        } catch (NumberFormatException e) {
            System.out.println("Erro: Entrada inválida para conversão binária.");
        }
    }

    // Etapa 3: Octal → Decimal + Binário + Hexadecimal
    public static void octalParaOutrasBases(String numeroOctal) {
        try {
            // Convertendo para Decimal
            int decimal = Integer.parseInt(numeroOctal, 8);
            System.out.println("Octal para Decimal: " + decimal);

            // Convertendo para Binário
            int binario = Integer.parseInt(numeroOctal, 8);
            String binarioString = Integer.toBinaryString(binario);
            System.out.println("Octal para Binário: " + binarioString);

            // Convertendo para Hexadecimal
            int hexadecimal = Integer.parseInt(numeroOctal, 8);
            String hexadecimalString = Integer.toHexString(hexadecimal);
            System.out.println("Octal para Hexadecimal: " + hexadecimalString);

        } catch (NumberFormatException e) {
            System.out.println("Erro: Entrada inválida para conversão octal.");
        }
    }

    // Etapa 4: Hexadecimal → Decimal + Binário + Octal
    public static void hexadecimalParaOutrasBases(String numeroHexadecimal) {
        try {
            // Convertendo para Decimal
            int decimal = Integer.parseInt(numeroHexadecimal, 16);
            System.out.println("Hexadecimal para Decimal: " + decimal);

            // Convertendo para Binário
            int binario = Integer.parseInt(numeroHexadecimal, 16);
            String binarioString = Integer.toBinaryString(binario);
            System.out.println("Hexadecimal para Binário: " + binarioString);

            // Convertendo para Octal
            int octal = Integer.parseInt(numeroHexadecimal, 16);
            String octalString = Integer.toOctalString(octal);
            System.out.println("Hexadecimal para Octal: " + octalString);

        } catch (NumberFormatException e) {
            System.out.println("Erro: Entrada inválida para conversão hexadecimal.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o número decimal: ");
            int numeroDecimal = scanner.nextInt();
            decimalParaOutrasBases(numeroDecimal);

            scanner.nextLine(); // Limpar o buffer do scanner

            System.out.print("Digite o número binário: ");
            String numeroBinario = scanner.nextLine();
            binarioParaOutrasBases(numeroBinario);

            System.out.print("Digite o número octal: ");
            String numeroOctal = scanner.nextLine();
            octalParaOutrasBases(numeroOctal);

            System.out.print("Digite o número hexadecimal: ");
            String numeroHexadecimal = scanner.nextLine();
            hexadecimalParaOutrasBases(numeroHexadecimal);

        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Certifique-se de inserir um número válido.");
        } finally {
            scanner.close();
        }
    }
}
