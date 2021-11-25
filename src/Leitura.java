import java.io.*;

public class Leitura {

    public String FileReaderFunction(){
        String aux = "";
        try{
            FileReader input = new FileReader("./inputs/Calc1.stk");
            int r = 0;
            while((r=input.read())!=-1){
               aux += (char)r;
            }
            input.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return aux;
    }
}