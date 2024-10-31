public class Multidimensional_arrays {
  public static void main(String[] args) {
    int[] number = {1,2,3};
    System.out.println(number[1]);

    int[][] matrix = {{1,2,3},{4,5},{6,7,8,9,10,11,12}};
    System.out.println(matrix[2][0]);
    System.out.println(matrix[1][1]);

    System.out.println();

    for(int i = 0; i<matrix.length; i++){
      for(int j = 0; j<matrix[i].length; j++){
        System.out.println(matrix[i][j] + " ");
      }
      System.out.println();
    }

    
    int[] numbers = new int[5];
    Strings[][] strings = new String[2][3];
    strings[0][1] = "Hello";
    System.out.println(strings[0][1]);

  }
}
