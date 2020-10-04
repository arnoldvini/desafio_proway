
import java.util.Scanner;

public class Sistema {
    Scanner teclado = new Scanner(System.in);

    public int pontMAX;
    public int pontMIN;
    public int qtdrecorde;


    public void gerenciarMenu (){
        menuDados();
        int opcao = solicitarOpcaoMenu();
        while (opcao != 3){
            menuDados();
            opcao = solicitarOpcaoMenu();
        }
    }


    public void menuDados() {
        System.out.println("--------------------------------");
        System.out.println(" digite (1) para inserir dados  ");
        System.out.println(" digite (2) para consultar dados");
        System.out.println(" digite (3) para fechar         ");
        System.out.println("--------------------------------");
    }

    public int solicitarOpcaoMenu() {
        int opcao = Integer.parseInt(teclado.nextLine());
        coordenarMenu(opcao);
        return opcao;

    }
    public void insercao (){
        System.out.print("pontuação do primeiro jogo: ");
        int jogos1 = Integer.parseInt(teclado.nextLine());
        pontMAX = jogos1;
        pontMIN = jogos1;

        System.out.print("pontuação do segundo jogo: ");
        int jogos2 = Integer.parseInt(teclado.nextLine());
        if(jogos2 > jogos1){
            pontMAX = jogos2;
        }else if(jogos2 < jogos1){
            pontMIN = jogos2;
        }

        System.out.print("pontuação do terceiro jogo: ");
        int jogos3 = Integer.parseInt(teclado.nextLine());
        if(jogos3 > jogos2 && jogos3 > jogos1){
            pontMAX = jogos3;
        }else if(jogos3 < jogos2 && jogos3 < jogos1){
            pontMIN = jogos3;
        }
        

        System.out.print("pontuação do quarto jogo: ");
        int jogos4 = Integer.parseInt(teclado.nextLine());
        if (jogos4 > jogos3 && jogos4 > jogos2 && jogos4 > jogos1){
            pontMAX = jogos4;
        }else if(jogos4 < jogos3 && jogos4 < jogos2 && jogos4 < jogos1){
            pontMIN = jogos4;
        }
        
        if (jogos2 > jogos1){
            qtdrecorde++;
        }
        if(jogos3 > jogos2 && jogos3 > jogos1){
            qtdrecorde++;
        }
        if(jogos4 > jogos3 && jogos4 > jogos1 && jogos4 > jogos2){
            qtdrecorde++;
        }

        System.out.println("1 jogo: " + jogos1 + "\n" + "2 jogo: " + jogos2 + "\n" +
                "3 jogo: " + jogos3 + "\n" + "4 jogo: " + jogos4);
    }



    public void consulta (){
        
        System.out.println("A pontuação maxima é de: " + pontMAX);
        System.out.println("A pontuação minima foi de: " + pontMIN);
        System.out.println("o recorde foi batido: " + qtdrecorde + " vezes");
    }

    public void coordenarMenu(int opcao) {
        switch (opcao) {
            case 1:
                insercao();

                break;
            case 2:
                consulta();

                break;
            case 3:
                break;

        }
    }
}
