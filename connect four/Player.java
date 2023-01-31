import java.util.ArrayList;

public class Player {
    private ArrayList<Piece> pieces = new ArrayList<>();


    public Player(String type){
        for(int i = 0; i < 21; i++){
            pieces.add(new Piece(type));
        }
    }

    public Piece placePiece(){
        return pieces.remove(0);
    }


}
