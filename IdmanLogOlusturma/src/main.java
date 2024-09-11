
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class main {
    public static void main(String [] args){
        Scanner input= new Scanner(System.in);
        System.out.println("idman programina hos geldiniz...");
        String idmanlar="gecerli hareketler...\n"
                        + "burpee\n"
                        + "pushub\n"
                        + "situp\n"
                        + "squat";
        
        System.out.println(idmanlar);
        System.out.println("bir idman olustur...");
        
        System.out.println("burpee sayisi : ");
        int burpee=input.nextInt();
        System.out.println("pushub sayisi : ");
        int pushub=input.nextInt();
        System.out.println("situp sayisi : ");
        int situp=input.nextInt();
        System.out.println("squat sayisi : ");
        int squat=input.nextInt();
        input.nextLine();
        
        idman idman=new idman(burpee,pushub,situp,squat);
        System.out.println("idman basliyor...");
        
        int i =1;
        
        try(FileWriter writer = new FileWriter("log.txt")){
            
            writer.write("-idman programı-\n");
            writer.write("burpee sayısı : "+idman.getBurpeeSayisi()+"\n");
            writer.write("pushup sayısı : "+idman.getPushubSayisi()+"\n");
            writer.write("situp sayısı : "+idman.getSitupSayisi()+"\n");
            writer.write("squat sayısı : "+idman.getSquatSayisi()+"\n");
            
            
        while(idman.idmanBittiMi()== false){
            System.out.print("hareket turu (burpee,pushup,situp,squat) : ");
            String tur=input.nextLine();
            System.out.println("bu hareketten kac tane yapacaksiniz : ");
            int sayi=input.nextInt();
            input.nextLine();
            idman.hareketYap(tur, sayi);
            
            writer.write(i+"işlem -----> Hareket : "+tur+" sayı :"+sayi+"\n");
            i++;
        }
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("idmanini basariyla bitirdin...");
      
    }
}
