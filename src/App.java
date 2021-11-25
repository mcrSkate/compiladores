import java.util.Scanner;
public class App {
   
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Leitura leitura = new Leitura();
        Tokenizador tokenizador = new Tokenizador();
        RPNStacker rpnStacker = new RPNStacker();
        boolean showTokens = false;

        System.out.println("Deseja mostrar os tokens? S ou s para sim");
        if(in.next().equalsIgnoreCase("s")){
            showTokens = true;
        }
        in.close();
        
        tokenizador.makeToken(leitura.FileReaderFunction());
        if(showTokens){
            for(int i=0;i<tokenizador.tokens.size();i++){
                System.out.println(tokenizador.tokens.get(i).toString());
            }
        }
        System.out.println(rpnStacker.calcular(tokenizador.tokens));
        
    }
}
