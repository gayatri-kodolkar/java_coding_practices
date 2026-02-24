import java.util.*;

public class Challengeprob {
    public static void main(String[] args) {
        int first = 0;
        int next;
        int sec = 1;
        for (int i = 0; i <= 6; i++) {
            System.out.print(first+" ");
            next = first + sec;
            first = sec;
            sec = next;
        }
    }
}
