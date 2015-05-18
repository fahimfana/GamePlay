import java.util.Scanner;

public class gamePlay {
    int num[] = new int[5];
    int temp;
    int min, max;
    int i, j = 0;

    public int[] read() {
        Scanner s = new Scanner(System.in);

        for (i = 0; i < num.length; i++) {
            System.out.println("Enter the number " + i);
            num[i] = s.nextInt();
        }

        return num;
    }

    public void print() {
        System.out.println("numbers are:");
        for (i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }

    public void findMinimum() {
        min = num[0];
        for (i = 0; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println("min = " + min);
    }

    public void findMaximum() {
        max = num[0];
        for (i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println("max = " + max);
    }

    public void sort() {
        for (j = 0; j < num.length - 1; j++)
            for (i = 0; i < num.length - j - 1; i++) {
                if (num[i] > num[i + 1]) {
                    temp = num[i];
                    num[i] = num[i + 1];
                    num[i + 1] = temp;
                }
            }
    }

    public void findAverage()
    {
        int sum=0;
        for(i=0;i<num.length;i++)
        {
            sum+=num[i];
        }
        double avg=sum/num.length;
        System.out.println("average = "+avg);
    }
    public static void main(String a [])
    {
        gamePlay gm=new gamePlay();
        gm.read();
        gm.findMinimum();
        gm.findMaximum();
        gm.findAverage();
		gm.sort();
		gm.print();
    }
}
