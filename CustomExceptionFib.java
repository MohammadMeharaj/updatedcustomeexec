import java.util.InputMismatchException;
import java.util.Scanner;
class Ownexception extends Exception
{
    public Ownexception(String message)
    {
        super(message);
    }
}
class CustomExceptionFib
{
    public static void main(String[]args) throws Ownexception
    {
        try{
            int a=0;
            int b=1;
            int result=0;
            Scanner s=new Scanner(System.in);
            System.out.println("n:");
            int n=s.nextInt();
            if(n<0)
            {
                throw new Ownexception("No negative values");
            }
            if(n==0)
            {
                System.out.println("zero cannot be taken");
            }
            for(int i=1;i<=n;i++)
            {
                result=a+b;
                System.out.println(" "+result);
                a=b;
                b=result;
            }
        }
        catch(InputMismatchException e){
            System.out.println("Enter int type only");
        }
        catch(Ownexception ae)
        {
            System.out.println("   enter a valid value"+ae.getMessage());
        }        
    }
}
