import java.util.Scanner;
public class arrayinput {
    int n=5;
    public static void allsum(int x[])
    {       
         int sum=0;
        for (int i=0;i<x.length;i++)
        {
            sum=sum+x[i];
        }
        System.out.println("Sum of all elements is:");
        System.out.println(sum);
    }
    public static void alternatesum(int x[])
    {
        int sum=0;
        for (int i=0;i<x.length;i=i+2)
        {
            sum=sum+x[i];
        }
        System.out.println("Sum of alternate elements is:");
        System.out.println(sum);

    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n=5;
        int x []=new int[n];
        System.out.println("enter 5 elements of the array: ");
        for (int i=0;i<5;i++)
        {
            x[i]=sc.nextInt();
        }
        System.out.println();
        System.out.print("array entered: ");
        for (int j=0; j<x.length; j++)
        {
            System.out.print(x[j]+" ");
        }
        System.out.println("\n");
        System.out.println("enter 1: for Sum of all the elements");
        System.out.println("enter 2: for Sum of alternate elements");
        int y= sc.nextInt();
        if (y==1)
        {
            allsum(x);
        }
        sc.close();
        if (y==2)
        {
            alternatesum(x);
        }
        if (y!=1 & y!=2)
        {
            System.out.println("INVALID INPUT");
        }
    }
   
}

