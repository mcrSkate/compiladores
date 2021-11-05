import java.io.*;
import java.util.Stack;
public class App {
   
    public static void main(String[] args) throws Exception {
        RPNStacker calculo = new RPNStacker();
        System.out.print(calculo.FileReaderFunction());
    }
}
