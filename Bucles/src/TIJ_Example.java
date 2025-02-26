public class TIJ_Example {

    static boolean condition() {
        boolean result = Math.random() > 0.99;

        while(!result) {
            System.out.print(result + ", ");
            result = Math.random() > 0.9;
        }
        return result;
    }
    public static void main(String[] args) {
        while (condition()) {
            System.out.println("Inside while");
            break
        }
        System.out.println("Outside while");


        switch(8){
            case 1 -> System.out.println("Inside switch");
            case 2 -> System.out.println("Inside switch");
        }
    }


}
