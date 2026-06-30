package LoanPackage;


public abstract class Loan implements LoanConstants{
    private int loanNumber;
    private String cLName;
    private double loanAmount;
    private double interestRate;
    private int term;

    public Loan(int loanNumber, String cLName, double loanAmount, int term) {
        this.loanNumber = loanNumber;
        this.cLName = cLName;
        
        if(loanAmount<=MAX_LOAN_AMOUNT){
            this.loanAmount = loanAmount;
        }else{
            System.out.println("Maximum Loan Amount Exceeded!");
        }
        if(term!=SHORT_TERM&&term!=MEDIUM_TERM&&term!=LONG_TERM){
            this.term=SHORT_TERM;
        }else{
        this.term = term;
        }  
    }

    public int getLoanNumber() {
        return loanNumber;
    }

    public void setLoanNumber(int loanNumber) {
        this.loanNumber = loanNumber;
    }

    public String getcLName() {
        return cLName;
    }

    public void setcLName(String cLName) {
        this.cLName = cLName;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    

    @Override
    public String toString(){
        return "Loan Number: "+this.getLoanNumber()+" || "+"Customer Last Name: "+this.getcLName()+" || "+"Loan Amount: "+this.getLoanAmount()+" || "+"Term: "+this.getTerm();
    }
}