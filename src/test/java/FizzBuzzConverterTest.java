import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzConverterTest {
    @Test
    public void  shoudReturnFizzWhenInputIs3(){
        FizzBuzzConverter  fizzBuzzConverter = new FizzBuzzConverter( );
        String  result = fizzBuzzConverter.convert(3);
        Assert.assertEquals("Fizz",result);
    }

}
