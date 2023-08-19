
package VotingSystem;


public class Citizen {
    public String name;
    public int age;
    public boolean isTurk=true;
    public boolean wasUseVote = false;
    
    
  

    public Citizen(String name, int age, boolean isTurk) {
        this.name = name;
        this.age = age;
        this.isTurk = isTurk;
        
    }


    public boolean canVote(Citizen citizen){
        
        return true;
    }
    
    
    
    
    
    
    
    

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isIsTurk() {
        return isTurk;
    }

    public boolean isWasUseVote() {
        return wasUseVote;
    }


   
    
    
    

 
    
    
}
