package Learning.Assignment4;

public class Transpose {

    public void MatrixTranspose(){
        int original[][]={{1,3,4},{2,4,3},{3,4,5}};

        int transpose[][]=new int[3][3];


        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                transpose[i][j]=original[j][i];
            }
        }
        System.out.println("printing matrix without transpose : ");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++) {
                System.out.println(original[i][j]+"");
            }
            System.out.println();//new line
            }
        System.out.println("printing matrix After transpose : ");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++) {
                System.out.println(transpose[i][j]+"");
            }
            System.out.println();//new line
        }
    }

    public static void main(String[] args) {
        Transpose t=new Transpose();
        t.MatrixTranspose();
    }
}
