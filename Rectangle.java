package Practice;

public class Rectangle extends Shape implements DoMore{
    private double length;
    private double width;
    private double height;

    public Rectangle(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
        System.out.println("You have a created a rectangular shape");
    }

    public void foobar(int number){
        if(number % 3 != 0 && number % 5 != 0){
            System.out.println("Number not divisible by 3 or 5");
        }else{
            if(number % 3 == 0 && number % 5 != 0){ System.out.println("foo"); }
            else if(number % 5 == 0 && number % 3 != 0 ) {
                System.out.println("bar");
            }
            else {
                System.out.println("foobar");
            }
        }
    }

    /**
     * Overriding parent methods
     * @return
     */

    @Override
    public double surfaceArea(){
        return length * width;
    }

    @Override
    public double perimeter(){
        return 2 * (length + width);
    }

    @Override
    double volume() {
        return length * width * height;
    }

    @Override
    public void reduceSize() {
        System.out.println("Size reduced");
    }

    /**
     * Override implemented class methds
     */
    @Override
    public void paint() {
        System.out.println("Item painted");
    }

    @Override
    public void printName() {
        method1();
        System.out.println("This is a Rectangle");
    }

    @Override
    public void duplicate() {
        System.out.println("Shape hs been duplicated");
    }

    @Override
    public void method1() {
        System.out.print("This is a ");
    }
}
