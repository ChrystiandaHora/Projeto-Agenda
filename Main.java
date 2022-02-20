import java.util.ArrayList;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    System.out.println("\n \n                          AGENDA");
    System.out.println("Digite seu Nome e Número\nEX: \nJubileu - (84)98602-8922");
    
    
    ArrayList<String> agenda = new ArrayList<>();
    Scanner n1 = new Scanner(System.in);
    
    int Nome = 5;
   
    while (Nome > 0){
      agenda.add(n1.nextLine());
      Nome--;
    }
    System.out.println("\n Lista Contatos: \n");

    

    for (int i = 0; i < agenda.size();i++){
      System.out.println( agenda.indexOf(agenda.get(i))+ " - " + agenda.get(i) );
    }

    

    System.out.println("\n Qual Contato o Senhor Deseja Apagar? \n");
    int Delete  = n1.nextInt();
    agenda.remove(Delete);
    for (int i = 0; i < agenda.size();i++){
      System.out.println(agenda.get(i));
    }

  
    
    
    

    //NÃO MEXER
  }
}