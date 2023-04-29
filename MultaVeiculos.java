import java.util.Scanner;

public class MultaVeiculos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Tipo de veiculo (passeio, caminhao)");
        String tipoVeiculo = entrada.nextLine();

        System.out.println("Velocidade maxima da via");
        int velocidadeMaxima = entrada.nextInt();

        System.out.println("Velocidade do veiculo");
        int velocidadeVeiculo = entrada.nextInt();

        // veiculo de passeio com velocidade maior que 10% da velocidade da via
        // e caminhao com velocidade maior que 5% deve receber multa
        if (tipoVeiculo.equals("passeio") && velocidadeVeiculo > velocidadeMaxima * 1.1) {
            System.out.println("Multa");
        } else if (tipoVeiculo.equals("caminhao") && velocidadeVeiculo > velocidadeMaxima * 1.05) {
            System.out.println("Multa");
        } else if (tipoVeiculo.equals("passeio") && velocidadeVeiculo < velocidadeMaxima * 1.1) {
            System.out.println("Sem Multa");
        } else if (tipoVeiculo.equals("caminhao") && velocidadeVeiculo < velocidadeMaxima * 1.05) {
            System.out.println("Sem Multa");
        }
    }
}

