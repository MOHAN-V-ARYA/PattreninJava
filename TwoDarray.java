import java.util.*;
public class TwoDArray {
public static void main(String[] args){
Scanner obj=new Scanner(System.in);
System.out.println("enter how many row you want : ");
int row=obj.nextInt();
System.out.println("enter how many colum you want : ");
int colum=obj.nextInt();
int[][] numbers=new int[row][colum];
for(int i=0;i<row;i++){
 for(int j=0;j<colum;j++){
   numbers[i][j]=obj.nextInt();
 }
}

  System.out.println("Matrix");
 for(int i=0;i<row;i++){
     for(int j=0;j<colum;j++){
         System.out.print(numbers[i][j]+" ");
   }
    System.out.println();
  }
  System.out.println();
   System.out.print("Enter number which you are looking for ; ");
  int x=obj.nextInt();
  
  boolean found=false;
  for(int i=0;i<row;i++){
      for(int j=0;j<colum;j++){
          if(numbers[i][j] == x){
           System.out.println("x found at : "+i+","+j);
           found=true;
        }
      }
  }
  if(!false){
      System.out.println("searched number not present in the Matrix ; ");
       }
      }
}