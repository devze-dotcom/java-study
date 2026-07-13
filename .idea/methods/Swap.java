public class Swap {
    public static void main(String[] args) {

        int a = 10;
        int b = 90;

        System.out.println(a + " " + b);
        swap(a, b);
        System.out.println(a + " " + b);

        String nameStrin = "Brasil";
        name(nameStrin);

        

    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    static void name(String name){
        name = "Junior";
    }
}
