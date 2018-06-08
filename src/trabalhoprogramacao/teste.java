
package trabalhoprogramacao;

import javax.swing.JOptionPane;


public class teste {
    public static void main(String[] args){
       //Mensagem de boas-vindas
       String nome = JOptionPane.showInputDialog("Poderia informar seu nome?");
        JOptionPane.showMessageDialog(null, "Bem-vindo(a) a lanchonete do " +nome+ ".");
        
        //Variáveis
        double custo = 0;
        double custoTotalDia = 0;
       //Botões
        String[] items = {"Pizzas", "Salgados", "Doces", "Bebidas", "Finalizar", "Sair"};
        int escolha = JOptionPane.showOptionDialog(null, "Temos um cardápio que consiste em: ", "Cardápio - Lanchonete do " + nome, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, items, items[0]);
        while(escolha != 5){
                switch(escolha){
                    //Botão "Pizza"
                    case 0: 
                String[] tamanhos = {"Pequena", "Média", "Grande", "Sair"};
               //Botões de tamanhos dentro do "Pizza"
                int escolhaPizza = JOptionPane.showOptionDialog(null, "Selecione o tamanho desejado. Os preços são diferentes conforme o tamanho da Pizza." , "Cardápio - Pizzas", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, tamanhos, tamanhos[0]);
           while(escolhaPizza != 3){
                switch(escolhaPizza){
                    case 0:
                        //Pizza pequena
                        int pizzaPequena = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção do sabor desejado.\n" + "1 - Calabresa     -     R$ 14,75\n" + "2 - Pepperoni     -     R$ 16,50\n" + "3 - À moda da casa do Seu " + nome +"     -     R$ 17,99\n" + "4 - Mussarela     -     R$ 14,75\n" + "5 - Custo atual\n" + "6 - Retornar ao Cardápio"));
                        while (pizzaPequena != 6){
                            switch(pizzaPequena){
                                case 1:
                                    
                                    
                                    int finalizarCalabresa = JOptionPane.showOptionDialog(null, 
                                     "Você deseja comprar Pizza de Calabresa?","", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                                    if (finalizarCalabresa == JOptionPane.YES_OPTION){
                                             int quantidadeCalabresa = Integer.parseInt(JOptionPane.showInputDialog("Quantas?")); 
                                            custo += (quantidadeCalabresa * 14.75);
                                            custoTotalDia += (quantidadeCalabresa * 14.75);
                                            JOptionPane.showMessageDialog(null, "Você comprou "+ quantidadeCalabresa +" Pizza(s) de Calabresa!");
                                    pizzaPequena = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção do sabor desejado.\n" + "1 - Calabresa     -     R$ 14,75\n" + "2 - Pepperoni     -     R$ 16,50\n" + "3 - À moda da casa do Seu " + nome +"     -     R$ 17,99\n" + "4 - Mussarela     -     R$ 14,75\n" + "5 - Custo atual\n" + "6 - Retornar ao Cardápio"));} else if (finalizarCalabresa == JOptionPane.NO_OPTION) {
                                        custo += 0;
                                        custoTotalDia += 0;
                                        
                                        
                                  pizzaPequena = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção do sabor desejado.\n" + "1 - Calabresa     -     R$ 14,75\n" + "2 - Pepperoni     -     R$ 16,50\n" + "3 - À moda da casa do Seu " + nome +"     -     R$ 17,99\n" + "4 - Mussarela     -     R$ 14,75\n" + "5 - Custo atual\n" + "6 - Retornar ao Cardápio"));    
                                    }
                                break;
                                case 2:
                               
                                    
                                      int finalizarPepperoni = JOptionPane.showOptionDialog(null, 
                                     "Você deseja comprar Pizza de Pepperoni?","", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                                    if (finalizarPepperoni == JOptionPane.YES_OPTION){
                                            int quantidadePepperoni = Integer.parseInt(JOptionPane.showInputDialog("Quantas?")); 
                                            custo += (quantidadePepperoni * 16.50);
                                            custoTotalDia += (quantidadePepperoni * 16.50);
                                            JOptionPane.showMessageDialog(null, "Você comprou "+ quantidadePepperoni +" Pizza(s) de Pepperoni!");
                                    pizzaPequena = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção do sabor desejado.\n" + "1 - Calabresa     -     R$ 14,75\n" + "2 - Pepperoni     -     R$ 16,50\n" + "3 - À moda da casa do Seu " + nome +"     -     R$ 17,99\n" + "4 - Mussarela     -     R$ 14,75\n" + "5 - Custo atual\n" + "6 - Retornar ao Cardápio"));} else if (finalizarPepperoni == JOptionPane.NO_OPTION) {
                                        custo += 0;
                                        custoTotalDia += 0;
                                        
                                  pizzaPequena = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção do sabor desejado.\n" + "1 - Calabresa     -     R$ 14,75\n" + "2 - Pepperoni     -     R$ 16,50\n" + "3 - À moda da casa do Seu " + nome +"     -     R$ 17,99\n" + "4 - Mussarela     -     R$ 14,75\n" + "5 - Custo atual\n" + "6 - Retornar ao Cardápio"));      
                                    }                              
                                break;
                                case 3:
                                      int finalizarModa = JOptionPane.showOptionDialog(null, 
                                     "Você deseja comprar Pizza à moda da casa do Seu "+ nome,"", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                                    if (finalizarModa == JOptionPane.YES_OPTION){
                                            int quantidadeModa = Integer.parseInt(JOptionPane.showInputDialog("Quantas?")); 
                                            custo += (quantidadeModa * 17.99);
                                            custoTotalDia += (quantidadeModa * 17.99);
                                            JOptionPane.showMessageDialog(null, "Você comprou "+ quantidadeModa +" Pizza(s) à moda da casa do Seu " + nome + "!");
                                   pizzaPequena = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção do sabor desejado.\n" + "1 - Calabresa     -     R$ 14,75\n" + "2 - Pepperoni     -     R$ 16,50\n" + "3 - À moda da casa do Seu " + nome +"     -     R$ 17,99\n" + "4 - Mussarela     -     R$ 14,75\n" + "5 - Custo atual\n" + "6 - Retornar ao Cardápio"));} else if (finalizarModa == JOptionPane.NO_OPTION) {
                                        custo += 0;
                                        custoTotalDia += 0;
                                        
                                  pizzaPequena = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção do sabor desejado.\n" + "1 - Calabresa     -     R$ 14,75\n" + "2 - Pepperoni     -     R$ 16,50\n" + "3 - À moda da casa do Seu " + nome +"     -     R$ 17,99\n" + "4 - Mussarela     -     R$ 14,75\n" + "5 - Custo atual\n" + "6 - Retornar ao Cardápio"));    
                                    }
                                    break;
                                case 4: 
                                      int finalizarMussarela = JOptionPane.showOptionDialog(null, 
                                     "Você deseja comprar Pizza de Mussarela?","", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                                    if (finalizarMussarela == JOptionPane.YES_OPTION){
                                             int quantidadeMussarela = Integer.parseInt(JOptionPane.showInputDialog("Quantas?")); 
                                            custo += (quantidadeMussarela * 14.75);
                                            custoTotalDia += (quantidadeMussarela * 14.75);
                                            JOptionPane.showMessageDialog(null, "Você comprou "+ quantidadeMussarela +" Pizza(s) de Mussarela!");
                                   pizzaPequena = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção do sabor desejado.\n" + "1 - Calabresa     -     R$ 14,75\n" + "2 - Pepperoni     -     R$ 16,50\n" + "3 - À moda da casa do Seu " + nome +"     -     R$ 17,99\n" + "4 - Mussarela     -     R$ 14,75\n" + "5 - Custo atual\n" + "6 - Retornar ao Cardápio"));} else if (finalizarMussarela == JOptionPane.NO_OPTION) {
                                        custo += 0;
                                        custoTotalDia += 0;
                                        
                                  pizzaPequena = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção do sabor desejado.\n" + "1 - Calabresa     -     R$ 14,75\n" + "2 - Pepperoni     -     R$ 16,50\n" + "3 - À moda da casa do Seu " + nome +"     -     R$ 17,99\n" + "4 - Mussarela     -     R$ 14,75\n" + "5 - Custo atual\n" + "6 - Retornar ao Cardápio"));     
                                    }
                                    break;
                                case 5: 
                                    JOptionPane.showMessageDialog(null, "O custo atual é: " + custo);
                                    pizzaPequena = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção do sabor desejado.\n" + "1 - Calabresa     -     R$ 14,75\n" + "2 - Pepperoni     -     R$ 16,50\n" + "3 - À moda da casa do Seu " + nome +"     -     R$ 17,99\n" + "4 - Mussarela     -     R$ 14,75\n" + "5 - Custo atual\n" + "6 - Retornar ao Cardápio"));
                                break;
                            } 
                        } 
                        escolhaPizza = JOptionPane.showOptionDialog(null, "Selecione o tamanho desejado. Os preços são diferentes conforme o tamanho da Pizza." , "Cardápio - Pizzas", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, tamanhos, tamanhos[0]);
                        
                    break;
                        
                        
                //Pizza média
                    case 1:{
                        int pizzaMedia = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção do sabor desejado.\n" + "1 - Calabresa     -     R$ 24,75\n" + "2 - Pepperoni     -     R$ 26,50\n" + "3 - À moda da casa do Seu " + nome + "     -     R$ 27,99\n" + "4 - Mussarela     -     R$ 24,75\n" + "5 - Custo atual\n" + "6 - Retornar ao Cardápio"));
                        while (pizzaMedia != 6){
                            switch(pizzaMedia){
                                case 1:
                                    
                                    
                                    int finalizarCalabresa = JOptionPane.showOptionDialog(null, 
                                     "Você deseja comprar Pizza de Calabresa?","", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                                    if (finalizarCalabresa == JOptionPane.YES_OPTION){
                                            int quantidadeCalabresa = Integer.parseInt(JOptionPane.showInputDialog("Quantas?")); 
                                            custo += (quantidadeCalabresa * 24.75);
                                            custoTotalDia += (quantidadeCalabresa * 24.75);
                                            JOptionPane.showMessageDialog(null, "Você comprou "+ quantidadeCalabresa +" Pizza(s) de Calabresa!");
                                  pizzaMedia = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção do sabor desejado.\n" + "1 - Calabresa     -     R$ 24,75\n" + "2 - Pepperoni     -     R$ 26,50\n" + "3 - À moda da casa do Seu " + nome + "     -     R$ 27,99\n" + "4 - Mussarela     -     R$ 24,75\n" + "5 - Custo atual\n" + "6 - Retornar ao Cardápio"));} else if (finalizarCalabresa == JOptionPane.NO_OPTION) {
                                        custo += 0;
                                        custoTotalDia += 0;
                                        
                                 pizzaMedia = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção do sabor desejado.\n" + "1 - Calabresa     -     R$ 24,75\n" + "2 - Pepperoni     -     R$ 26,50\n" + "3 - À moda da casa do Seu " + nome + "     -     R$ 27,99\n" + "4 - Mussarela     -     R$ 24,75\n" + "5 - Custo atual\n" + "6 - Retornar ao Cardápio"));
                                    }
                                break;
                                case 2:
                               
                                    
                                      int finalizarPepperoni = JOptionPane.showOptionDialog(null, 
                                     "Você deseja comprar Pizza de Pepperoni?","", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                                    if (finalizarPepperoni == JOptionPane.YES_OPTION){
                                            int quantidadePepperoni = Integer.parseInt(JOptionPane.showInputDialog("Quantas?")); 
                                            custo += (quantidadePepperoni * 26.50);
                                            custoTotalDia += (quantidadePepperoni * 26.50);
                                            JOptionPane.showMessageDialog(null, "Você comprou "+ quantidadePepperoni +" Pizza(s) média de Pepperoni!");
                                   pizzaMedia = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção do sabor desejado.\n" + "1 - Calabresa     -     R$ 24,75\n" + "2 - Pepperoni     -     R$ 26,50\n" + "3 - À moda da casa do Seu " + nome + "     -     R$ 27,99\n" + "4 - Mussarela     -     R$ 24,75\n" + "5 - Custo atual\n" + "6 - Retornar ao Cardápio"));} else if (finalizarPepperoni == JOptionPane.NO_OPTION) {
                                        custo += 0;
                                        custoTotalDia += 0;
                                        
                                  pizzaMedia = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção do sabor desejado.\n" + "1 - Calabresa     -     R$ 24,75\n" + "2 - Pepperoni     -     R$ 26,50\n" + "3 - À moda da casa do Seu " + nome + "     -     R$ 27,99\n" + "4 - Mussarela     -     R$ 24,75\n" + "5 - Custo atual\n" + "6 - Retornar ao Cardápio")); 
                                    }                              
                                break;
                                case 3:
                                      int finalizarModa = JOptionPane.showOptionDialog(null, 
                                     "Você deseja comprar Pizza à moda da casa do Seu " + nome,"", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                                    if (finalizarModa == JOptionPane.YES_OPTION){
                                            int quantidadeModa = Integer.parseInt(JOptionPane.showInputDialog("Quantas?")); 
                                            custo += (quantidadeModa * 27.99);
                                            custoTotalDia += (quantidadeModa * 27.99);
                                            JOptionPane.showMessageDialog(null, "Você comprou "+ quantidadeModa +" Pizza(s) média à moda da casa do Seu "+ nome);
                                   pizzaMedia = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção do sabor desejado.\n" + "1 - Calabresa     -     R$ 24,75\n" + "2 - Pepperoni     -     R$ 26,50\n" + "3 - À moda da casa do Seu " + nome + "     -     R$ 27,99\n" + "4 - Mussarela     -     R$ 24,75\n" + "5 - Custo atual\n" + "6 - Retornar ao Cardápio"));} else if (finalizarModa == JOptionPane.NO_OPTION) {
                                        custo += 0;
                                        custoTotalDia += 0;
                                        
                                 pizzaMedia = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção do sabor desejado.\n" + "1 - Calabresa     -     R$ 24,75\n" + "2 - Pepperoni     -     R$ 26,50\n" + "3 - À moda da casa do Seu " + nome + "     -     R$ 27,99\n" + "4 - Mussarela     -     R$ 24,75\n" + "5 - Custo atual\n" + "6 - Retornar ao Cardápio"));
                                    }
                                    break;
                                case 4: 
                                      int finalizarMussarela = JOptionPane.showOptionDialog(null, 
                                     "Você deseja comprar Pizza de Mussarela?","", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                                    if (finalizarMussarela == JOptionPane.YES_OPTION){
                                           int quantidadeMussarela = Integer.parseInt(JOptionPane.showInputDialog("Quantas?")); 
                                            custo += (quantidadeMussarela * 24.75);
                                            custoTotalDia += (quantidadeMussarela * 24.75);
                                            JOptionPane.showMessageDialog(null, "Você comprou "+ quantidadeMussarela +" Pizza(s) média de Mussarela!");
                                   pizzaMedia = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção do sabor desejado.\n" + "1 - Calabresa     -     R$ 24,75\n" + "2 - Pepperoni     -     R$ 26,50\n" + "3 - À moda da casa do Seu " + nome + "     -     R$ 27,99\n" + "4 - Mussarela     -     R$ 24,75\n" + "5 - Custo atual\n" + "6 - Retornar ao Cardápio"));} else if (finalizarMussarela == JOptionPane.NO_OPTION) {
                                        custo += 0;
                                        custoTotalDia += 0;
                                        
                                 pizzaMedia = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção do sabor desejado.\n" + "1 - Calabresa     -     R$ 24,75\n" + "2 - Pepperoni     -     R$ 26,50\n" + "3 - À moda da casa do Seu " + nome + "     -     R$ 27,99\n" + "4 - Mussarela     -     R$ 24,75\n" + "5 - Custo atual\n" + "6 - Retornar ao Cardápio")); 
                                    }
                                    break;
                                case 5: 
                                    JOptionPane.showMessageDialog(null, "O custo atual é: " + custo);
                                    pizzaMedia = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção do sabor desejado.\n" + "1 - Calabresa     -     R$ 24,75\n" + "2 - Pepperoni     -     R$ 26,50\n" + "3 - À moda da casa do Seu " + nome + "     -     R$ 27,99\n" + "4 - Mussarela     -     R$ 24,75\n" + "5 - Custo atual\n" + "6 - Retornar ao Cardápio"));
                                break; 
                            } }
                        
                        } 
                    
                        escolhaPizza = JOptionPane.showOptionDialog(null, "Selecione o tamanho desejado. Os preços são diferentes conforme o tamanho da Pizza." , "Cardápio - Pizzas", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, tamanhos, tamanhos[0]);
                
                     break;
                    
                    //Pizza grande
                    case 2:{
                         int pizzaGrande = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção do sabor desejado.\n" + "1 - Calabresa     -     R$ 34,75\n" + "2 - Pepperoni     -     R$ 36,50\n" + "3 - À moda da casa do Seu " + nome + "     -     R$ 37,99\n" + "4 - Mussarela     -     R$ 34,75\n" + "5 - Custo atual\n" + "6 - Retornar ao Cardápio"));
                        while (pizzaGrande != 6){
                            switch(pizzaGrande){
                                case 1:
                                    
                                    
                                    int finalizarCalabresa = JOptionPane.showOptionDialog(null, 
                                     "Você deseja comprar Pizza de Calabresa?","", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                                    if (finalizarCalabresa == JOptionPane.YES_OPTION){
                                           int quantidadeCalabresa = Integer.parseInt(JOptionPane.showInputDialog("Quantas?")); 
                                            custo += (quantidadeCalabresa * 34.75);
                                            custoTotalDia += (quantidadeCalabresa * 34.75);
                                            JOptionPane.showMessageDialog(null, "Você comprou "+ quantidadeCalabresa +" Pizza(s) grande de Calabresa!");
                                  pizzaGrande = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção do sabor desejado.\n" + "1 - Calabresa     -     R$ 34,75\n" + "2 - Pepperoni     -     R$ 36,50\n" + "3 - À moda da casa do Seu " + nome + "     -     R$ 37,99\n" + "4 - Mussarela     -     R$ 34,75\n" + "5 - Custo atual\n" + "6 - Retornar ao Cardápio"));} else if (finalizarCalabresa == JOptionPane.NO_OPTION) {
                                        custo += 0;
                                        custoTotalDia += 0;
                                pizzaGrande = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção do sabor desejado.\n" + "1 - Calabresa     -     R$ 34,75\n" + "2 - Pepperoni     -     R$ 36,50\n" + "3 - À moda da casa do Seu " + nome + "     -     R$ 37,99\n" + "4 - Mussarela     -     R$ 34,75\n" + "5 - Custo atual\n" + "6 - Retornar ao Cardápio"));
                                    }
                                break;
                                case 2:
                               
                                    
                                      int finalizarPepperoni = JOptionPane.showOptionDialog(null, 
                                     "Você deseja comprar Pizza de Pepperoni?","", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                                    if (finalizarPepperoni == JOptionPane.YES_OPTION){
                                            int quantidadePepperoni = Integer.parseInt(JOptionPane.showInputDialog("Quantas?")); 
                                            custo += (quantidadePepperoni * 36.50);
                                            custoTotalDia += (quantidadePepperoni * 34.75);
                                            JOptionPane.showMessageDialog(null, "Você comprou "+ quantidadePepperoni +" Pizza(s) grande de Pepperoni!");
                                  pizzaGrande = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção do sabor desejado.\n" + "1 - Calabresa     -     R$ 34,75\n" + "2 - Pepperoni     -     R$ 36,50\n" + "3 - À moda da casa do Seu " + nome + "     -     R$ 37,99\n" + "4 - Mussarela     -     R$ 34,75\n" + "5 - Custo atual\n" + "6 - Retornar ao Cardápio"));} else if (finalizarPepperoni == JOptionPane.NO_OPTION) {
                                        custo += 0;
                                        custoTotalDia += 0;
                                        
                                  pizzaGrande = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção do sabor desejado.\n" + "1 - Calabresa     -     R$ 34,75\n" + "2 - Pepperoni     -     R$ 36,50\n" + "3 - À moda da casa do Seu " + nome + "     -     R$ 37,99\n" + "4 - Mussarela     -     R$ 34,75\n" + "5 - Custo atual\n" + "6 - Retornar ao Cardápio"));
                                    }                              
                                break;
                                case 3:
                                      int finalizarModa = JOptionPane.showOptionDialog(null, 
                                     "Você deseja comprar Pizza à moda da casa do Seu " + nome,"", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                                    if (finalizarModa == JOptionPane.YES_OPTION){
                                             int quantidadeModa = Integer.parseInt(JOptionPane.showInputDialog("Quantas?")); 
                                            custo += (quantidadeModa * 37.99);
                                            custoTotalDia += (quantidadeModa * 37.99);
                                            JOptionPane.showMessageDialog(null, "Você comprou "+ quantidadeModa +" Pizza(s) grande à moda da casa do Seu " + nome);
                                pizzaGrande = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção do sabor desejado.\n" + "1 - Calabresa     -     R$ 34,75\n" + "2 - Pepperoni     -     R$ 36,50\n" + "3 - À moda da casa do Seu " + nome + "     -     R$ 37,99\n" + "4 - Mussarela     -     R$ 34,75\n" + "5 - Custo atual\n" + "6 - Retornar ao Cardápio"));} else if (finalizarModa == JOptionPane.NO_OPTION) {
                                        custo += 0;
                                        custoTotalDia +=0;
                                        
                               pizzaGrande = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção do sabor desejado.\n" + "1 - Calabresa     -     R$ 34,75\n" + "2 - Pepperoni     -     R$ 36,50\n" + "3 - À moda da casa do Seu " + nome + "     -     R$ 37,99\n" + "4 - Mussarela     -     R$ 34,75\n" + "5 - Custo atual\n" + "6 - Retornar ao Cardápio"));
                                    }
                                    break;
                                case 4: 
                                      int finalizarMussarela = JOptionPane.showOptionDialog(null, 
                                     "Você deseja comprar Pizza de Mussarela?","", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                                    if (finalizarMussarela == JOptionPane.YES_OPTION){
                                            int quantidadeMussarela = Integer.parseInt(JOptionPane.showInputDialog("Quantas?")); 
                                            custo += (quantidadeMussarela * 34.75);
                                            custoTotalDia += (quantidadeMussarela * 34.75);
                                            JOptionPane.showMessageDialog(null, "Você comprou "+ quantidadeMussarela +" Pizza(s) grande de Mussarela!");
                                 pizzaGrande = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção do sabor desejado.\n" + "1 - Calabresa     -     R$ 34,75\n" + "2 - Pepperoni     -     R$ 36,50\n" + "3 - À moda da casa do Seu " + nome + "     -     R$ 37,99\n" + "4 - Mussarela     -     R$ 34,75\n" + "5 - Custo atual\n" + "6 - Retornar ao Cardápio"));} else if (finalizarMussarela == JOptionPane.NO_OPTION) {
                                        custo += 0;
                                        custoTotalDia += 0;
                                        
                                pizzaGrande = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção do sabor desejado.\n" + "1 - Calabresa     -     R$ 34,75\n" + "2 - Pepperoni     -     R$ 36,50\n" + "3 - À moda da casa do Seu " + nome + "     -     R$ 37,99\n" + "4 - Mussarela     -     R$ 34,75\n" + "5 - Custo atual\n" + "6 - Retornar ao Cardápio"));
                                    }
                                    break;
                                case 5: 
                                    JOptionPane.showMessageDialog(null, "O custo atual é: " + custo);
                                  pizzaGrande = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção do sabor desejado.\n" + "1 - Calabresa     -     R$ 34,75\n" + "2 - Pepperoni     -     R$ 36,50\n" + "3 - À moda da casa do Seu " + nome + "     -     R$ 37,99\n" + "4 - Mussarela     -     R$ 34,75\n" + "5 - Custo atual\n" + "6 - Retornar ao Cardápio"));
                                break;
                            
                    }   }
                    
                  
                        } 
                       
                   
              escolhaPizza = JOptionPane.showOptionDialog(null, "Selecione o tamanho desejado. Os preços são diferentes conforme o tamanho da Pizza." , "Cardápio - Pizzas", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, tamanhos, tamanhos[0]);  
              
                        
                }
              
        }
              
              escolha = JOptionPane.showOptionDialog(null, "Temos um cardápio que consiste em: ", "Cardápio - Lanchonete do " + nome, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, items, items[0]);
        break;
                    //Botão "Salgados"
                    case 1:
                        int escolhaSalgado = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção de salgado desejado." + "\n1 - Coxinha     -                   R$ 5,00" + "\n2 - Pão de Queijo     -         R$ 3,50" + "\n3 - Pastel de Carne     -     R$ 4,50" + "\n4 - Custo atual" + "\n5 - Retornar ao Cardápio"));
                        while (escolhaSalgado != 5){
                            switch(escolhaSalgado){
                                case 1:
                                     int finalizarCoxinha = JOptionPane.showOptionDialog(null, 
                                     "Você deseja comprar Coxinha?","", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                                    if (finalizarCoxinha == JOptionPane.YES_OPTION){
                                    int quantidadeCoxinha = Integer.parseInt(JOptionPane.showInputDialog("Quantas?")); 
                                            custo += (quantidadeCoxinha * 5.00);
                                            custoTotalDia += (quantidadeCoxinha * 5.00);
                                            JOptionPane.showMessageDialog(null, "Você comprou "+ quantidadeCoxinha +" Coxinha(s)!");
                                  escolhaSalgado = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção de salgado desejado." + "\n1 - Coxinha     -                   R$ 5,00" + "\n2 - Pão de Queijo     -         R$ 3,50" + "\n3 - Pastel de Carne     -     R$ 4,50" + "\n4 - Custo atual" + "\n5 - Retornar ao Cardápio"));}
                                    else if(finalizarCoxinha == JOptionPane.NO_OPTION){
                                     
                                        custo += 0;
                                        custoTotalDia += 0;
                                        escolhaSalgado = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção de salgado desejado." + "\n1 - Coxinha     -                   R$ 5,00" + "\n2 - Pão de Queijo     -         R$ 3,50" + "\n3 - Pastel de Carne     -     R$ 4,50" + "\n4 - Custo atual" + "\n5 - Retornar ao Cardápio"));}
                            
                                    break;
                               
                                case 2:
                                    int finalizarPaoQueijo = JOptionPane.showOptionDialog(null, "Você deseja comprar Pão de Queijo?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                                    if (finalizarPaoQueijo == JOptionPane.YES_OPTION){
                                        int quantidadePaoQueijo = Integer.parseInt(JOptionPane.showInputDialog("Quantos?"));
                                        custo += (quantidadePaoQueijo * 3.50);
                                        custoTotalDia += (quantidadePaoQueijo * 3.50);
                                        JOptionPane.showMessageDialog(null, "Você comprou " + quantidadePaoQueijo + " Pão(es) de Queijo!");
                                        escolhaSalgado = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção de salgado desejado." + "\n1 - Coxinha     -                   R$ 5,00" + "\n2 - Pão de Queijo     -         R$ 3,50" + "\n3 - Pastel de Carne     -     R$ 4,50" + "\n4 - Custo atual" + "\n5 - Retornar ao Cardápio"));}
                                    else if (finalizarPaoQueijo == JOptionPane.NO_OPTION){
                                        custo += 0;
                                        custoTotalDia += 0;
                                        escolhaSalgado = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção de salgado desejado." + "\n1 - Coxinha     -                   R$ 5,00" + "\n2 - Pão de Queijo     -         R$ 3,50" + "\n3 - Pastel de Carne     -     R$ 4,50" + "\n4 - Custo atual" + "\n5 - Retornar ao Cardápio"));}
                                    
                                    break;
                                    
                                case 3:
                                    int finalizarPastelCarne = JOptionPane.showOptionDialog(null, "Você deseja comprar Pastel(éis) de Carne?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                                    if (finalizarPastelCarne == JOptionPane.YES_OPTION){
                                        int quantidadePastelCarne = Integer.parseInt(JOptionPane.showInputDialog("Quantos?"));
                                        custo += (quantidadePastelCarne * 4.50);
                                        custoTotalDia += (quantidadePastelCarne * 4.50);
                                        JOptionPane.showMessageDialog(null, "Você comprou " + quantidadePastelCarne + " Pastel(éis) de Carne!");
                                        escolhaSalgado = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção de salgado desejado." + "\n1 - Coxinha     -                   R$ 5,00" + "\n2 - Pão de Queijo     -         R$ 3,50" + "\n3 - Pastel de Carne     -     R$ 4,50" + "\n4 - Custo atual" + "\n5 - Retornar ao Cardápio"));}
                                    else if (finalizarPastelCarne == JOptionPane.NO_OPTION){
                                        custo += 0;
                                        custoTotalDia += 0;
                                        escolhaSalgado = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção de salgado desejado." + "\n1 - Coxinha     -                   R$ 5,00" + "\n2 - Pão de Queijo     -         R$ 3,50" + "\n3 - Pastel de Carne     -     R$ 4,50" + "\n4 - Custo atual" + "\n5 - Retornar ao Cardápio"));}
                                    break;
                                case 4: 
                                    JOptionPane.showMessageDialog(null, "O custo atual é: R$" + custo);
                                    escolhaSalgado = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção de salgado desejado." + "\n1 - Coxinha     -                   R$ 5,00" + "\n2 - Pão de Queijo     -         R$ 3,50" + "\n3 - Pastel de Carne     -     R$ 4,50" + "\n4 - Custo atual" + "\n5 - Retornar ao Cardápio"));
                                    break;
         } 
                        }
                        
        escolha = JOptionPane.showOptionDialog(null, "Temos um cardápio que consiste em: ", "Cardápio - Lanchonete do " + nome, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, items, items[0]);
                 break;
                        //Botão "Doces"
                        case 2:
                          int escolhaDoces = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção de doce desejado." + "\n1 - Bolo                -     R$ 4,50" + "\n2 - Chocolate     -     R$ 4,00" + "\n3 - Cuca              -     R$ 3,00" + "\n4 - Custo atual" + "\n5 - Retornar ao menu"));
                          while (escolhaDoces != 5){
                              switch(escolhaDoces){
                                  case 1:
                                       int finalizarBolo = JOptionPane.showOptionDialog(null, 
                                     "Você deseja comprar Bolo?","", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                                    if (finalizarBolo == JOptionPane.YES_OPTION){
                                    int quantidadeBolo = Integer.parseInt(JOptionPane.showInputDialog("Quantos?")); 
                                            custo += (quantidadeBolo * 4.50);
                                            custoTotalDia += (quantidadeBolo * 4.50);
                                            JOptionPane.showMessageDialog(null, "Você comprou "+ quantidadeBolo +" Bolo(s)!");
                                  escolhaDoces = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção de doce desejado." + "\n1 - Bolo                -     R$ 4,50" + "\n2 - Chocolate     -     R$ 4,00" + "\n3 - Cuca              -     R$ 3,00" + "\n4 - Custo atual" + "\n5 - Retornar ao menu"));}
                                    else if(finalizarBolo == JOptionPane.NO_OPTION){
                                     
                                        custo += 0;
                                        custoTotalDia += 0;
                                        escolhaDoces = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção de doce desejado." + "\n1 - Bolo                -     R$ 4,50" + "\n2 - Chocolate     -     R$ 4,00" + "\n3 - Cuca              -     R$ 3,00" + "\n4 - Custo atual" + "\n5 - Retornar ao menu"));}
                                      break;
                                  case 2:
                                      int finalizarChocolate = JOptionPane.showOptionDialog(null, 
                                     "Você deseja comprar Chocolate?","", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                                    if (finalizarChocolate == JOptionPane.YES_OPTION){
                                    int quantidadeChocolate = Integer.parseInt(JOptionPane.showInputDialog("Quantos?")); 
                                            custo += (quantidadeChocolate * 4.50);
                                            custoTotalDia += (quantidadeChocolate * 4.50);
                                            JOptionPane.showMessageDialog(null, "Você comprou "+ quantidadeChocolate +" Chocolate(s)!");
                                  escolhaDoces = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção de doce desejado." + "\n1 - Bolo                -     R$ 4,50" + "\n2 - Chocolate     -     R$ 4,00" + "\n3 - Cuca              -     R$ 3,00" + "\n4 - Custo atual" + "\n5 - Retornar ao menu"));}
                                    else if(finalizarChocolate == JOptionPane.NO_OPTION){
                                     
                                        custo += 0;
                                        custoTotalDia += 0;
                                        escolhaDoces = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção de doce desejado." + "\n1 - Bolo                -     R$ 4,50" + "\n2 - Chocolate     -     R$ 4,00" + "\n3 - Cuca              -     R$ 3,00" + "\n4 - Custo atual" + "\n5 - Retornar ao menu"));
                                        
                              }
                                    break;
                                  case 3: 
                                      int finalizarCuca = JOptionPane.showOptionDialog(null, 
                                     "Você deseja comprar Cuca?","", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                                    if (finalizarCuca == JOptionPane.YES_OPTION){
                                    int quantidadeCuca = Integer.parseInt(JOptionPane.showInputDialog("Quantas?")); 
                                            custo += (quantidadeCuca * 3.00);
                                            custoTotalDia += (quantidadeCuca * 3.00);
                                            JOptionPane.showMessageDialog(null, "Você comprou "+ quantidadeCuca +" Chocolate(s)!");
                                  escolhaDoces = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção de doce desejado." + "\n1 - Bolo                -     R$ 4,50" + "\n2 - Chocolate     -     R$ 4,00" + "\n3 - Cuca              -     R$ 3,00" + "\n4 - Custo atual" + "\n5 - Retornar ao menu"));}
                                    else if(finalizarCuca == JOptionPane.NO_OPTION){
                                     
                                        custo += 0;
                                        custoTotalDia += 0;
                                        escolhaDoces = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção de doce desejado." + "\n1 - Bolo                -     R$ 4,50" + "\n2 - Chocolate     -     R$ 4,00" + "\n3 - Cuca              -     R$ 3,00" + "\n4 - Custo atual" + "\n5 - Retornar ao menu"));
                                        
                              }
                              break;
                                  case 4:
                                      JOptionPane.showMessageDialog(null, "O custo atual é: R$" + custo);
                                      escolhaDoces = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção de doce desejado." + "\n1 - Bolo                -     R$ 4,50" + "\n2 - Chocolate     -     R$ 4,00" + "\n3 - Cuca              -     R$ 3,00" + "\n4 - Custo atual" + "\n5 - Retornar ao menu"));
                                      break;
                              }
                              
                        }
                        
        escolha = JOptionPane.showOptionDialog(null, "Temos um cardápio que consiste em: ", "Cardápio - Lanchonete do " + nome, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, items, items[0]);
                 break;
                        //Botão "Bebidas"
                        case 3:
                            int escolhaBebidas = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção de bebida desejada." + "\n1 - Refrigerante     -     (Conferir sabores)" + "\n2 - Café     -                    (Conferir sabores)" + "\n3 - Água     -                   (Conferir tamanhos)" + "\n4 - Custo atual" + "\n5 - Retornar ao menu"));
                            while(escolhaBebidas != 5){
                                switch(escolhaBebidas){
                                    case 1: 
                                  //tamanhos dos refri
                                        String [] tamanhoRefri = {"600ml", "1,5 litros", "Sair"};
                                  int escolhaTamanhoRefri = JOptionPane.showOptionDialog(null, "Selecione o tamanho de refrigerante desejado:", "Bebidas - Refrigerantes", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, tamanhoRefri, tamanhoRefri[0]);
                                  while(escolhaTamanhoRefri != 2){
                                      switch(escolhaTamanhoRefri){
                                         // Refri 600ml
                                          case 0:
                                        String[] refri600ml = {"Coca-Cola", "Pepsi", "Guaraná", "Jesus", "Sair"};
        int escolhaRefri600ml = JOptionPane.showOptionDialog(null, "Selecione o sabor do Refrigerante desejado:" + "\nCoca-Cola - R$ 5,00" + "\nPepsi - R$ 4,50" + "\nGuaraná - R$ 4,00" + "\nJesus - R$ 2,00", "Refrigerantes - 600ml", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, refri600ml, refri600ml[0]);
                                while(escolhaRefri600ml != 4){
                                    switch (escolhaRefri600ml){
                                    
                                        case 0:
                                            int finalizarCoca = JOptionPane.showOptionDialog(null, 
                                     "Você deseja comprar Coca-Cola?","", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                                    if (finalizarCoca == JOptionPane.YES_OPTION){
                                    int quantidadeCoca = Integer.parseInt(JOptionPane.showInputDialog("Quantas?")); 
                                            custo += (quantidadeCoca * 5.00);
                                            custoTotalDia += (quantidadeCoca * 5.00);
                                            JOptionPane.showMessageDialog(null, "Você comprou "+ quantidadeCoca +" garrafinha(s) de Coca-Cola!");
                                  escolhaRefri600ml = JOptionPane.showOptionDialog(null, "Selecione o sabor do Refrigerante desejado:" + "\nCoca-Cola - R$ 5,00" + "\nPepsi - R$ 4,50" + "\nGuaraná - R$ 4,00" + "\nJesus - R$ 2,00", "Refrigerantes - 600ml", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, refri600ml, refri600ml[0]);}
                                    else if(finalizarCoca == JOptionPane.NO_OPTION){
                                     
                                        custo += 0;
                                        custoTotalDia += 0;
                                        escolhaRefri600ml = JOptionPane.showOptionDialog(null, "Selecione o sabor do Refrigerante desejado:" + "\nCoca-Cola - R$ 5,00" + "\nPepsi - R$ 4,50" + "\nGuaraná - R$ 4,00" + "\nJesus - R$ 2,00", "Refrigerantes - 600ml", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, refri600ml, refri600ml[0]);}
                                        break;
                                        
                                        case 1:
                                             int finalizarPepsi = JOptionPane.showOptionDialog(null, 
                                     "Você deseja comprar Pepsi?","", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                                    if (finalizarPepsi == JOptionPane.YES_OPTION){
                                    int quantidadePepsi = Integer.parseInt(JOptionPane.showInputDialog("Quantas?")); 
                                            custo += (quantidadePepsi * 4.50);
                                            custoTotalDia += (quantidadePepsi * 4.50);
                                            JOptionPane.showMessageDialog(null, "Você comprou "+ quantidadePepsi +" garrafinha(s) de Pepsi!");
                                  escolhaRefri600ml = JOptionPane.showOptionDialog(null, "Selecione o sabor do Refrigerante desejado:" + "\nCoca-Cola - R$ 5,00" + "\nPepsi - R$ 4,50" + "\nGuaraná - R$ 4,00" + "\nJesus - R$ 2,00", "Refrigerantes - 600ml", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, refri600ml, refri600ml[0]);}
                                    else if(finalizarPepsi == JOptionPane.NO_OPTION){
                                     
                                        custo += 0;
                                        custoTotalDia += 0;
                                        escolhaRefri600ml = JOptionPane.showOptionDialog(null, "Selecione o sabor do Refrigerante desejado:" + "\nCoca-Cola - R$ 5,00" + "\nPepsi - R$ 4,50" + "\nGuaraná - R$ 4,00" + "\nJesus - R$ 2,00", "Refrigerantes - 600ml", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, refri600ml, refri600ml[0]);}
                                        break;
                                        
                                        case 2:
                                             int finalizarGuarana = JOptionPane.showOptionDialog(null, 
                                     "Você deseja comprar Guaraná?","", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                                    if (finalizarGuarana == JOptionPane.YES_OPTION){
                                    int quantidadeGuarana = Integer.parseInt(JOptionPane.showInputDialog("Quantas?")); 
                                            custo += (quantidadeGuarana * 4.00);
                                            custoTotalDia += (quantidadeGuarana * 4.00);
                                            JOptionPane.showMessageDialog(null, "Você comprou "+ quantidadeGuarana +" garrafinha(s) de Guarana!");
                                 escolhaRefri600ml = JOptionPane.showOptionDialog(null, "Selecione o sabor do Refrigerante desejado:" + "\nCoca-Cola - R$ 5,00" + "\nPepsi - R$ 4,50" + "\nGuaraná - R$ 4,00" + "\nJesus - R$ 2,00", "Refrigerantes - 600ml", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, refri600ml, refri600ml[0]);}
                                    else if(finalizarGuarana == JOptionPane.NO_OPTION){
                                     
                                        custo += 0;
                                        custoTotalDia += 0;
                                        escolhaRefri600ml = JOptionPane.showOptionDialog(null, "Selecione o sabor do Refrigerante desejado:" + "\nCoca-Cola - R$ 5,00" + "\nPepsi - R$ 4,50" + "\nGuaraná - R$ 4,00" + "\nJesus - R$ 2,00", "Refrigerantes - 600ml", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, refri600ml, refri600ml[0]);}
                                        break;
                                        
                                        case 3: 
                                             int finalizarJesus = JOptionPane.showOptionDialog(null, 
                                     "Você deseja comprar Jesus?","", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                                    if (finalizarJesus == JOptionPane.YES_OPTION){
                                    int quantidadeJesus = Integer.parseInt(JOptionPane.showInputDialog("Quantas?"));
                                     if(quantidadeJesus == 5){custo += (quantidadeJesus * 2.00) - 1;
                                                              custoTotalDia += (quantidadeJesus * 2.00) - 1;
                                     JOptionPane.showMessageDialog(null, "Preço de "+ quantidadeJesus +" garrafinhas de Jesus custa R$ 9.00, porque só Jesus é 10! xD");}
                                     else {custo += (quantidadeJesus * 2.00);
                                           custoTotalDia += (quantidadeJesus * 2.00);}
                                            JOptionPane.showMessageDialog(null, "Você comprou "+ quantidadeJesus +" garrafinha(s) de Jesus!");
                                  escolhaRefri600ml = JOptionPane.showOptionDialog(null, "Selecione o sabor do Refrigerante desejado:" + "\nCoca-Cola - R$ 5,00" + "\nPepsi - R$ 4,50" + "\nGuaraná - R$ 4,00" + "\nJesus - R$ 2,00", "Refrigerantes - 600ml", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, refri600ml, refri600ml[0]);}
                                    else if(finalizarJesus == JOptionPane.NO_OPTION){
                                     
                                        custo += 0;
                                        custoTotalDia += 0;
                                        escolhaRefri600ml = JOptionPane.showOptionDialog(null, "Selecione o sabor do Refrigerante desejado:" + "\nCoca-Cola - R$ 5,00" + "\nPepsi - R$ 4,50" + "\nGuaraná - R$ 4,00" + "\nJesus - R$ 2,00", "Refrigerantes - 600ml", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, refri600ml, refri600ml[0]);}
                                        break;
                                            
                                            
                                    
                                    
                                }
                                }
                                escolhaTamanhoRefri = JOptionPane.showOptionDialog(null, "Selecione o tamanho de refrigerante desejado:", "Bebidas - Refrigerantes", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, tamanhoRefri, tamanhoRefri[0]);
                                break;
                                
                                          // Refri 1,5 litros
                                          case 1:
                                            String[] refri15l = {"Coca-Cola", "Pepsi", "Guaraná", "Jesus", "Sair"};
        int escolhaRefri15l = JOptionPane.showOptionDialog(null, "Selecione o sabor do Refrigerante desejado:" + "\nCoca-Cola - R$ 8,00" + "\nPepsi - R$ 7,50" + "\nGuaraná - R$ 6,00" + "\nJesus - R$ 5,00", "Refrigerantes - 1,5 litros", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, refri15l, refri15l[0]);
                                while(escolhaRefri15l != 4){
                                    switch (escolhaRefri15l){
                                    
                                        case 0:
                                            int finalizarCoca = JOptionPane.showOptionDialog(null, 
                                     "Você deseja comprar Coca-Cola?","", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                                    if (finalizarCoca == JOptionPane.YES_OPTION){
                                    int quantidadeCoca = Integer.parseInt(JOptionPane.showInputDialog("Quantas?")); 
                                            custo += (quantidadeCoca * 8.00);
                                            custoTotalDia += (quantidadeCoca * 8.00);
                                            JOptionPane.showMessageDialog(null, "Você comprou "+ quantidadeCoca +" garrafinha(s) de Coca-Cola!");
                                  escolhaRefri15l = JOptionPane.showOptionDialog(null, "Selecione o sabor do Refrigerante desejado:" + "\nCoca-Cola - R$ 8,00" + "\nPepsi - R$ 7,50" + "\nGuaraná - R$ 6,00" + "\nJesus - R$ 5,00", "Refrigerantes - 1,5 litros", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, refri15l, refri15l[0]);}
                                    else if(finalizarCoca == JOptionPane.NO_OPTION){
                                     
                                        custo += 0;
                                        custoTotalDia += 0;
                                        escolhaRefri15l = JOptionPane.showOptionDialog(null, "Selecione o sabor do Refrigerante desejado:" + "\nCoca-Cola - R$ 8,00" + "\nPepsi - R$ 7,50" + "\nGuaraná - R$ 6,00" + "\nJesus - R$ 5,00", "Refrigerantes - 1,5 litros", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, refri15l, refri15l[0]);}
                                        break;
                                        
                                        case 1:
                                             int finalizarPepsi = JOptionPane.showOptionDialog(null, 
                                     "Você deseja comprar Pepsi?","", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                                    if (finalizarPepsi == JOptionPane.YES_OPTION){
                                    int quantidadePepsi = Integer.parseInt(JOptionPane.showInputDialog("Quantas?")); 
                                            custo += (quantidadePepsi * 7.50);
                                            custoTotalDia += (quantidadePepsi * 7.50);
                                            JOptionPane.showMessageDialog(null, "Você comprou "+ quantidadePepsi +" garrafinha(s) de Pepsi!");
                                escolhaRefri15l = JOptionPane.showOptionDialog(null, "Selecione o sabor do Refrigerante desejado:" + "\nCoca-Cola - R$ 8,00" + "\nPepsi - R$ 7,50" + "\nGuaraná - R$ 6,00" + "\nJesus - R$ 5,00", "Refrigerantes - 1,5 litros", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, refri15l, refri15l[0]);}
                                    else if(finalizarPepsi == JOptionPane.NO_OPTION){
                                     
                                        custo += 0;
                                        custoTotalDia += 0;
                                       escolhaRefri15l = JOptionPane.showOptionDialog(null, "Selecione o sabor do Refrigerante desejado:" + "\nCoca-Cola - R$ 8,00" + "\nPepsi - R$ 7,50" + "\nGuaraná - R$ 6,00" + "\nJesus - R$ 5,00", "Refrigerantes - 1,5 litros", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, refri15l, refri15l[0]);}
                                        break;
                                        
                                        case 2:
                                             int finalizarGuarana = JOptionPane.showOptionDialog(null, 
                                     "Você deseja comprar Guaraná?","", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                                    if (finalizarGuarana == JOptionPane.YES_OPTION){
                                    int quantidadeGuarana = Integer.parseInt(JOptionPane.showInputDialog("Quantas?")); 
                                            custo += (quantidadeGuarana * 6.00);
                                            custoTotalDia += (quantidadeGuarana * 6.00);
                                            JOptionPane.showMessageDialog(null, "Você comprou "+ quantidadeGuarana +" garrafinha(s) de Guarana!");
                                  escolhaRefri15l = JOptionPane.showOptionDialog(null, "Selecione o sabor do Refrigerante desejado:" + "\nCoca-Cola - R$ 8,00" + "\nPepsi - R$ 7,50" + "\nGuaraná - R$ 6,00" + "\nJesus - R$ 5,00", "Refrigerantes - 1,5 litros", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, refri15l, refri15l[0]);}
                                    else if(finalizarGuarana == JOptionPane.NO_OPTION){
                                     
                                        custo += 0;
                                        custoTotalDia += 0;
                                        escolhaRefri15l = JOptionPane.showOptionDialog(null, "Selecione o sabor do Refrigerante desejado:" + "\nCoca-Cola - R$ 8,00" + "\nPepsi - R$ 7,50" + "\nGuaraná - R$ 6,00" + "\nJesus - R$ 5,00", "Refrigerantes - 1,5 litros", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, refri15l, refri15l[0]);}
                                        break;
                                        
                                        case 3: 
                                             int finalizarJesus = JOptionPane.showOptionDialog(null, 
                                     "Você deseja comprar Jesus?","", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                                    if (finalizarJesus == JOptionPane.YES_OPTION){
                                    int quantidadeJesus = Integer.parseInt(JOptionPane.showInputDialog("Quantas?"));
                                     if(quantidadeJesus == 2){custo += (quantidadeJesus * 5.00) - 1;
                                                              custoTotalDia += (quantidadeJesus * 5.00) - 1;
                                     JOptionPane.showMessageDialog(null, "Preço de "+ quantidadeJesus +" garrafinhas de Jesus custa R$ 9.00, porque só Jesus é 10! xD");}
                                     else {custo += (quantidadeJesus * 5.00);
                                           custoTotalDia += (quantidadeJesus * 5.00);}
                                            JOptionPane.showMessageDialog(null, "Você comprou "+ quantidadeJesus +" garrafinha(s) de Jesus!");
                                  escolhaRefri15l = JOptionPane.showOptionDialog(null, "Selecione o sabor do Refrigerante desejado:" + "\nCoca-Cola - R$ 8,00" + "\nPepsi - R$ 7,50" + "\nGuaraná - R$ 6,00" + "\nJesus - R$ 5,00", "Refrigerantes - 1,5 litros", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, refri15l, refri15l[0]);}
                                    else if(finalizarJesus == JOptionPane.NO_OPTION){
                                     
                                        custo += 0;
                                        custoTotalDia += 0;
                                        escolhaRefri15l = JOptionPane.showOptionDialog(null, "Selecione o sabor do Refrigerante desejado:" + "\nCoca-Cola - R$ 8,00" + "\nPepsi - R$ 7,50" + "\nGuaraná - R$ 6,00" + "\nJesus - R$ 5,00", "Refrigerantes - 1,5 litros", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, refri15l, refri15l[0]);}
                                        break;
                                            
                                            
                                    
                                    
                                } 
                                }
                                escolhaTamanhoRefri = JOptionPane.showOptionDialog(null, "Selecione o tamanho de refrigerante desejado:", "Bebidas - Refrigerantes", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, tamanhoRefri, tamanhoRefri[0]);
                                break;
                                              
                                }
                                      
                                      
                                }
                                  escolhaBebidas = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção de bebida desejada." + "\n1 - Refrigerante     -     (Conferir sabores)" + "\n2 - Café     -                    (Conferir sabores)" + "\n3 - Água     -                   (Conferir tamanhos)" + "\n4 - Custo atual" + "\n5 - Retornar ao menu"));
                                  break;
                                  //Sabores café
                                  
                                    case 2:
                                        String[] cafeSabores = {"Café Expresso", "Cappuccino", "Cappuccino com Chocolate", "Sair"};
        int cafeEscolha = JOptionPane.showOptionDialog(null, "Selecione o sabor desejado: " + "\nCafé Expresso - R$ 1.50" + "\nCappuccino - R$ 3,00" + "\nCappuccino com Chocolate - R$ 4,50", "Bebidas - Café", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, cafeSabores, cafeSabores[0]);
                                while (cafeEscolha != 3){
                                    switch (cafeEscolha){
                                        case 0:
                                            int finalizarExpresso = JOptionPane.showOptionDialog(null, 
                                     "Você deseja comprar Café Expresso?","", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                                    if (finalizarExpresso == JOptionPane.YES_OPTION){
                                    int quantidadeExpresso = Integer.parseInt(JOptionPane.showInputDialog("Quantos?")); 
                                            custo += (quantidadeExpresso * 1.50);
                                            custoTotalDia += (quantidadeExpresso * 1.50);
                                            JOptionPane.showMessageDialog(null, "Você comprou "+ quantidadeExpresso +" xícara(s) de Café Expresso!");
                                cafeEscolha = JOptionPane.showOptionDialog(null, "Selecione o sabor desejado: " + "\nCafé Expresso - R$ 1.50" + "\nCappuccino - R$ 3,00" + "\nCappuccino com Chocolate - R$ 4,50", "Bebidas - Café", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, cafeSabores, cafeSabores[0]);}
                                    else if(finalizarExpresso == JOptionPane.NO_OPTION){
                                     
                                        custo += 0;
                                        custoTotalDia += 0;
                                       cafeEscolha = JOptionPane.showOptionDialog(null, "Selecione o sabor desejado: " + "\nCafé Expresso - R$ 1.50" + "\nCappuccino - R$ 3,00" + "\nCappuccino com Chocolate - R$ 4,50", "Bebidas - Café", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, cafeSabores, cafeSabores[0]);}
                                     break;
                                        case 1:
                                            int finalizarCappuccino = JOptionPane.showOptionDialog(null, 
                                     "Você deseja comprar Cappuccino","", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                                    if (finalizarCappuccino == JOptionPane.YES_OPTION){
                                    int quantidadeCappuccino = Integer.parseInt(JOptionPane.showInputDialog("Quantos?"));
                                     if(quantidadeCappuccino == 77){custo += (quantidadeCappuccino * 3.00);
                                                                    custoTotalDia += (quantidadeCappuccino * 3.00);
                                     JOptionPane.showMessageDialog(null, "É Cappuccino ou Al Pacino? xD");}
                                     else {custo += (quantidadeCappuccino * 5.00);
                                          custoTotalDia += (quantidadeCappuccino * 5.00);}
                                            JOptionPane.showMessageDialog(null, "Você comprou "+ quantidadeCappuccino +" xícara(s) de Cappuccino!");
                                  cafeEscolha = JOptionPane.showOptionDialog(null, "Selecione o sabor desejado: " + "\nCafé Expresso - R$ 1.50" + "\nCappuccino - R$ 3,00" + "\nCappuccino com Chocolate - R$ 4,50", "Bebidas - Café", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, cafeSabores, cafeSabores[0]);}
                                    else if(finalizarCappuccino == JOptionPane.NO_OPTION){
                                     
                                        custo += 0;
                                        custoTotalDia += 0;
                                        cafeEscolha = JOptionPane.showOptionDialog(null, "Selecione o sabor desejado: " + "\nCafé Expresso - R$ 1.50" + "\nCappuccino - R$ 3,00" + "\nCappuccino com Chocolate - R$ 4,50", "Bebidas - Café", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, cafeSabores, cafeSabores[0]);}
                                    break;
                                        case 2:
                                              int finalizarCappuccinoChocolate = JOptionPane.showOptionDialog(null, 
                                     "Você deseja comprar Cappuccino com Chocolate?","", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                                    if (finalizarCappuccinoChocolate == JOptionPane.YES_OPTION){
                                    int quantidadeCappuccinoChocolate = Integer.parseInt(JOptionPane.showInputDialog("Quantos?")); 
                                            custo += (quantidadeCappuccinoChocolate * 3.00);
                                            custoTotalDia += (quantidadeCappuccinoChocolate * 3.00);
                                            JOptionPane.showMessageDialog(null, "Você comprou "+ quantidadeCappuccinoChocolate +" xícara(s) de Cappuccino com Chocolate!");
                                cafeEscolha = JOptionPane.showOptionDialog(null, "Selecione o sabor desejado: " + "\nCafé Expresso - R$ 1.50" + "\nCappuccino - R$ 3,00" + "\nCappuccino com Chocolate - R$ 4,50", "Bebidas - Café", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, cafeSabores, cafeSabores[0]);}
                                    else if(finalizarCappuccinoChocolate == JOptionPane.NO_OPTION){
                                     
                                        custo += 0;
                                        custoTotalDia += 0;
                                       cafeEscolha = JOptionPane.showOptionDialog(null, "Selecione o sabor desejado: " + "\nCafé Expresso - R$ 1.50" + "\nCappuccino - R$ 3,00" + "\nCappuccino com Chocolate - R$ 4,50", "Bebidas - Café", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, cafeSabores, cafeSabores[0]);}
                                      break;
                                    }
                                }
                                escolhaBebidas = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção de bebida desejada." + "\n1 - Refrigerante     -     (Conferir sabores)" + "\n2 - Café     -                    (Conferir sabores)" + "\n3 - Água     -                   (Conferir tamanhos)" + "\n4 - Custo atual" + "\n5 - Retornar ao menu"));
                                break;
                                
                                //tipo de Água
                                    case 3:
                                  String[] tipoAgua = {"Com Gás", "Sem Gás", "Sair"};
                                  int tipoAguaEscolha = JOptionPane.showOptionDialog(null, "Selecione o tipo de água desejado:", "Bebidas - Água", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, tipoAgua, tipoAgua[0]);
                                  while(tipoAguaEscolha != 2){
                                      switch(tipoAguaEscolha){
                                          case 0:
                                              String[] tamanhoAgua = {"500ml", "1,5 litros", "Sair"};
        int aguaTamanhoEscolhaComGas = JOptionPane.showOptionDialog(null, "Selecione o tamanho de água desejado:" + "\n500ml - R$ 3,50" + "\n1,5 litros - R$5,50", "Bebidas - Água", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, tamanhoAgua, tamanhoAgua[0]);
                        while(aguaTamanhoEscolhaComGas != 2){
                            switch(aguaTamanhoEscolhaComGas){
                                case 0: 
                                    int finalizar500ml = JOptionPane.showOptionDialog(null, 
                                     "Você deseja comprar garrafinha d'água 500ml?","", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                                    if (finalizar500ml == JOptionPane.YES_OPTION){
                                    int quantidade500ml = Integer.parseInt(JOptionPane.showInputDialog("Quantas?")); 
                                            custo += (quantidade500ml * 3.50);
                                            custoTotalDia += (quantidade500ml * 3.50);
                                            JOptionPane.showMessageDialog(null, "Você comprou "+ quantidade500ml +" garrafinha(s) d'água 500ml!");
                                  aguaTamanhoEscolhaComGas = JOptionPane.showOptionDialog(null, "Selecione o tamanho de água desejado:" + "\n500ml - R$ 3,50" + "\n1,5 litros - R$5,50", "Bebidas - Água", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, tamanhoAgua, tamanhoAgua[0]);}
                                    else if(finalizar500ml == JOptionPane.NO_OPTION){
                                     
                                        custo += 0;
                                        custoTotalDia += 0;
                                        aguaTamanhoEscolhaComGas = JOptionPane.showOptionDialog(null, "Selecione o tamanho de água desejado:" + "\n500ml - R$ 3,50" + "\n1,5 litros - R$5,50", "Bebidas - Água", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, tamanhoAgua, tamanhoAgua[0]);}
                                                break;
                                                case 1:
                                                int finalizar15l = JOptionPane.showOptionDialog(null, 
                                     "Você deseja comprar garrafa d'água 1,5 litros?","", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                                    if (finalizar15l == JOptionPane.YES_OPTION){
                                    int quantidade15l = Integer.parseInt(JOptionPane.showInputDialog("Quantas?")); 
                                            custo += (quantidade15l * 5.50);
                                            custoTotalDia += (quantidade15l * 5.50);
                                            JOptionPane.showMessageDialog(null, "Você comprou "+ quantidade15l +" garrafa(s) d'água 1,5 litros!");
                                  aguaTamanhoEscolhaComGas = JOptionPane.showOptionDialog(null, "Selecione o tamanho de água desejado:" + "\n500ml - R$ 3,50" + "\n1,5 litros - R$5,50", "Bebidas - Água", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, tamanhoAgua, tamanhoAgua[0]);}
                                    else if(finalizar15l == JOptionPane.NO_OPTION){
                                     
                                        custo += 0;
                                        custoTotalDia += 0;
                                        aguaTamanhoEscolhaComGas = JOptionPane.showOptionDialog(null, "Selecione o tamanho de água desejado:" + "\n500ml - R$ 3,50" + "\n1,5 litros - R$5,50", "Bebidas - Água", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, tamanhoAgua, tamanhoAgua[0]);}
                                    
                                    break;
                                    
                            }
                        }
                        tipoAguaEscolha = JOptionPane.showOptionDialog(null, "Selecione o tipo de água desejado:", "Bebidas - Água", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, tipoAgua, tipoAgua[0]);
                                    break;
                                           case 1:
                                               String[] tamanhoAguaSemGas = {"500ml", "1,5 litros", "Sair"};
        int aguaTamanhoEscolhaSemGas = JOptionPane.showOptionDialog(null, "Selecione o tamanho de água desejado:" + "\n500ml - R$ 3,50" + "\n1,5 litros - R$5,50", "Bebidas - Água", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, tamanhoAguaSemGas, tamanhoAguaSemGas[0]);
                                    while (aguaTamanhoEscolhaSemGas != 2){
                                        switch(aguaTamanhoEscolhaSemGas){
                                            case 0:
                                                 int finalizar500ml = JOptionPane.showOptionDialog(null, 
                                     "Você deseja comprar garrafa(s) d'água de 500ml?","", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                                    if (finalizar500ml == JOptionPane.YES_OPTION){
                                    int quantidade500ml = Integer.parseInt(JOptionPane.showInputDialog("Quantas?")); 
                                            custo += (quantidade500ml * 3.50);
                                            custoTotalDia += (quantidade500ml * 3.50);
                                            JOptionPane.showMessageDialog(null, "Você comprou "+ quantidade500ml +" garrafa(s) d'água de 500ml!");
                                  aguaTamanhoEscolhaSemGas = JOptionPane.showOptionDialog(null, "Selecione o tamanho de água desejado:" + "\n500ml - R$ 3,50" + "\n1,5 litros - R$5,50", "Bebidas - Água", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, tamanhoAguaSemGas, tamanhoAguaSemGas[0]);}
                                    else if(finalizar500ml == JOptionPane.NO_OPTION){
                                     
                                        custo += 0;
                                        custoTotalDia += 0;
                                        aguaTamanhoEscolhaSemGas = JOptionPane.showOptionDialog(null, "Selecione o tamanho de água desejado:" + "\n500ml - R$ 3,50" + "\n1,5 litros - R$5,50", "Bebidas - Água", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, tamanhoAguaSemGas, tamanhoAguaSemGas[0]);}
                                                break;
                                                
                                            case 1:
                                                int finalizar15l = JOptionPane.showOptionDialog(null, 
                                     "Você deseja comprar garrafa(s) d'água de 1,5 litros?","", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                                    if (finalizar15l == JOptionPane.YES_OPTION){
                                    int quantidade15l = Integer.parseInt(JOptionPane.showInputDialog("Quantas?")); 
                                            custo += (quantidade15l * 5.50);
                                            custoTotalDia += (quantidade15l * 5.50);
                                            JOptionPane.showMessageDialog(null, "Você comprou "+ quantidade15l +" garrafa(s) d'água de 1,5 litros!");
                                  aguaTamanhoEscolhaSemGas = JOptionPane.showOptionDialog(null, "Selecione o tamanho de água desejado:" + "\n500ml - R$ 3,50" + "\n1,5 litros - R$5,50", "Bebidas - Água", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, tamanhoAguaSemGas, tamanhoAguaSemGas[0]);}
                                    else if(finalizar15l == JOptionPane.NO_OPTION){
                                     
                                        custo += 0;
                                        custoTotalDia += 0;
                                        aguaTamanhoEscolhaSemGas = JOptionPane.showOptionDialog(null, "Selecione o tamanho de água desejado:" + "\n500ml - R$ 3,50" + "\n1,5 litros - R$5,50", "Bebidas - Água", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, tamanhoAguaSemGas, tamanhoAguaSemGas[0]);}
                                                break;
                                                
                                                
                                          
                                      }
                                  }
                                    tipoAguaEscolha = JOptionPane.showOptionDialog(null, "Selecione o tipo de água desejado:", "Bebidas - Água", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, tipoAgua, tipoAgua[0]);
                                    break;
                            
                                }
                                  
        
    }
                                 escolhaBebidas = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção de bebida desejada." + "\n1 - Refrigerante     -     (Conferir sabores)" + "\n2 - Café     -                    (Conferir sabores)" + "\n3 - Água     -                   (Conferir tamanhos)" + "\n4 - Custo atual" + "\n5 - Retornar ao menu"));
                                    break;
                            
    
                                case 4: 
                                 JOptionPane.showMessageDialog(null, "O custo atual é: R$" + custo);
                                    escolhaBebidas = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção de bebida desejada." + "\n1 - Refrigerante     -     (Conferir sabores)" + "\n2 - Café     -                    (Conferir sabores)" + "\n3 - Água     -                   (Conferir tamanhos)" + "\n4 - Custo atual" + "\n5 - Retornar ao menu"));
                                    break;
                                }
                            
                               
                            }
                            escolha = JOptionPane.showOptionDialog(null, "Temos um cardápio que consiste em: ", "Cardápio - Lanchonete do " + nome, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, items, items[0]);
    }
}
    
}
}