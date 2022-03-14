package P5;


import java.util.Arrays;

public class Grid {

    private static final  String EMPTY = ".";
    private static final  String RED = "R";
    private static final  String YELLOW = "Y";

    private static final int WITH_GRID = 7;
    private static final int HEIGHT_GRID = 6;
    private   String[][] matrix;

    public Grid() {
        this.matrix = new String[HEIGHT_GRID][WITH_GRID];
        for (String[] row: matrix)
            Arrays.fill(row, ".");
    }

    public int getLinesNumber(){
        return HEIGHT_GRID;
    }
    public int getColumnNumber(){
        return WITH_GRID;
    }

    public boolean isFilledWithPoints(){
        for(int i=0;i<HEIGHT_GRID;i++){
            for(int j=0;j<WITH_GRID;j++){
                if( this.matrix[i][j] != EMPTY ) return false ;
            }
        }
        return true;
    }
    public boolean isFullyFilled(){
        for(int i=0;i<HEIGHT_GRID;i++){
            for(int j=0;j<WITH_GRID;j++){
                if( matrix[i][j] == EMPTY ) return false ;
            }
        }
        return true;
    }

    public boolean canFillIn(int column) {
        if(!isFullyFilled()){
          for (int i = HEIGHT_GRID - 1 ; i >= 0 ; i-- ){
              if (matrix[i][column] == EMPTY ) return true;
          }
        }
        return false;
    }


    public int[] fillGrid(int column,String color) {
        int [] position= new int[2];
        if(column >= 7 || column < 0) throw new RuntimeException(" invalid column ");
        for(int i=0;i<6;i++){
            if(matrix[i][column].equals(".")) {
                matrix[i][column] = color;
                position[0] = i;
                position[1] = column;
                break;
            }
        }
        return position;
    }
}
