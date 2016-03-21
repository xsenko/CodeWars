package Mario;

/**
 * Created by SCabuk on 29.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        int list[] = {16,0,221};
        int returnList[] = Kata.pipeFix(list);

        for (int in : returnList) {
            System.out.println(in);
        }

    }
}
