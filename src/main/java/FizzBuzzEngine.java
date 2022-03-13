import java.util.List;
import java.util.stream.IntStream;

public class FizzBuzzEngine {

    public List fizzBuzzList(int number) {
        List  list = ListFactory.getList();
        IntStream.rangeClosed(1, number).mapToObj( i -> i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz" :"Fizz" )
                : (i % 5 == 0 ? "Buzz" : i) ).forEach(list::add);
        return list;
    }

}
