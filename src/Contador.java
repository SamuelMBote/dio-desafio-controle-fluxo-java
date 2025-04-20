
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Insira o primeiro valor");
        int parametroUm = terminal.nextInt();
        System.out.println("Insira o segundo valor");
        int parametroDois = terminal.nextInt();
        System.out.println("---");

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }
        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroDois <= parametroUm) {
            throw new ParametrosInvalidosException();
        }
        for (int index = parametroUm; index <= parametroDois; index++) {
            System.out.println(index);
        }

    }
}
