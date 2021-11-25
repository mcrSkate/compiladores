import java.util.ArrayList;

public class Tokenizador {
    public ArrayList<Token> tokens;

    public Tokenizador(){
        this.tokens = new ArrayList<Token>();
    }

    public void makeToken(String entrada) throws Exception{
        String aux = "";
        char charAtual;
        for(int i=0; i<entrada.length(); i++){
            charAtual = entrada.charAt(i);
            if(Character.isDigit(charAtual)){
                aux += charAtual;
            }else if(charAtual == 10){
                if(!aux.equals("")){
                    this.tokens.add(new Token(TokenType.NUM,aux));
                    aux = "";
                }
            }else if(charAtual == '+'){
                this.tokens.add(new Token(TokenType.PLUS,"+"));
            }else if(charAtual == '-'){
                this.tokens.add(new Token(TokenType.MINUS,"-"));
            }else if(charAtual == '*'){
                this.tokens.add(new Token(TokenType.STAR,"*"));
            }else if(charAtual == '/'){
                this.tokens.add(new Token(TokenType.SLASH,"/"));
            }else{
                throw new Exception("Error: Unexpected character: " + charAtual);
            }
        }
    }
}
