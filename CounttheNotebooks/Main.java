package CounttheNotebooks;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        for (int i=0;i<t;i++){
            int n=sc.nextInt();

            int kg=n*1000;
            int pulp=kg/100;
            System.out.println(pulp);

        }
    }
}