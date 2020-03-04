import java.util.Arrays;
public class Kata {
    public static int lateRide(int n) {
        int[] arr = {(n/60)/10, (n/60)%10, (n%60)/10, (n%60)%10};
        return Arrays.stream(arr).sum();
    }
}
