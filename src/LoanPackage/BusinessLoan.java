package LoanPackage;


public class BusinessLoan extends Loan{
    
    public BusinessLoan(int loanNumber, String cLName, double loanAmount, int term, double primeRate){
        super(loanNumber, cLName, loanAmount, term);
        super.setInterestRate(primeRate+1);
    }
    @Override
    public String toString(){
        return "\n"+this.getLoanNumber()+"\t           "+this.getcLName()+"\t                 "+this.getLoanAmount()+"\t"+this.getTerm()+"                    "+this.getInterestRate()+"%\t"+(this.getLoanAmount()+(this.getLoanAmount()*(this.getInterestRate()/100)*this.getTerm()));
    /*    
        return super.toString()+"Interest Rate: "+this.getInterestRate()+"%"+" || "+"Total amount owed: "+(this.getLoanAmount()+(this.getLoanAmount()*(this.getInterestRate()/100)*this.getTerm()))+"\n";
    */
    }
}
