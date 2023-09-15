package Task2;

public class Rectangle {
    private int height;
    private int width;

    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }

    public int getArea(){
        return height * width;
    }

    public int getPerimeter(){
        return (height *2) + (width *2);
    }

    public int getHeight(){
        return height;
    }

    public int getWidth(){
        return width;
    }
}
