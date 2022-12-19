import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class TestLion {

    @Mock
    Feline feline;
    @Test
    public void getKittensReturnOneTest() {
        Lion lion = new Lion(feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }

    @Test (expected = Exception.class)
    public void constructorException() throws Exception {
        try {
            Lion lion = new Lion("Оно");
        } catch (Exception a) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", a.getMessage());
            throw a;
        }
    }

    @Test
    public void lionHasManeTest() throws Exception {
        Lion lion = new Lion("Самец");
        assertEquals(lion.hasMane, lion.doesHaveMane());
    }

    @Test
    public void lionFoodGets() throws Exception {
        Lion lion = new Lion(feline);
        Mockito.when(feline.getFood(Mockito.anyString())).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

}