import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class TestFelineParams {

    private final int kittensCount;
    private final int expected;


    public TestFelineParams(int kittensCount, int expected) {
        this.kittensCount = kittensCount;
        this.expected = expected;
    }
    @Parameterized.Parameters
    public static Object[][] getKittens() {
        return new Object[][] {
                { 1, 1},
                { 35, 35},
                { 999, 999},
        };
    }

    @Test
    public void felinesCountTest() {
        Feline feline = new Feline();
        assertEquals(expected, feline.getKittens(kittensCount));
    }

}