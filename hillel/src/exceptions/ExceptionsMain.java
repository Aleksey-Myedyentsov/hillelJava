package exceptions;

/**
 * Created by User on 05.11.2015.
 */
public class ExceptionsMain {
    public static void main(String[] args) throws Exception {
        Integer i = null;

        System.out.println("before");
        nesteMethod1(i);
        System.out.println("after");

        try {
            System.out.println("in try block before");
            nesteMethod1(i);
            System.out.println("in try block after");

        } catch (NullPointerException e) {
            System.out.println("something wrong: " + e.getMessage() + e.toString());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("something else wrong: " + e.getMessage() + e.toString());

        } catch (RuntimeException e) {
            System.out.println("runTimeException caught: " + e.toString());
        }


    }

    private static void nesteMethod1(Integer i) throws Exception {
        /*List<Integer> integers = new ArrayList<>();
        integers.get(1);*/

        if (true) {
            throw new Exception("My exception");
        }

        if (true) {
            throw new RuntimeException("my own exceptionn");
        }

        nesteMethod2(i);
    }

    private static void nesteMethod2(Integer i) {
        i.toString();
    }
}
