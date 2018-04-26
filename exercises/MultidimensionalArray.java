class MultidimensionalArray {
   public static void main(String[] args) {

   int [][] arr = new int[5][5];


 for (int i = 0; i < 5; i++) {
        for(int j = 0; j < 5; j++) {
			int rand = (int)(Math.random() * 100);
			arr[i][j] = rand;
        }
	}

 for (int i = 0; i < 5; i++) {
        for(int j = 0; j < 5; j++) {
			System.out.print(arr[i][j] + " ");
        }
        System.out.println("  ");
     }
}
}