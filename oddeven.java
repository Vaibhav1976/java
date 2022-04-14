import java.util.Scanner;
public class oddeven {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array length ");
        int n = sc.nextInt();
        int x []=new int [n];
        System.out.println("enter the elements ");
        for (int i=0; i<n; i++)
        {
            x[i]= sc.nextInt();
        }
        System.out.println("intial array:");
        for (int i=0; i<n; i++)
        {
            System.out.println(x[i]);
        }
        int evenArray[]=new int[n];
        int a=0;
        int oddArray[]=new int [n];
        int b=0;
        for (int i=0; i<n; i++)
        {
            if (x[i]%2==0)
            {
                evenArray[a]=x[i];
                ++a;
            }
            if (x[i]%2!=0)
            {
                oddArray[b]=x[i];
                ++b;
            }
        }
        int y=a;
        System.out.println("even array:");
        System.out.println("array length:"+ y);
        for (int j=0; j<y; j++)
        {
            System.out.println(evenArray[j]);
        }
        int z=b;
        System.out.println("odd array:");
        System.out.println("array length:"+ z);
        for  (int j=0; j<z; j++)
        {
            System.out.println(oddArray[j]);
        }
        sc.close();
    }
}