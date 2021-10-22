import java.io.IOException;


public class covid16082021 {
    
    public static void main(String args[]) throws IOException{
        
        pag1campo pag1 = new pag1campo();
        pag2campo pag2 = new pag2campo();
        pag1.campos1();
        pag2.campos2();
        
        
        Runtime.getRuntime().exec("cmd /C start C:\\FICHASYS\\TEMP2-2.pdf");
        
	}
    
}
