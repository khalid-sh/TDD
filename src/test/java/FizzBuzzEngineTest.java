import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;


public class FizzBuzzEngineTest {
    @Test
    public void shoudReturn1WhenInputIs1(){
        FizzBuzzEngine fizzBuzzEngine = new FizzBuzzEngine();
        List fizzBuzzlist = fizzBuzzEngine.fizzBuzzList(1);
        List expectedFizzBuzzList =  Arrays.asList(1);
        Assert.assertEquals(expectedFizzBuzzList,fizzBuzzlist);
    }
    @Test
    public void shoudReturn12WhenInputIs2(){
        FizzBuzzEngine fizzBuzzEngine = new FizzBuzzEngine();
        List fizzBuzzlist = fizzBuzzEngine.fizzBuzzList(2);
        List expectedFizzBuzzList =  Arrays.asList(1,2);
        Assert.assertEquals(expectedFizzBuzzList,fizzBuzzlist);
    }
    @Test
    public void shoudReturn12FizzWhenInputIs3(){
        FizzBuzzEngine fizzBuzzEngine = new FizzBuzzEngine();
        List fizzBuzzlist = fizzBuzzEngine.fizzBuzzList(3);
        List expectedFizzBuzzList =  Arrays.asList(1,2,"Fizz");
        Assert.assertEquals(expectedFizzBuzzList,fizzBuzzlist);
    }
    @Test
    public void shoudReturn12Fizz4BuzzWhenInputIs5(){
        FizzBuzzEngine fizzBuzzEngine = new FizzBuzzEngine();
        List fizzBuzzlist = fizzBuzzEngine.fizzBuzzList(5);
        List expectedFizzBuzzList =  Arrays.asList(1,2,"Fizz",4,"Buzz");
        Assert.assertEquals(expectedFizzBuzzList,fizzBuzzlist);
    }
}
