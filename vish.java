/*program for positive number
import java.util.Scanner;
public class vish {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();
        if(a>=0){
            System.out.println("The number is positive" );
        }
        else{
            System.out.println("The number is negative ");
        }

    }
    
}*/

//program for  votting eligibility
/*import java.util.Scanner;
public class vish{
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter age:");
int age = sc.nextInt();
if(age>=18){
    System.out.println("Eligible for votting");
}
else{
    System.out.println("Not eligible");
}
    }
}*/


//program for checking greater number
/*import java.util.Scanner;
public class vish{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter tow numbers:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        if(a>b){
            System.out.println( a+ " is greater");
        }
       else if(a<b){
           System.out.println(b+ " is grater");
       }
        else{
        }

    }
}*/


//pgrogram for checking temperature category
/*import java.util.Scanner;
public class vish{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature:");
        int temperature = sc.nextInt();
        if(temperature<10){
            System.out.println(" Temperature is Very cold");
        }
        else if(temperature>=10 && temperature<25){
            System.out.println("Temperature is Moderate");
        }
        else if(temperature>=25){
            System.out.println("Temperature is Hot");
        }else{
            
        }
    }
}*/

//program for day of week using switch case
/*import java.util.Scanner;
public class vish{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int day = sc.nextInt();
        switch(day){
          case 1: System.out.println("Monday"); 
          break; 
          case 2: System.out.println("Tuesday");
          break;
          case 3: System.out.println("Wednesday");
          break;
          case 4: System.out.println("Thursday");
          break;
          case 5: System.out.println("Friday");
          break;
          case 6: System.out.println("Saturday");
          break;
          case 7: System.out.println("Sunday");
          break;
          default: System.out.println("Invalid input");
          break;
        }
    }
}*/

//Simple calculator
/*import java.util.Scanner;
public class vish{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.print("Enter operation(+,-,*,/):");
        char op= sc.next().charAt(0);
        switch(op){
            case '+': System.out.println("Result="+(a+b));
            break;
            case '-': System.out.println("Result="+(a-b));
            break;
            case '*': System.out.println("Result="+(a*b));
            break;
            case '/': System.out.println("Result="+(a/b));
            break;
            default : System.out.println("Invalid statement");
            break;
        }
    }
}*/
