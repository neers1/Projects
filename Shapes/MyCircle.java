

    /*
     *
     * MyCircle
     *
     */

    public class MyCircle extends MyShape
    {

        //
        // ToDo:
        //
        // Add a constructor which takes ONLY 1 argument1: radius
        // THATS 1 ARGUMENTS NOT 2 !
        // You can pass it into the superclass constructor twice


     public MyCircle(int radius) {
         super(radius,radius);
     }

        @Override
        public double calculateArea() {
            return Math.PI*width*width;
        }
       public String toString(){
         return "The area of this circle is " + calculateArea();
       }

        //
        // ToDo:
        //
        // Implement the calculateArea() method defined in the superclass.
        //
        //







    }


