package ie.gmit;
    import static org.junit.jupiter.api.Assertions.*;
    import org.junit.jupiter.api.Test;
public class CounterTest {
    Counter counter;

    @Test
   void testConstructor(){
         counter = new Counter();
        assertEquals(0,counter.getCount());
    }
}
