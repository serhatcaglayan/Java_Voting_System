
package VotingSystem;


public class Party {
    
    public String name;
    public int id;
    private int voteCount=0;
 


   
    public Party(String name, int id) {
        this.name = name;
        this.id = id;
        this.voteCount=0;
    }
    
      public void voteCount() {
        voteCount++;
      
      }

    @Override
    public String toString() {
        return "Party{" + "name=" + name + ", id=" + id + ", voteCount=" + voteCount + '}';
    }
    
    
    
    
    
    
    
    



    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

}