//import java.util.Scanner;
public class ForEachloop{
public static void main(String[] args){
//Scanner sc = new Scanner(System.in);
int[] arr1 = new int[]{
    1,8,3,4
    

};
// for(int a[][]: arr1){
//     for(int b[]:a){
//         for(int c:b){
//             inner:
//             System.out.print(c+" ");
//         }
//     }
// }

// for(int i=0 ; i<arr1.length; i++){
   
//     for(int j=0; j<arr1[i].length; j++){
//         inner:
//         for(int k=0; k < arr1[i].length;k++){

//   System.out.print(arr1[i][j][k]+" ");
             
//         }
//     }
// }
outer:
for(int i=0 ; i<arr1.length; i++){
    for(int j=0; j<arr1.length; j++){
            System.out.print("hi");
            break outer;
             //break inner;

        
    }
   
}
 }
}
