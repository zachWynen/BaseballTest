/**
 * Stats interface for abstract point-counting methods
 * See client code for details.
 */

package baseballtest;

public interface Stats {
 //array for tracking wins, losses, ties, and points
 public int[] scoreStreak = new int[4];  
   
 
 //abstract methods to be implemented in BaseBallTeam
 public int overAllPoints();
 
 public abstract void addWin();
 
 public abstract void addTie();
 
 public abstract void addLoss();   

    
}
