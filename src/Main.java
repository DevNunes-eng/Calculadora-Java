import Classes.Operation;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("Digite seus números separados por vírgula:");
        var lerDados = scan.nextLine();
        var listaDeNumeros = Arrays.stream(lerDados.split(","))
                .mapToLong(Long::parseLong)
                .toArray();

        System.out.println("Digite 1 - Para Somar");
        System.out.println("Digite 2- Para Diminuir");
        System.out.println("Digite 3- Para Multiplicar");
        System.out.println("Digite 4- Para Dividir");
        int valor = scan.nextInt();
        scan.nextLine();
        var valorSelecionado = Operation.values()[valor-1];
        System.out.println(valorSelecionado);
        var result = valorSelecionado.getOperation().calcular(listaDeNumeros);
        System.out.println(String.format("Valor da %s de %s é:%s",valorSelecionado.getSimbolo(),Arrays.toString(listaDeNumeros),result));



    }
}