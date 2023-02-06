/**
 * Class that stores a move
 */
 
public class Move{

    private String move; //atributo del objeto mover de la clase Move

    public Move(){ //constructor vacío mover
    	this.move = null;
    }

    public Move(String move){
    	this.move = move;
    }

    public String getMove(){
	    return move;
    }

    public boolean isUnknown(){
	    return (move == null);
    }

    public int beats(Move other){
	    return MoveWords.checkWinner(this.move, other.getMove());
    }  
}

