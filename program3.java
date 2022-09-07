import java.util.*;
public class program3

    public static void main(String[] args)
{
      random r=new Random();
      int rn= r.nextInt();
      Scanner sc=new Scanner(System.in);
       System.out.println("enter one number");
      int un=sc.nextInt();
      if(rn==un)
      {
           System.out.println("you won the game");
   }
   else
   {
      System.out.println("butter luck next time "+rn);
   }
}