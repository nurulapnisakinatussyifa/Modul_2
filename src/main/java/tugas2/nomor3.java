package tugas2;
public class nomor3 {
      public static void main(String[] args) {
        int [][] A = {
            {3,8,9},
            {10,14,7}
        };
        int [][] B = {
            {5,8},
            {12,3},
            {20,1}
        };
        if(A[0].length == B.length) {
            int[][] C = new int [A.length][B[0].length];
            for(int i = 0; i<A.length; i++) {
             for(int j = 0; j<B[0].length; j++) {
                 for(int k = 0; k<A[0].length; k++){
                 C [i][j] += A[i][k] * B[k][j];
             }   
                
            }
        }
        for(int[]c : C ){
            for(int i : c) {
           System.out.print(i+" "); 
        }
            System.out.println();
        }
        System.out.println("NURUL APNI SAKINATUS SYIFA");
        }
    }
    
        
}
