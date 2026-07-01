public class StringLeasson {
    public static void main(String[] args) {
        //String helloWorld = messenge();
        //System.out.println(helloWorld);

        String name = "Junior";
        String greating = helloPerson(name);
        System.out.println(greating);


    }

    public static String messenge(){
        String greating = "Hello World!";
        return greating;
    }

    public static String helloPerson(String name){
        String greeting = "Hello " + name;
        return greeting;
    }
    
}
