
public class PerlinNoise {
	
	public static double smoothness = 0.5;
	public static int size = 10;
	public static double[][] NoiseMap = new double [size][size];
	
	public static void main(String[] args) {
		for(int i = 0; i < size; i++){
			for(int j = 0; j < size; j++) {
				boolean joel = Math.random() > smoothness;
				if(joel) {
					NoiseMap[i][j] = 1;
				}
			}
		}
		
		printNoiseMap();
	} 
	
	public static void printNoiseMap() {
		for(int i = 0; i < size; i++){
			for(int j = 0; j < size; j++){
				System.out.print(NoiseMap[i][j] + "  ");
			}
			System.out.println();
			System.out.println();
		}
	}

}
