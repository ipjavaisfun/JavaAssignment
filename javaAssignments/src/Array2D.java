
// Assignment#4
public class Array2D {

	public static void main(String[] args) {
		
		int number [][] = {{1},{2,1,2},{3,2,1,2,3},{4,3,2,1,2,3,4},{5,4,3,2,1,2,3,4,5}};
		
		for (int[] is : number) {
			for (int is2 : is) {
				System.out.print(is2);
			}
			System.out.println();
		}
	}

}
