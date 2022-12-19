import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;


import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestFeline {


    @Spy
    private Feline feline;
    @Test
    public void felineEatMeatTest() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamilyReturnFeline() {
        String expected = "Кошачьи";
        assertEquals(expected, feline.getFamily());
    }

    @Test
    public void getKittensReturnTest() {
        int expected = 1;
        assertEquals(expected, feline.getKittens());
    }


}