public class MyTriangle extends MyShape {


    public MyTriangle(int base, int height){
        super(base, height);
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    public String toString(){
        return "This is a triangle!!";
    }
}
