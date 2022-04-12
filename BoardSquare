public class BoardSquare {

    private boolean isSpaceEmpty;
    private Piece piece=new Piece();
    private String color;
    public BoardSquare(String color) {
        super();
        this.isSpaceEmpty =true;
        this.piece.setName(null);
        this.color = color;
    }

    public Piece getPiece() {
        return this.piece;
    }
    public String getSquareColor() {
        return this.color;
    }
    public boolean isEmpty() {
        return this.isSpaceEmpty;
    }
    public void setPiece(Piece s) {
        this.piece=s;
        this.isSpaceEmpty=false;
    }
    public Piece removePiece() {
        Piece tmp=this.piece;
        this.piece.setName(null);
        this.isSpaceEmpty=true;
        return tmp;
    }

    @Override
    public String toString() {
        if(this.piece.getName()==null) {
            return "-------";
        }
        else return "-"+this.piece.toString()+"-";
    }


}
