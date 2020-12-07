package Practice;

abstract class Shape {

    /**
     * Abstract methods
     * @return
     */
    abstract double surfaceArea();
    abstract double perimeter();
    abstract double volume();
    abstract void reduceSize();

    /**
     *
     * Concrete method
     */
    void destroy(){
        System.out.println("Shape destroyed");
    }
}
