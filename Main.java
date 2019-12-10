class Main {
  public static void main(String[] args) {
  
  //Creates a 2D array with [rows][columns]
  int [][] abc = new int[13][13];
  int sum=0;
  //Creates and fills the 2D array
  int[][] xyz = {
    {1,2,3,4,5},
    {6,7,8,9,10},
    {11,12,1,3,5}
  };


  for(int r = 0; r<abc.length;r++)
  {
    for(int c = 0; c<abc.length; c++)
    {
       abc[r][c] = r+c;//fills the array location with the sum of the row and column
       System.out.print(abc[r][c]+"\t");
       if (c==12)
       System.out.println();

    }

  }
  System.out.println(abc[5][8]);
  for(int r=0; r<abc.length;r++){
    for(int c = 0; c<abc.length; c++){
      if(c==4)
      sum+=abc[r][c];
    }
  }  
  System.out.println("The sum of column 5 is: "+sum);
  
  for(int r=0; r<xyz.length;r++){
    for(int c = 0; c<xyz[0].length; c++){
      System.out.print(xyz[r][c]+"\t");
    }
    System.out.println();
  }  

  }
}