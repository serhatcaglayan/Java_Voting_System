
package VotingSystem;

public class LAB_Q_2 {

    
    public static void main(String[] args) {
        
        ForeignCitizen voter1 = new ForeignCitizen("Adrian",  19, false, "A12344");
        ForeignCitizen voter2 = new ForeignCitizen("Wesley",  25, false, "D45877");
        ForeignCitizen voter3 = new ForeignCitizen("Lucas",   17, false, "F54866");
        TurkıshCitizen voter4 =  new TurkıshCitizen ("Serhat", 21, true,  "40069752368");
        TurkıshCitizen voter5 =  new TurkıshCitizen ("Murat",  27, true,  "78923564852");
        TurkıshCitizen voter6 =  new TurkıshCitizen ("Aslı",   17,  true, "74185292352");
        
      
        
        Party AP = new Party("AP", 333);
        Party BP = new Party("BP", 777);
        Party CP = new Party("CP", 555);
        
       Election Election2023 = new Election();
       
       Election2023.addParty(AP); 
       Election2023.addParty(BP);
       Election2023.addParty(CP);
       
       Election2023.addCitizen(voter1);
       Election2023.addCitizen(voter2);
       Election2023.addCitizen(voter3);
       Election2023.addCitizen(voter4);
       Election2023.addCitizen(voter5);
       Election2023.addCitizen(voter6);
      
   
         Election2023.vote(AP, voter1);
         Election2023.vote(AP, voter2);
         Election2023.vote(AP, voter3);
         Election2023.vote(AP, voter4);
         Election2023.vote(AP, voter5);
         Election2023.vote(AP, voter6);
         
         
     

       
         
        
     
    }
    
}
