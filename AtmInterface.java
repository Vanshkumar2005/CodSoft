import java.util.Scanner;  
  
public class AtmInterface {  
     
    public static void main(String args[] )  
    {  
         
        int balance = 100000, withdraw, deposit;  
          
         
        Scanner sc = new Scanner(System.in);  
          
        while(true)  
        {  
            System.out.println("Automated Teller Machine");  
            System.out.println(" 1 for Withdraw");  
            System.out.println(" 2 for Deposit");  
            System.out.println(" 3 for Check Balance");  
            System.out.println(" 4 for EXIT");  
            System.out.print(" the operation you want to perform:");  
              
              
            int choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1:  
                    System.out.print("Enter money to be withdrawn:");  
                    withdraw = sc.nextInt();  
                    if(balance >= withdraw){  
                        balance = balance - withdraw;  
                        System.out.println("Please collect your money");
                        System.out.println("remaining balance "+balance); 
                    }else{  
                        System.out.println("Insufficient Balance");  
                    }  
                    System.out.println("");  
                    break;  
   
                case 2:  
                    System.out.print("Enter money to be deposited:");  
                    deposit = sc.nextInt();  
                      
                    balance = balance + deposit;  
                    System.out.println("Your Money has been successfully deposited");  
                    System.out.println("balacne after deposit "+balance); 
                    System.out.println("");  
                    break;  
   
                case 3:  
          
                    System.out.println("Balance : "+balance);  
                    System.out.println("");  
                    break;  
   
                case 4:  
        
                    System.out.println("exiting");  
            }  
        }  
    }  
}