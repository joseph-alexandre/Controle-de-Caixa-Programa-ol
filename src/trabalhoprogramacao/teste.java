
package trabalhoprogramacao;

import java.util.Scanner;


public class teste {
    public static void main(String[] args){
        //Variáveis
        
        
        //Início do sistema - Mensagens
        System.out.print("Bem-vindo(a) ao Caixa. Insira o seu nome: ");
        Scanner teclado = new Scanner(System.in);
        String nome = teclado.nextLine();
        System.out.println("Olá, " + nome + ". É aconselhável que leia as instruções antes de utilizar o programa.");
       
        System.out.println("Menu - Opções:" + "\n- Cardápio" + "\n- Dinheiro total" + "\n- Instrucoes (para Instruções)" + "\n- Sair");
        
        System.out.print("Digite a opção desejada: ");
        String opcao = teclado.nextLine().trim();
        while(!opcao.equalsIgnoreCase("voltar")){
                if (opcao.equalsIgnoreCase("cardápio") || opcao.equalsIgnoreCase("cardapio")){
            System.out.print("Você está em Cardápio." + "\n|Salgados:                 |Doces:" + "\n|Coxinha R$ 5,00           |Bolo R$ 3,50" + "\n|Pão de Queijo R$3,50      |Chocolate R$ 4,00" + "\n|Pastel de Carne R$ 4.50   |Cuca R$ 2,00\n" + "(Digite [Voltar] para retornar ao Menu - Opções)\n");
            
        }
        if (opcao.equalsIgnoreCase("dinheiro total") || opcao.equalsIgnoreCase("dinheirototal")){
            System.out.println("Você está em Dinheiro Total.");
        }
        if (opcao.equalsIgnoreCase("instrucoes")){
            System.out.println("LKÇASKLÇDSAKLÇDSKLÇ");
        }
        if (opcao.equalsIgnoreCase("sair")){
            System.exit(0);
        }
        if (opcao.equalsIgnoreCase("pessini")){
            System.out.println("Me dá um 10, por favor. :D");
            
        }
        break;
        }
         System.out.println("Menu - Opções:" + "\n- Cardápio" + "\n- Dinheiro total" + "\n- Instrucoes (para Instruções)" + "\n- Sair");
        
        System.out.print("Digite a opção desejada: ");
        String voltar = teclado.nextLine().trim();
    
}
}