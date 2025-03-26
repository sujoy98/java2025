public class multiDarray {
    public static void main(String[] args) {
        int arr[][]=new int[3][4];
        for(int i=0;i<=2;i++){
            for(int j=0;j<=3;j++){
                // System.out.println(arr[i][j]);
                arr[i][j]=(int)(Math.random()*100); //Math is a prebuild class
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // System.out.println();
        // // Enhannced for loop
        // for(int n[]:arr){
        //     for(int m:n){
        //         System.out.print(m+" ");
        //     }
        //     System.out.println();
        // }
    }
}
// Output
// 15 76 28 7 
// 94 1 98 32 
// 49 36 89 32 

// 15 76 28 7 
// 94 1 98 32 
// 49 36 89 32 