package simpjade;

import java.util.Scanner;

public class Metslr {
Scanner scanner=new Scanner(System.in);
    public void arrX(int num[]){
    for(int i=0;i<num.length;i++){
        System.out.println(" Inserta x: ");
        num[i]=scanner.nextInt();
    }
}
public void arrY(int num[]){
    for(int i=0;i<num.length;i++){
        System.out.println(" Inserta y: ");
        num[i]=scanner.nextInt();
    }
}
//Xi 
public int OpeX1(int num[]){
     int res=0;
    for(int i=0;i<num.length;i++){
        res+=num[i];  
      }  
  return res;
} 
//X^2i
public int OpeX2(int num[]){
    int res=0;
    for(int i=0;i<num.length;i++){
        res+=Math.pow(num[i],2);
    }
    return res;
}
//Yi
public int OpeY1(int num[]){
    int res=0;
    for(int i=0;i<num.length;i++){
        res+=num[i];    
    }
    return res;
}
//Xi*Yi
public int Opemult(int num[],int num2[]){
    int res=0;
    for(int i=0;i<num.length;i++){
        res+=(num[i]*num2[i]);
    }
    return res;
}
}
