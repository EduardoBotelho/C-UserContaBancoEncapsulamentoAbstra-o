package Principal;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        // Lê o tipo de cofre (primeira linha da entrada)
        Scanner scanner = new Scanner(System.in);
        String tipoCofre = scanner.nextLine();

        // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
        if (tipoCofre.equalsIgnoreCase("digital")) {
            int password1 = scanner.nextInt();
            int password2 = scanner.nextInt();

            CofreDigital cofreDigital = new CofreDigital(password1);
            cofreDigital.imprimirInformacoes();
            if (cofreDigital.validarSenha(password2) == true) {
                System.out.println("Cofre aberto");
            } else {
                System.out.println("Senha incorreta!");
            }
        } else if (tipoCofre.equalsIgnoreCase("fisico")) {
            CofreFisico cofreFisico = new CofreFisico();
            cofreFisico.imprimirInformacoes();
        }


    }
}
