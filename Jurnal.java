package jurnal;

import java.util.Scanner;


public class Jurnal{
    public static void main (String args[]){
        int[] bil=new int[100];
        bil[0]=0;
        bil[1]=1;        
        int deret;
        
        Scanner input = new Scanner (System.in);
        System.out.print("Masukan jumlah deret : ");
        String data = input.nextLine();
        deret = Integer.parseInt(data);
        
        for(int i=0;i<deret;i++){
            System.out.print(bil[i]+" ");
            bil[i+2]=bil[i]+bil[i+1];
        }
    }
}
