import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        //By default, the elements of an integer array are initialized to 0.
        int[] ages = new int[10];
        System.out.println(Arrays.toString(ages));

        //By default, the elements of a any reference array are initialized to null.
        String[] names = new String[10];
        System.out.println(Arrays.toString(names));

        Integer[] citys = new Integer[10];
        System.out.println(Arrays.toString(citys));
    }
    
}
