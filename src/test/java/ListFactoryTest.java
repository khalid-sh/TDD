import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class ListFactoryTest {
    @Test
    public void shoudReturnList(){
        ListFactory listFactory = new ListFactory();
        List list = (List) listFactory.getList();
        Assert.assertEquals(new ArrayList<>(),list);
    }
}
