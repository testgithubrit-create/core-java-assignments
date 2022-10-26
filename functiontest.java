public class functiontest {
    public static void fibo (int n);
        int num1=0, num2=1, num3;
    System.out.println (num1+" "+num2);
    for(int i=2; i <n; i ++)
    {
        num3=num1+num2;
        System.out.println (" "+num3);
        num1=num2;
        num2=num3;
    }
}
public static void main (String args[])
{
    int count;
    count=20;
    fibo (count);
}