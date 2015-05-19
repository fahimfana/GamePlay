import java.util.Random;
import java.util.Scanner;

public class gussingGame {
    int min=1;
    int max=16;
        Random rand=new Random();
        int num= rand.nextInt(max-min+1)+min;
        int gues;
    public int read()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your guesing number between 1-16 : ");
        gues=s.nextInt();

       return gues;
    }
    public void check()
    {
        int i=0;
        while(i<16) {
            if (num==gues) {
                System.out.println("your gues is correct");
                break;
            } else if (num < gues) {
                System.out.println("The number is less than your gues ");
            } else {
                System.out.println("The number is greater than your gues ");
            }
            read();
            i++;
        }
    }
    public static  void main (String a [])
    {
        gussingGame gm=new gussingGame();
                gm.read();
        gm.check();
    }
}
