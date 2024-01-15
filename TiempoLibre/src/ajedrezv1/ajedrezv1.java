package ajedrezv1;

public class ajedrezv1 {
	public static void main(String[] args) {
		int table [][]= new int[8][8]; 
		for (int i=0;i<8;i++) {
			for(int j=0;j<8;j++){
				table[i][j]=1;
			}
		}
		for (int i=0;i<8;i++) {
			for (int j=0;j<8;j++) {
				System.out.print("  "+table[i][j]);
			}
			System.out.println("  ");
		}
	}
}
