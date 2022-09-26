

public class TournamentTree <E> extends LinkedBinaryTree <E> {



   public void playGames(Position <E> node) {
      Node<E> parent = node.getParent();

      
      //extrace the game from the node parameter


      //base case
      //if no left child, then this must be a leaf. 
      //Set winner of game to the game's player1 
      if (parent.getLeft() == null) {
         throw new IllegalArgumentException("This is a leaf");
      }


      //second base case
      //if there is already a winner, return



      //recursive cases      
      //call playGames on left child of node
      Node getElementAt(int i);


      //call playGames on left child of node
      Node getElementAt(int i);


      
      //Do not need to change the rest      
      Game left = (Game) left(node).getElement();
      Game right = (Game) right(node).getElement();
      g.setPlayer1(left.getWinner());
      g.setPlayer2(right.getWinner());
      g.play();           
      
   }




}