/**
 * A class to initialize and allow for creation of objects to represent baseball teams.
 * See Client code.
 */

package baseballtest;


public class BaseballTeam extends Sports implements Stats
{
 //Declaring variables
 public int numPlayers;
    
 
 /**
  * Constructor method for BaseballTeam
  * pre: none
  * post: An initialized BaseballTeam object
  */
 public void BaseballTeam(String name, int players)   
 {
  //super(name);
  numPlayers = players;
 }
    
 
    /**
     * Overridden Sports constructor method, testing purposes
     * pre: A valid Sports superclass
     * post: An initialized object using the super constructor method
     */
    @Override
    public void Sports(String name) {
     teamName = name;
    }

    /**
     * A method that displays the team's overall points
     * Pre: a properly initialized BaseballTeam object
     * 
     */
    @Override
    public int overAllPoints() 
    {
     //return the value of total points   
     return scoreStreak[4];
    }

    /**
     *A method that adds one win, and the points thereof, to the counter of the team
     * Pre: A properly initialized BaseballTeam object
     * Post: One win added to the counter, and two overall points as well.
     */
    @Override
    public void addWin() 
    {
     //add to win counter and overall points
     scoreStreak[2] ++;
     scoreStreak[3] += 2;
    }
    
    /**
     *A method that adds one tie, and the points thereof, to the counter of the team
     * Pre: A properly initialized BaseballTeam object.
     * Post: One tie added to the counter, and one overall point as well.
     */
    @Override
    public void addTie() 
    {
     //add to tie counter and overall points
     scoreStreak[1] ++;
     scoreStreak[3] += 1;
    }
    
    /**
     *A method that adds one loss to the counter of the team
     * Pre: A properly initialized BaseballTeam object
     * Post: One loss added to the counter.
     */
    @Override
    public void addLoss() 
    {
     //add to loss counter
     scoreStreak[0] ++;
    }
    
}
