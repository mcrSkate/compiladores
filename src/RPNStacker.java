import java.util.ArrayList;
import java.util.Stack;

public class RPNStacker {

    public Stack<Double> stack;

    public RPNStacker(){
        this.stack = new Stack<Double>();
    }

    public Double mathOperation(String operator){
        Double snd = this.stack.pop();
        Double fst = this.stack.pop();

        if(operator.equals("+")){
            return fst + snd;
        }else if(operator.equals("-")){
            return fst - snd;
        }else if(operator.equals("*")){
            return fst * snd;
        }else return fst/snd;
    }

    public Double calcular(ArrayList<Token> tokens) throws Exception{
        for(int i=0; i<tokens.size(); i++){
            if(tokens.get(i).type==TokenType.NUM){
                stack.push(Double.parseDouble(tokens.get(i).lexeme));
            }else if(tokens.get(i).type==TokenType.PLUS){
                stack.push(mathOperation(tokens.get(i).lexeme));
            }else if(tokens.get(i).type==TokenType.MINUS){
                stack.push(mathOperation(tokens.get(i).lexeme));
            }else if(tokens.get(i).type==TokenType.STAR){
                stack.push(mathOperation(tokens.get(i).lexeme));
            }else if(tokens.get(i).type==TokenType.SLASH){
                stack.push(mathOperation(tokens.get(i).lexeme));
            }else{
                throw new Exception("Undefined TokenType");
            }
        }
        return stack.pop();
    }
}
