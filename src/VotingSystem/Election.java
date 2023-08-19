
package VotingSystem;

import java.util.ArrayList;


public class Election {
    
    private ArrayList<Party> parties;
    private ArrayList<Citizen> citizens;
    
    
    
    public Election(){
        
    }

    public Election(ArrayList<Party> parties, ArrayList<Citizen> citizens) {
        this.parties = new ArrayList<Party>();
        this.citizens = new ArrayList<Citizen>();
    }
    
    
    public void addParty(Party party){
        this.parties.add(party);
        
    }
    
    public void addCitizen(Citizen citizen){
        this.citizens.add(citizen);
    }


 
    public boolean vote(Party party , Citizen citizen){
        
        if (citizen.isIsTurk() && citizen.wasUseVote == false && citizen.canVote(citizen)==true ) {
            
            party.voteCount();
            
            
            return true;
     
        }
        else if(citizen.isIsTurk()==false && citizen.wasUseVote == false && citizen.canVote(citizen)==true ) {
            party.voteCount();
            return true;
            
        }
     return false;
        
    }
    
 
    
    
    
    
    
    public ArrayList<Party> getParties() {
        return parties;
    }

    public ArrayList<Citizen> getCitizens() {
        return citizens;
    }
    
    
    
    
}
