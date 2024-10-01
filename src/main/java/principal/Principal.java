package principal;

import java.util.Scanner;
import model.Veiculo;

public class Principal {

    public static void main(String[] args) {
        Veiculo carro = new Veiculo();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a distância percorrida em quilômetros: ");
        carro.setDistancia(scanner.nextDouble());
        System.out.print("Digite a quantidade de combustível gasta em litros: ");
        carro.setCombustivel(scanner.nextDouble());
        System.out.printf("O consumo do veículo é de %.1fKm/L%n", carro.getConsumo());
    }
}
