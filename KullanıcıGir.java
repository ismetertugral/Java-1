//Kullanıcı girişi
package javaapplication1;

import static java.lang.System.exit;
import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
          Scanner in=new Scanner(System.in);
    int Sif;
    int sayac=0;
    String Kul;
    String GirKul="isoleo";
    System.out.println("'''''Kullanıcı girişi''''");
            do{
            System.out.println("\nKullanıcı adını girin :");
            Kul=in.next();
            System.out.println("Şifreyi girin :");
            Sif = in.nextInt();
            if((!Kul.equals(GirKul)) || Sif!=357){//String Karşılaştırma.
                    System.out.println();
                    System.out.println("Yanlış girdiniz");
                    System.out.println("Yeniden deneyiniz!");
             sayac=sayac+1;      
                System.out.println("Kalan hak="+(3-sayac));
                
            }if(sayac==3)
                exit(1);
            }while((!Kul.equals(GirKul)) || Sif!=357);
            
            
        
            System.out.println("\nGirdik");
        
            System.out.println();
            
    }
    
}
