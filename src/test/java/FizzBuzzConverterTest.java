import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzConverterTest {
    @Test
    public void  shoudReturnFizzWhenInputIs3(){
        FizzBuzzConverter  fizzBuzzConverter = new FizzBuzzConverter( );
        String  result = fizzBuzzConverter.convert(3);
        Assert.assertEquals("Fizz",result);
    }
    @Test
    public void  shoudReturnBizzWhenInputIs5(){
        FizzBuzzConverter  fizzBuzzConverter = new FizzBuzzConverter( );
        String  result = fizzBuzzConverter.convert(5);
        Assert.assertEquals("Buzz",result);
    }
    @Test
    public void shoudReturnFizzBuzzWhenInputIs15(){
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        String result = fizzBuzzConverter.convert(15);
        Assert.assertEquals("FizzBuzz", result);
    }
    @Test
    public void shoudReturnTheNumberInTheInputWhenInputIs7(){
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        String result = fizzBuzzConverter.convert(7);
        Assert.assertEquals(String.valueOf(7), result);
    }

}
