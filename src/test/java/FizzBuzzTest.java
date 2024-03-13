import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.FizzBuzz;

public class FizzBuzzTest {
    @Test
    public void fizz_Given5_ShouldBeFizz() {
        assertEquals("Fizz", FizzBuzz.checkNumber(5));
    }

    @Test
    public void fizz_Given7_ShouldBeBuzz() {
        assertEquals("Buzz", FizzBuzz.checkNumber(7));
    }

    @Test
    public void fizz_Given35_ShouldBeFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.checkNumber(35));
    }

    @Test
    public void fizz_Given4_ShouldBe4() {
        assertEquals("4", FizzBuzz.checkNumber(4));
    }

    @Test
    public void fizz_GivenMinus3_ShouldBeException() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzz.checkNumber(-3));
    }

    @Test
    public void fizz_Given166_ShouldBeFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.checkNumber(166));
    }
}