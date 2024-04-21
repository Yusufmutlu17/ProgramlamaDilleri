public class Multi_d_array {
	public static void main(String[] args) {

 int[][] dizi= new int[3][4];
 for (int i=0;i<dizi.length;i++) {
	 for (int j= 0;j<dizi[i].length ;j++) {
		 dizi[i][j]=i*4+j+1;
	 }
 }
 for(int i=0;i<dizi.length;i++){
		 for(int j=0;j<dizi[i].length;j++) {
			 System.out.println(dizi[i][j]+ " ");
		 } 
		 System.out.println();
	 }
 }
	}