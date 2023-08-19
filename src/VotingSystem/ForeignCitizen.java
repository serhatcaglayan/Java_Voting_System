
package VotingSystem;

public class ForeignCitizen extends Citizen{
    
    
    public String passportNumber;

    public ForeignCitizen(String name, int age, boolean isTurk,String passportNumber ) {
        super(name, age, isTurk);
        super.isTurk=false; 
        this.passportNumber=passportNumber;
         
    
    
    
    }


    
    public boolean canVote(Citizen citizen){
        if (this.passportNumber.length()==6 && getAge()>=18 && Character.isLetter(this.passportNumber.charAt(0))) {
            
            return true;
            
        }
        return false;
    }
    
    
    
    
    
    
   
    }

    
    
    
    
    

