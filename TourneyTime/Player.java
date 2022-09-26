import java.util.Random;

public class Player {

   protected static Random rdm = new Random();
   
   protected String name;
   //add other instance variables to determine "power"
   //these are example variables for a basketball team,
   //but you can change them to any attributes you'd like
   protected int HP;
   protected int Atk;
   protected int Def;
   protected int Spa;
   protected int Spd;
   protected int Speed;
   /*
   protected double gir;
   protected double puttingAvg;
   */
   
   public Player(String n) {
      name = n;      
   }
   public Player(String n, int h, int a, int d, int sa, int sd, int sp) {
      name = n;
      HP = h;
      Atk = a;
      Def = d;
      Spa = sa;
      Spd = sd;
      Speed = sp;

   
   }
   
   public String getName() {
      return name;
   }
   
   /*
   This subtracts losses from wins, adding points per game to get a team's "power".
   Your power function will be based on the attributes you choose for your type of team.
   */
   public double getPower() {
      return HP + Def-Atk + Spd-Spa + rdm.nextInt(255) ; 
   }

   public String toString() {
      return name + ": " + HP + ": " + Atk + ": " + Def + ": " + Spa + ": " + Spd + ": " + Speed + ": ";
   }

}