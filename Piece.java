public abstract class Piece {
    protected char symbol;
    protected String teamColor;
    protected boolean hidden;
    protected boolean original;
    public Piece(char c, String s, boolean h, boolean o){
        this.symbol = c;
        this.teamColor = s;
        this.hidden = h;
        this.original = o;
    }
    public abstract void speak();
    public abstract boolean validMovePath(int fromSquareRow,int fromSquareCol, int toSquareRow,int toSquareCol);
    public abstract char getSymbol();
    public abstract String getTeamColor();
    public abstract boolean isHidden();
    public abstract boolean isOriginal();
    public abstract void setHidden(boolean h);
    public abstract void setOriginal(boolean o);
    public abstract boolean canSpawn();
    @Override
    public String toString() {
        return (teamColor+" "+symbol);
    }

}
