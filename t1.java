import java.util.Scanner;
public class t1 {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("what is your Scaler");
        int scalar = scan.nextInt();
        System.out.println("what is ypur Age");
        int age = scan.nextInt();
     
    if(scalar<=20000||age<=25){
        System.out.println("Eligible for loan");
        System.out.println("how much loan do you need");
        int loan = scan.nextInt();
    
        if(loan<=50000){
            System.out.print("loan avalable");
    }
    else if (loan>50000) {
        System.out.println("Maximum loan amount is 50000");
        
    } 
}
    else {
        System.out.print("You are not eligible for loan");
    }
}
    }
