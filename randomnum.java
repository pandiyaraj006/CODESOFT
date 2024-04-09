import java.util.*;
class random {
    public static void main(String argc [])
    {
        method();
    }
    public static void method()
    {
        Scanner p=new Scanner(System.in);
        int ans=1+(int)(100*Math.random());
        int count=0;
        System.out.print(" ");
        System.out.print("enter your guess and you have 10 choice : ");
        for(int i=0;i<10;i++)
        {
            System.out.print(" ");
            System.out.print("enter your choice:");
            int choice=p.nextInt();
            if(choice==ans)
            {
                System.out.println("answer is correct");
                break;
            }
            else if(choice<ans)
            {
                System.out.println("your choice is lower than the number");
                count++;
            }
            else
            {
                System.out.println("your choice is higher than the number");
                count++;
            }

        }
        System.out.println("the answer is:"+ans);
        if(count==0)
        {
            System.out.println("Score"+"="+"100");

        }
        else if(count==1||count==2)
        {
            System.out.println("Score"+"="+"90");
        }
        else if(count==3||count==4)
        {
            System.out.println("Score"+"="+"80");
        }
        else if(count==5||count==6)
        {
            System.out.println("Score"+"="+"70");
        }
        else if(count==7||count==8)
        {
            System.out.println("Score"+"="+"60");
        }
        else if(count==9) {
            System.out.println("Score" + "=" + "50");
        }
        else {
            System.out.println("your choice is over");
        }
        System.out.println("do you wanna continue:" );
        char y=p.next().charAt(0);
        if(y=='y')
        {
            method();
        }
        else
        {
            System.out.println("Thanks for playing");
        }
    }}
