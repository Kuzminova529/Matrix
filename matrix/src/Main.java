public class Main {
    public static void main(String[] args) {
        int[][] ourMatrix = new int[3][3];
       ourMatrix[0][0] = 1;
       ourMatrix[0][1] = 2;
       ourMatrix[0][2] = 3;
       ourMatrix[1][0] = 4;
       ourMatrix[1][1] = 5;
       ourMatrix[1][2] = 6;
       ourMatrix[2][0] = 7;
       ourMatrix[2][1] = 8;
       ourMatrix[2][2] = 9;
       for ( int i = 0; i<3;i++){
           for ( int j = 0; j<=i;j++){
               if (i==j)
                   break;
               ourMatrix[i][j] += ourMatrix[j][i] ;
               ourMatrix[j][i] = ourMatrix[i][j] - ourMatrix[j][i];
               ourMatrix[i][j] -= ourMatrix[j][i];

           }

       }
        for ( int i = 0; i<3;i++){
            for ( int j = 0; j<3;j++){
                System.out.print(ourMatrix[i][j]);

            }
            System.out.println("");
        }

    }
}