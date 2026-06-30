package LoanPackage;
import java.util.Scanner;

public class LoansApplication {
    
    public static void main(String[] args){
        
    Scanner scan = new Scanner(System.in); 
    int loanNumber, term;
    double primeRate, loanAmount;
    String cLName;
    char loanType;
    
    Loan[] loanArray;
    loanArray = new Loan[5];
    
    for (int i=0; i<1; i++){
        System.out.print("\nEnter prime interest rate: ");
        primeRate=scan.nextDouble();
        
        System.out.print("[B]usiness loan\n[P]ersonal\nEnter loan type: ");
        loanType=scan.next().charAt(0);
        
        System.out.print("Enter loan number: ");
        loanNumber=scan.nextInt();
        
       System.out.print("Enter client last name: ");
        cLName=scan.next();

        System.out.print("Enter loan amount: ");
        loanAmount=scan.nextDouble();


        System.out.print("Enter term(1,3,5): ");
        term=scan.nextInt();        
        
        if(loanType=='B'){
            loanArray[i] = new BusinessLoan(loanNumber, cLName, loanAmount, term, primeRate);
        }else if(loanType=='P'){
            loanArray[i] = new PersonalLoan(loanNumber, cLName, loanAmount, term, primeRate);
        }
    }
    
    for (int i=0; i<1; i++){
        System.out.println(loanArray[i].toString());
    }
}
}