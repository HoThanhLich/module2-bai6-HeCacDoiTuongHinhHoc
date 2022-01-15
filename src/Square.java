public class Square extends Rectangle {


    public Square() {
        super();
    }

    public Square(double size) {
        super(size, size);
    }

    public Square( String color, boolean filled,double size) {
        super(color, filled,size, size);
    }

    public double getSize() {
        return getWidth();
    }

    public void Size(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        Size(width);
    }

    @Override
    public void setLength(double length) {
        Size(length);
    }

    @Override
    public String toString(){
        return "Hình vuông size " + getSize()+", nó là lớp con của "+super.toString();
    }

}
