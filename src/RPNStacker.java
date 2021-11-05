import java.util.*;
import java.io.*;

public class RPNStacker {
    
    public Stack<Integer> stack = new Stack<Integer>();

    public Integer mathOperation(char operator){
        Integer snd = stack.pop();
        Integer fst = stack.pop();

        if(operator == '+'){
            return fst + snd;
        }else if(operator == '-'){
            return fst - snd;
        }else if(operator == '*'){
            return fst * snd;
        }else return fst/snd;
    }

    public Integer FileReaderFunction(){
        try{
            FileReader input = new FileReader("./inputs/Calc1.stk");
            int r = 0;
            String aux = "";
            while((r=input.read())!=-1){
                if(Character.isDigit((char)r)){
                    aux += (char)r;
                }else if((char)r == 10){
                    if(!aux.equals("")){
                        stack.push(Integer.parseInt(aux));
                        aux = "";
                    }
                }else{
                    stack.push(mathOperation((char)r));
                }
            }
            input.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return stack.pop();
    }
}
