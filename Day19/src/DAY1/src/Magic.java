import java.util.*;
public class Magic {
    public static void main(String[] args) {
        int a[][]=new int[3][3],f=0,sum=0,sumd=0,sumc=0,sumr=0,i,j;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.println("enter  number : ");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("matrix is...");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.println(a[i][j]+" ");
            }
            System.out.println();
        }
        for(i=0;i<3;i++){
            for(j=0;j<3;j++)
            {
                if(i==j){
                    sum=sum+a[i][j];
                }
                if(i+j==3-1){
                    sumd=sumd+a[i][j];
                }
            }
        }
        if(sum!=sum){
            f=1;
        }
        else{
            for(i=0;i<3;i++){
                sumc=0;
                sumr=0;
                for(j=0;j<3;j++){
                    sumc=sumc+a[i][j];
                    sumr=sumr+a[j][i];
                }
                if(sumc!=sumr)
                {
                    f=1;
                }
                else if(sum!=sumc){
                    f=1;
                }
            }
            if(f==0)
                System.out.println("matrix is magic square matrix");
            else
                System.out.println("matrix is not magic square");

        }
    }
}