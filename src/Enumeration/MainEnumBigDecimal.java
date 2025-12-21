package Enumeration;

import java.math.BigDecimal;
import java.util.Scanner;

public class MainEnumBigDecimal {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        while (true){
            System.out.println("Digite uma opção");
            System.out.println("1-Somar");
            System.out.println("2-Subtratir");
            System.out.println("3-Multiplicacao");
            System.out.println("4-Divisao");
            System.out.println("5-Sair");
            int option = scanner.nextInt();
            scanner.nextLine();
            if (option > 5 || option <1){
                System.out.println("Opção invalida!");
                continue;
            }
            if(option == 5){break;}

            var opcaoSelecionado = OperationEnumBigDecimal.values()[option-1];
            System.out.println("Informe o primeiro valor ou digite voltar para retornar ao menu");
            var ler1 =scanner.next();
            if(ler1.equalsIgnoreCase("voltar")){
                System.out.println("Voltando ao menu...");
                continue;
            }
            var valor1 = new BigDecimal(ler1);
            System.out.println("Informe o segundo valor ou digite voltar para retornar ao menu");
            var ler2 = scanner.next();
            if(ler2.equalsIgnoreCase("voltar")){
                System.out.println("Voltando ao menu...");
                continue;
            }
            var valor2 = new BigDecimal(ler2);
            var result = opcaoSelecionado.getCalculate().apply(valor1,valor2);
            System.out.printf("%s %s %s = %s\n",valor1,opcaoSelecionado.getSimbolo(),valor2,result);
        }
    }
}
