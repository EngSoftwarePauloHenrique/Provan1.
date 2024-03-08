/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package avaliacao.n1;

/**
 *
 * @author Paulo Henrique <eng.softwarepaulohenrique@gmail.com>
 * @date $ {date?date?string(dd/MM/yyyy")}
 * @brief Class Prova1
 */
import java.util.Scanner;

public class Prova1 {
    //inicia a execução do programa em java 
    public static void main(String[] args) {
        
        //Variaveis 
        int opcao = 0, qde_expresso=0, qde_capuccino=0, 
            qde_leite_com_cafe=0, qde_cafes_vendidos;
        double valor_expresso, valor_capuccino,
            valor_leite_com_cafe, valor_cafes_vendidos;
        
        // Cria um scanner para obter a entrada de dados
        Scanner sc = new Scanner(System.in);
    
        do {
                //Cria a tela de exibição para o usuário selecionar uma opção        
                System.out.println("Forneça uma opção: \n"+
                                    "1 ­ café expresso; \n"+
                                    "2 ­ café capuccino; \n"+
                                    "3 ­ leite com café; \n"+
                                    "4 ­ totalizar vendas;");
      
                // Valida a opção selecionada pelo usuário
                opcao = sc.nextInt();
      
                if ( opcao == 1 ) qde_expresso++;
                else if (opcao == 2) qde_capuccino++;
                else if (opcao == 3) qde_leite_com_cafe++;
                else if (opcao != 4) System.out.println("Opção inválida");
        
        // Etapa de processamento onde será avaliado a quantidade e realizará a multiplicação de acordo com a quantidade
        } while ( opcao != 4);
    
        valor_expresso = qde_expresso*0.75;
        valor_capuccino = qde_capuccino;    
        valor_leite_com_cafe = qde_leite_com_cafe*1.25;     
        qde_cafes_vendidos = qde_expresso + qde_capuccino + qde_leite_com_cafe;
        valor_cafes_vendidos = valor_expresso + valor_capuccino + valor_leite_com_cafe;
    
        // Exibe a quantidade e os valores do pedido feito pelo usuário
        System.out.println("Qde café expresso: "+qde_expresso+" ­ valor: "+valor_expresso);
        System.out.println("Qde café capuccino: "+qde_capuccino+" ­ valor: "+valor_capuccino);    
        System.out.println("Qde leite com café: "+qde_leite_com_cafe+
                            " ­ valor: "+valor_leite_com_cafe);        
        System.out.println("Qde cafés vendidos: "+ qde_cafes_vendidos +
                            " ­ valor cafés vendidos: "+valor_cafes_vendidos);
    }
}
