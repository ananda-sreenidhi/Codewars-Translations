//Test Cases:
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import java.util.Arrays;
import java.util.Random;

public class SolutionTest {
    @Test
    public void basicTests() {
        assertEquals(4, Kata.lateRide(240));
        assertEquals(14, Kata.lateRide(808));
        assertEquals(19, Kata.lateRide(1439));
        assertEquals(0, Kata.lateRide(0));
        assertEquals(8, Kata.lateRide(8));
    }
    
    @Test
    public void randomTests() {
        Random rnd = new Random();
        for (var i = 0; i <= 100; i++) {
            var a = rnd.nextInt(10) + 1;
            var expected = solution(a);
            assertEquals(expected, Kata.lateRide(a));
        }
    }
    
    static int solution(int n) {
        int[] arr = {(n/60)/10, (n/60)%10, (n%60)/10, (n%60)%10};
        return Arrays.stream(arr).sum();
    }
}

//Sample Test Cases:
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
    @Test
    public void basicTests() {
        assertEquals(4, Kata.lateRide(240));
        assertEquals(14, Kata.lateRide(808));
        assertEquals(19, Kata.lateRide(1439));
        assertEquals(0, Kata.lateRide(0));
        assertEquals(8, Kata.lateRide(8));
    }
}
