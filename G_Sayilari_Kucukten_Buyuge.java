import java.util.Scanner;
public class G_Sayilari_Kucukten_Buyuge {
    public static void main(String[] args) {

        int a,b,c;

        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayi :");
        a = input.nextInt();

        System.out.print("2. Sayi :");
        b = input.nextInt();

        System.out.print("3. Sayi :");
        c = input.nextInt();

       if((a<b) && (a<c)){
           if(b<c){
               System.out.println("a < b < c");
           }else{
               System.out.println("a < c < b");
           }
       }else if((b<a) && (b<c)){
           if(a<c){
               System.out.println("b < a < c");
           }else{
               System.out.println("b < c < a");
           }
       }else if((c<a)&& (c<b)){
           if(a<b){
               System.out.println("c < a < b");
           }else{
               System.out.println("c < b < a");
           }
       }



    }
}
