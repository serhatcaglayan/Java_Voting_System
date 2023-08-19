
package VotingSystem;


public class TurkıshCitizen extends Citizen{
    
    public String idNumber;
    public boolean hasVoted;
   

    public TurkıshCitizen(String name, int age, boolean isTurk,String idNumber) {
        super(name, age, isTurk);
        super.isTurk=true;
        this.idNumber=idNumber;
     
     
        
    }

 
    @Override
    public boolean canVote(Citizen citizen){
        if (this.idNumber.length()==11 && getAge()>=18) {
            
            return true;
            
        }
        return false;
    }
    
   
    
      public String getIdNumber() {
        return idNumber;
    }

    
}
