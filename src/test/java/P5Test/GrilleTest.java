package P5Test;

import P5.Grid;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GrilleTest {


    @Test
    public  void shouldReturnGridWith6LinesWhenInstantiation(){
        Grid grid = new Grid();
        Assert.assertEquals(6,grid.getLinesNumber());
    }
    @Test
    public  void shouldReturnGridWith7ColumnsWhenInstantiation(){
        Grid grid = new Grid();
        Assert.assertEquals(7,grid.getColumnNumber());
    }

    @Test
    public void shouldReturnGridFilledWithPointsWhenInstantiate(){
        Grid grid = new Grid();
        Assert.assertTrue(grid.isFilledWithPoints());
    }
    @Test
    public void shoudThrowExceptionWhenColumnIs7(){
        Grid grid = new Grid();

        RuntimeException exception =
                assertThrows(RuntimeException.class, () -> grid.fillGrid(7,"R"));
        assertEquals(" invalid column ",exception.getMessage());
    }

    @Test
    public  void shouldPutInColumn1AndRomIs1WhenColumnIs1AndRowEmpty(){
        Grid grid = new Grid();
        int[] expectedPosition = {0,1};
        int[] position = grid.fillGrid(1, "R");

         Assert.assertArrayEquals(expectedPosition,position);

    }

    @Test
    public  void shouldPutInColumn2AndRomIs1WhenColumnIs2AndRowEmpty(){
        Grid grid = new Grid();
        int[] expectedPosition = {0,2};
        int[] position = grid.fillGrid(2, "R");

        Assert.assertArrayEquals(expectedPosition,position);

    }

//    //invalidColumn => column already filled or less than 1 or greater than 7
//    @Test
//    public void shoudReturnExceptionWhenColumnIsInvalid(){
//        Grid grille = new Grid();
//        boolean canFillIn = grille.canFillIn(2);
//        Assert.assertEquals(true, canFillIn);
//    }



}
