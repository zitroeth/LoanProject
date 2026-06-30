package LoanPackage;


public class PersonalLoan extends Loan{
    public PersonalLoan(int loanNumber, String cLName, double loanAmount, int term, double primeRate){
        super(loanNumber, cLName, loanAmount, term);
        super.setInterestRate(primeRate+2);
    }
    @Override
    public String toString(){
        return "\n"+this.getLoanNumber()+"\t           "+this.getcLName()+"\t                 "+this.getLoanAmount()+"\t"+this.getTerm()+"                    "+this.getInterestRate()+"%\t"+(this.getLoanAmount()+(this.getLoanAmount()*(this.getInterestRate()/100)*this.getTerm()));
        /*
        return super.toString()+"\nInterest Rate:"+this.getInterestRate()+"%"+"\n"+"Total amount owed: "+(this.getLoanAmount()+(this.getLoanAmount()*(this.getInterestRate()/100)*this.getTerm()));
    */
    }
}
