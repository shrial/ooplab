import java.util.Scanner;
public class Magicsq {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter the number of rows and columns");     
        int m=in.nextInt();     
        int arr[][]=new int[m][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                System.out.println("enter the element");
                arr[i][j]=in.nextInt();                
            }
        }
        int a=1,rsum=0,csum=0,psum=0,dsum=0,flag=1;
        switch(a){
            case 1:
            {
            for(int i=0;i<m;i++){
                for(int j=0;j<m;j++){
                    if(i==j){
                        psum+=arr[i][j];
                    }        
                }
            }}
            
            case 2:
            {
                for(int i=0;i<m;i++){
                    for(int j=0;j<m;j++){
                        if((i+j)==(m-1)){
                            dsum+=arr[i][j];
                        }        
                    }
                }
                if(psum!=dsum){
                    flag=0;
                    break;
                }
                
            }
            case 3:
            {
                for(int i=0;i<m;i++){
                    for(int j=0;j<m;j++){
                        rsum+=arr[i][j]; 
                        csum+=arr[j][i];     
                    }
                    
                    if(rsum!=psum || csum!=psum){
                        flag=0;
                        break;
                    }
                    rsum=0;
                    csum=0;
                }
                if(flag==0){
                    break;
                }
            }
            
            
            
        }
        if(flag==1){
            System.out.println("matrix is a magic square");
        }
        else{
            System.out.println("matrix is not a magic square");
        }
        in.close();
    }
}
