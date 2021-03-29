package tugas2;
public class nomor2 {
    public static void main(String[]args){
        int [][] A = {
            {10,8},
            {15,20},
            {9,7},
        };
        int [][] B = {
            {5,2},
            {10,10},
            {4,6},
        };
        
        if ((A.length == B.length) && (A[0].length == B[0].length)){
            int [][] C = new int[A.length][A[0].length];
            for(int i = 0; i<A.length; i++) {
                for(int j = 0; j<A[0].length; j++){
                    C[i][j] = A[i][j] - B[i][j];
                    System.out.print(C [i] [j] + "  ");   
                }   
                 System.out.println();
                    }
            System.out.println("NURUL APNI SAKINATUS SYIFA");
        }
    }
     
    }
    

                
    

