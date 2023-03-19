import java.util.Scanner;

public class ListaExerc2{
    public static void main(String[] args) {
        String entrada;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Seja bem vindo!");
        System.out.println("Digite uma opção em letra minúscula:");
        System.out.println(" Primeira opção: soma"
                         + "\n Segunda opção: retangulo"
                         + "\n Terceira opção: media"
                         + "\n Quarta opção: aumento"
                         + "\n Quinta opção: salariobase"
                         + "\n Sexta opção: desafio");
        
        System.out.println("Insira uma opcão:");
        entrada = teclado.next();
        switch (entrada){
            case "soma":
                double boleto_1,
                       boleto_2,
                       boleto_3,
                       boleto_4,
                       salario,
                       totalBoletos,
                       totalSalario;
                
                System.out.print("Insira o valor do primeiro boleto: ");
                boleto_1 = teclado.nextDouble();
                System.out.print("Insira o valor do segundo boleto: ");
                boleto_2 = teclado.nextDouble();
                System.out.print("Insira o valor do terceiro boleto: ");
                boleto_3 = teclado.nextDouble();
                System.out.print("Insira o valor do quarto boleto: ");
                boleto_4 = teclado.nextDouble();
                System.out.print("Insira o seu salário: ");
                salario = teclado.nextDouble();
                
                totalBoletos = boleto_1 + boleto_2 + boleto_3 + boleto_4;
                totalSalario = salario - totalBoletos - (salario * 0.14);
                
                System.out.printf("%s%f%n", "Seu salário com todos os cálculos é: R$ ", totalSalario);
                System.out.printf("%s%f%n", "Sua dívida total é: R$ ", totalBoletos);
                break;
                
            case "retangulo":
                float lado_1,
                      lado_2,
                      totalRetangulo;
                
                System.out.print("Insira o primeiro lado: ");
                lado_1 = teclado.nextFloat();
                System.out.print("Insira o segundo lado: ");
                lado_2 = teclado.nextFloat();
                
                totalRetangulo = lado_1 * 2 + lado_2 * 2;
                
                System.out.printf("%s%f%n", "O perímetro total é: ", totalRetangulo);
                
                break;
            case "media":
                float num_1,
                      num_2,
                      num_3,
                      media;
                
                System.out.println("O programa exibe a média de apenas 3 números");
                System.out.print("Insira o primeiro valor: ");
                num_1 = teclado.nextFloat();
                System.out.print("Insira o segundo valor: ");
                num_2 = teclado.nextFloat();
                System.out.print("Insira o terceiro valor: ");
                num_3 = teclado.nextFloat();
                
                media = (num_1 + num_2 + num_3) / 3;
                
                System.out.printf("%s%f%n", "A média total é: ", media);
                break;
            case "aumento":
                double salarioAumento,
                       aumentoCalc,
                       salarioCalc;
                int aumento;
                
                System.out.print("Insira o valor do salario: R$ ");
                salarioAumento = teclado.nextFloat();
                System.out.print("Insira a porcentagem de aumento: % ");
                aumento = teclado.nextInt();
                
                aumentoCalc = salarioAumento * aumento / 100;
                salarioCalc = salarioAumento + aumentoCalc;
                
                System.out.printf("%s%f%n", "O salário com o aumento é: R$ ", salarioCalc);
                
                break;
            case "salariobase":
                float salarioBase,
                      salarioRecalc;
                System.out.print("Insira o seu salário base: R$ ");
                salarioBase = teclado.nextFloat();
                salarioRecalc = salarioBase - (salarioBase * 0.1f) + 50;
                System.out.printf("%s%f%n", "O seu salário com os cálculos ficou: R$ ", salarioRecalc);
                break;
            case "desafio":
                float salarioDesafio;
                System.out.print("Digite o salário atual do funcionário: R$ ");
                salarioDesafio = teclado.nextFloat();
                System.out.printf("%s%f%n", "Seu salário com o aumento é: R$ ", salarioDesafio + (salarioDesafio * 0.25));
                break;
        }
    }
}
