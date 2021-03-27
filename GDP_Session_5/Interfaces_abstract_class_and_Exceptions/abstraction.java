
abstract class Bottle{
    int capacity = 100;
    String color;
    //Method definition
    public void printCapacity(){
        System.out.println("Bottle capacity "+capacity);
    }
    //Abstract method deceleration
    abstract void fillUp();
}


//Interface
interface Books{
    //By default a final variable
    int noOfPages = 100;
    //By default an Abstract method
    void printPages();
}

//First Non Abstract class which inherits Bottle and implements the methods of Books and the
//Abstract method of bottle
class Bag extends Bottle implements Books{

    //Override annotation for defining abstract methods
    @Override
    void fillUp() {
        System.out.println("The bottle has been filled");
    }

    @Override
    public void printPages() {
        System.out.println("No. Of pages = "+noOfPages);
    }
}

public class Main{
    public static void main(String[] args) {
        //Object of the class Bag
        Bag b = new Bag();
        b.fillUp();
        b.printPages();
        //Try block to declare that an exception might occur
        try {
            int a = 100;
            int c = 500;
            if(a<c){
                //Throw will create an Arithmetic Exception
                throw new ArithmeticException("A < C");
            }
            else {
                //Throw will create a regular Exception
                throw new Exception("A >= B");
            }
        } catch (Exception e) {
            //Catch block will handle the exception with the exception object e
            //Print stackTrace will print the details of the exception
            e.printStackTrace();
        }
        finally {
            //Finally block implements the statements irrespective of the handling of the exception
            System.out.println("This is the finally block");
        }
        //If the exception is caught, this statement is printed
        System.out.println("This is after the exception");
    }
}