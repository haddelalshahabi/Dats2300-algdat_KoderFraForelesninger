public class TernaryIf {
    //Ternary if er en helt vanlig if-setning skrevet på en litt annen måte.
    // Det er en kraftig teknikk, men kan også veldig lett missbrukes og dermed lage svært uleselig kildekode.
    public static void main(String[] args) {

        for (int i=0; i<10; ++i) {
            int a = i;
            int b = myTernaryIfTest(a);
            System.out.println(b);
        }

        int a = 17;

        int b = (a < 5) ? 13 : 17;
    }

    public static int myTernaryIfTest(int value) {

        /*
        if (value < 5) {
            return 0;
        }
        else {
            return 98;
        }
        */

        return (value < 5) ? 0 : 98;
    }
}
