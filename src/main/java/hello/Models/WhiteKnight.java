package hello.Models;
public class WhiteKnight {

    private int X;
    private int Y;
    private String img;

    public WhiteKnight( int X , int Y ){
        this.X = X;
        this.Y = Y;
        img = "whiteKnight.jpg";
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
