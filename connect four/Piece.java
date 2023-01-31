public class Piece {
    private String type;
    private boolean isEmpty;

    public Piece(String type){
        this.type = type;
        isEmpty = false;
    }

    public Piece(){
        type = "O";
        isEmpty = true;
    }

    public String getType(){
        return type;
    }

    public boolean isEmpty(){
        return isEmpty;
    }
}
