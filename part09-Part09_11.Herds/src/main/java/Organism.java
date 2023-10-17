public class Organism implements Movable{
    private int x_coordinate;
    private int y_coordinate;
    public Organism(int x , int y){
        this.x_coordinate=x;
        this.y_coordinate=y;
    }

    @Override
    public void move(int dx, int dy) {
        x_coordinate+=dx;
        y_coordinate+=dy;
    }
    @Override
    public String toString(){
        return String.format("x: %d; y: %d",x_coordinate,y_coordinate);
    }
}
