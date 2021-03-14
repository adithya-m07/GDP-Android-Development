public class Loops {
    public static void main(String[] args) {

        for(int i = 0;i < 10; i++){
            System.out.println(i);
        }

        int i = 0;
        while(i < 10){
            System.out.println(i);
            i++;
        }

        int[] arr = {1,3,5,3,2};
        for(int x = 0;x < 4; x++){
            if(arr[x] == 5){
                System.out.println("5 Found");
                break;
            }
        }

        for(int x = 0;x < 10; x++){
            if(x <= 5){
                continue;
            }
            System.out.println(x);
        }


    }
}
