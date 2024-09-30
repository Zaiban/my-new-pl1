public class App {
    public static void main(final String[] args) {
        // YOUR CODE GOES HERE 
        int number;

        // ============================= //
        System.out.println("number > 0:");

        number = -1;
        System.out.println(number > 0);

        number = 0;
        System.out.println(number > 0);

        number = 1;
        System.out.println(number > 0);

        number = 9;
        System.out.println(number > 0);

        number = 10;
        System.out.println(number > 0);

        // ============================= //
        System.out.println("number < 10:");

        number = -1;
        System.out.println(number < 10);

        number = 0;
        System.out.println(number < 10);

        number = 1;
        System.out.println(number < 10);

        number = 9;
        System.out.println(number < 10);

        number = 10;
        System.out.println(number < 10);

        // ============================= //
        System.out.println("number > 0 && number < 10:");

        number = -1;
        System.out.println(number > 0 && number < 10);

        number = 0;
        System.out.println(number > 0 && number < 10);

        number = 1;
        System.out.println(number > 0 && number < 10);

        number = 9;
        System.out.println(number > 0 && number < 10);

        number = 10;
        System.out.println(number > 0 && number < 10);

        // ============================= //
        System.out.println("!(number > 0 && number < 10):");

        number = -1;
        System.out.println(!(number > 0 && number < 10));

        number = 0;
        System.out.println(!(number > 0 && number < 10));

        number = 1;
        System.out.println(!(number > 0 && number < 10));

        number = 9;
        System.out.println(!(number > 0 && number < 10));

        number = 10;
        System.out.println(!(number > 0 && number < 10));

        // ============================= //
        System.out.println("number > 0 || number < 10:");

        number = -1;
        System.out.println(number > 0 || number < 10);

        number = 0;
        System.out.println(number > 0 || number < 10);

        number = 1;
        System.out.println(number > 0 || number < 10);

        number = 9;
        System.out.println(number > 0 || number < 10);
        
        number = 10;
        System.out.println(number > 0 || number < 10);
    }
}