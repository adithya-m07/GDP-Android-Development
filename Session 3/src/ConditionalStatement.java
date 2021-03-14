import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String year = sc.next();

        if(year.equals("fe")){
            System.out.println("hello FE");
        }else if(year.equals("se")){
            System.out.println("hello se");
        }else if(year.equals("te")){
            System.out.println("hello te");
        }else{
            System.out.println("hello be");
        }

        // switch statement
        switch (year){
            case "fe" -> System.out.println("hello FE");
            case "se" -> System.out.println("hello SE");
            case "te" -> System.out.println("hello te");
            default -> System.out.println("hello be");
        }
    }
}
