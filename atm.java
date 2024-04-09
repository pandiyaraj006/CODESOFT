import java.util.Scanner;
class bank
{
    long b=90000;
    public  void balance()
    {
      System.out.println("BALANCE:"+b);
    }
}
class ATM extends bank
{
    Scanner t = new Scanner(System.in);
    public int general()
    {
        System.out.println("1:check Balance" + " " + " 2:deposit" + " " + " 3:withdraw");
      System.out.print(" ");
        System.out.print("Select anyone you want and press its number:");
        int choice = t.nextInt();
        return choice;
    }


    public void withdraw(long amount)
    {
        long total1 = b - amount;
        if (total1 >= 0)
        {
            System.out.println("Remaining Balance: " + total1);
            System.out.println("Withdrawn successfully");
        } else
        {
            System.out.println("Insufficient Balance");
        }
    }

    public void deposit(long amount)
    {
        long total2 = b + amount;
        System.out.println("Available balance:" + total2);
        System.out.println("deposit success");
    }
}
    class main
    {
        public static void main(String argc[])
        {
            Scanner o=new Scanner(System.in);
            ATM obj=new ATM();
            long c= obj.general();
        if(c==1)
        {
            obj.balance();
        }
       else if(c==2)
      {
          System.out.print(" ");
          System.out.print("Enter amount:");
          long amount=o.nextInt();
          obj.deposit(amount);
      }
      else if(c==3)
      {
          System.out.print(" ");
          System.out.print("Enter amount:");
          long amount=o.nextInt();
          obj.withdraw(amount);
      }

    }
}

