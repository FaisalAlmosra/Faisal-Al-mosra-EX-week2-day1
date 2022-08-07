public class movablepoint implements movable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public movablepoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String toString(){
        return "("+this.x+","+this.y+"),speed=("+this.xSpeed+","+this.ySpeed+")";
    }
    public void moveUp(){
        this.y=this.y-this.ySpeed;
    }
    public void moveDown() {
        this.y=this.y+this.ySpeed;
    }
    public void moveLeft() {
        this.x=this.x-this.xSpeed;
    }
    public void moveRight() {
        this.x=this.x+this.xSpeed;
    }

}