import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Float saldo = (float) 0.0;
        boolean continuar = true;
        Float deposito;
        Float saque;
        while (continuar) {
            
            int opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    
                    deposito= entrada.nextFloat();
                    saldo = saldo + deposito;
                    System.out.println("Saldo atual: "+saldo);
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    break;
                case 2:
                    
                    saque = entrada.nextFloat();
                    if(saque>saldo){
                      System.out.println("Saldo insuficiente. ");
                      break;
                    }
                    else{
                      saldo = saldo - saque;
                      System.out.println("Saldo atual: "+ saldo);
                      break;
                    }
                    
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                     
                case 3:
                    System.out.println("Saldo atual: "+ saldo);
                    // TODO: Exibir o saldo atual da conta.
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    break;
            }
        }
    } 
}    
