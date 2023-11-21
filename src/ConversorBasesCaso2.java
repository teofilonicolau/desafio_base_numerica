import java.util.Scanner;

public class ConversorBasesCaso2  {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = 0;

        while (opcao != 5) {
            exibirMenu();
            opcao = lerOpcao();

            switch (opcao) {
                case 1:
                    converterQuinaria();
                    break;
                case 2:
                    converterDuodecimal();
                    break;
                case 3:
                    converterVigesimal();
                    break;
                case 4:
                    converterSexagesimal();
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("Escolha a conversão desejada:");
        System.out.println("1. Quinária → Duodecimal + Vigesimal + Sexagesimal");
        System.out.println("2. Duodecimal → Quinária + Vigesimal + Sexagesimal");
        System.out.println("3. Vigesimal → Quinária + Duodecimal + Sexagesimal");
        System.out.println("4. Sexagesimal → Quinária + Duodecimal + Vigesimal");
        System.out.println("5. Sair");
    }

    private static int lerOpcao() {
        System.out.print("Digite a opção desejada: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Opção inválida. Tente novamente.");
            scanner.next(); // Limpa o buffer do scanner
        }
        return scanner.nextInt();
    }

    private static void converterQuinaria() {
        System.out.print("Digite o número quinário: ");
        int quinario = lerNumero();

        System.out.println("Duodecimal: " + converterParaBase(quinario, 12));
        System.out.println("Vigesimal: " + converterParaBase(quinario, 20));
        System.out.println("Sexagesimal: " + converterQuinariaParaSexagesimal(quinario));
    }

    private static void converterDuodecimal() {
        System.out.print("Digite o número duodecimal: ");
        int duodecimal = lerNumero();

        System.out.println("Quinário: " + converterParaBase(duodecimal, 5));
        System.out.println("Vigesimal: " + converterParaBase(duodecimal, 20));
        System.out.println("Sexagesimal: " + converterDuodecimalParaSexagesimal(duodecimal));
    }

    private static void converterVigesimal() {
        System.out.print("Digite o número vigesimal: ");
        int vigesimal = lerNumero();

        System.out.println("Quinário: " + converterParaBase(vigesimal, 5));
        System.out.println("Duodecimal: " + converterParaBase(vigesimal, 12));
        System.out.println("Sexagesimal: " + converterVigesimalParaSexagesimal(vigesimal));
    }

    private static void converterSexagesimal() {
        System.out.print("Digite o número sexagesimal (no formato hh:mm): ");
        String sexagesimal = scanner.next();

        System.out.println("Quinário: " + converterSexagesimalParaQuinaria(sexagesimal));
        System.out.println("Duodecimal: " + converterSexagesimalParaDuodecimal(sexagesimal));
        System.out.println("Vigesimal: " + converterSexagesimalParaVigesimal(sexagesimal));
    }

    private static int lerNumero() {
        while (!scanner.hasNextInt()) {
            System.out.println("Número inválido. Tente novamente.");
            scanner.next(); // Limpa o buffer do scanner
        }
        return scanner.nextInt();
    }

    private static String converterParaBase(int numero, int base) {
        StringBuilder resultado = new StringBuilder();
        while (numero > 0) {
            resultado.insert(0, numero % base);
            numero /= base;
        }
        return resultado.toString();
    }

    private static String converterQuinariaParaSexagesimal(int numeroQuinario) {
        int decimal = converterQuinariaParaDecimal(numeroQuinario);
        int horas = decimal / 60;
        int minutos = decimal % 60;
        return horas + ":" + minutos;
    }

    private static String converterDuodecimalParaSexagesimal(int numeroDuodecimal) {
        int decimal = converterDuodecimalParaDecimal(numeroDuodecimal);
        int horas = decimal / 60;
        int minutos = decimal % 60;
        return horas + ":" + minutos;
    }

    private static String converterVigesimalParaSexagesimal(int numeroVigesimal) {
        int decimal = converterVigesimalParaDecimal(numeroVigesimal);
        int horas = decimal / 60;
        int minutos = decimal % 60;
        return horas + ":" + minutos;
    }

    private static int converterQuinariaParaDecimal(int numeroQuinario) {
        int decimal = 0;
        int base = 1;

        while (numeroQuinario > 0) {
            decimal += (numeroQuinario % 10) * base;
            numeroQuinario /= 10;
            base *= 5;
        }

        return decimal;
    }

    private static int converterDuodecimalParaDecimal(int numeroDuodecimal) {
        int decimal = 0;
        int base = 1;

        while (numeroDuodecimal > 0) {
            decimal += (numeroDuodecimal % 12) * base;
            numeroDuodecimal /= 12;
            base *= 10;
        }

        return decimal;
    }

    private static int converterVigesimalParaDecimal(int numeroVigesimal) {
        int decimal = 0;
        int base = 1;

        while (numeroVigesimal > 0) {
            decimal += (numeroVigesimal % 20) * base;
            numeroVigesimal /= 20;
            base *= 10;
        }

        return decimal;
    }

    private static int converterSexagesimalParaQuinaria(String numeroSexagesimal) {
        String[] partes = numeroSexagesimal.split(":");
        int horas = Integer.parseInt(partes[0]);
        int minutos = Integer.parseInt(partes[1]);

        int decimal = horas * 60 + minutos;
        int quinario = 0;
        int base = 1;

        while (decimal > 0) {
            quinario += (decimal % 5) * base;
            decimal /= 5;
            base *= 10;
        }

        return quinario;
    }

    private static int converterSexagesimalParaDuodecimal(String numeroSexagesimal) {
        String[] partes = numeroSexagesimal.split(":");
        int horas = Integer.parseInt(partes[0]);
        int minutos = Integer.parseInt(partes[1]);

        return horas * 12 + minutos / 5;
    }

    private static int converterSexagesimalParaVigesimal(String numeroSexagesimal) {
        String[] partes = numeroSexagesimal.split(":");
        int horas = Integer.parseInt(partes[0]);
        int minutos = Integer.parseInt(partes[1]);

        return horas * 20 + minutos / 3;
    }
}