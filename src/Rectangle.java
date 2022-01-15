public class Rectangle extends Shape{
    private double width, length;

    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return  width * length;
    }

    public double getPerimeter(){
        return 2*(width + length);
    }

    @Override
    public String toString() {
        return "Hình chữ nhật chiều rộng " + getWidth() +", chiều dài " + getLength() +". nó là một lớp con của " + super.toString();
    }
}
