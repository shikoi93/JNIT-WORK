public class Array { 
    public static void main(String[] args) 
    { 
  
    int[][][] arr = { { { 1, 2, 0 }, { 3, 4, 9 } }, { { 5, 6, 8 }, { 7, 8, 4 } } }; 
  
     for (int i = 0; i < 3; i++) 
       for (int j = 0; j < 3; j++) 
          for (int z = 0; z < 3; z++) 
            System.out.println("arr[" + i + "][" + j + "][" + z + "] = " + arr[i][j][z]); 
    } 
} 
