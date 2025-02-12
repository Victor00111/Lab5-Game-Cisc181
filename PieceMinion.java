public class PieceMinion extends Piece{
    private int numRecruits;
    private int numTimesSpawned;

    public static int MAX_NUM_SPAWNED = 3;

    public PieceMinion(char symbol, String teamColor, int numRecruits, int numTimesSpawned, boolean hidden, boolean original) {
        super(symbol,teamColor,hidden,original);
        this.numRecruits = numRecruits;
        this.numTimesSpawned = numTimesSpawned;
    }

    public PieceMinion(){
        this('M',"- -", 0,0, false,true);
    }

    public char getSymbol() {
        return super.symbol;
    }
    public String getTeamColor() {
        return super.teamColor;
    }
    public int getNumRecruits() {
        return numRecruits;
    }
    public int getNumTimesSpawned() {
        return numTimesSpawned;
    }
    public boolean isHidden() {
        return super.hidden;
    }
    public boolean isOriginal() {
        return super.original;
    }

    public void setHidden(boolean hidden) {
        super.hidden = hidden;
    }
    public void setOriginal(boolean original){
        super.original = original;
    }

    public void setNumRecruits(int numRecruits) {
        this.numRecruits = numRecruits;
    }

    public void speak(){
        System.out.println("Bello!");
    }

    public boolean validMovePath(int fromSquareRow, int fromSquareCol,
                                 int toSquareRow, int toSquareCol) {
        // You will implement this method in a later step
        // each Piece will have a different valid path
        return true;
    }

    public PieceMinion spawn(){
        return new PieceMinion(Character.toLowerCase(super.symbol),
                super.teamColor,1,
                0,
                false,
                false);
    }

    public boolean canSpawn(){
        return original && numTimesSpawned < MAX_NUM_SPAWNED;
    }

}
