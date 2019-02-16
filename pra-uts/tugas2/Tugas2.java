public class Tugas2 {
  public static void main(String[] args) {
    if(args.length == 8) {
        int[] arr = new int[8];
        arr[0] = Integer.parseInt(args[0]);
        arr[1] = Integer.parseInt(args[1]);
        arr[2] = Integer.parseInt(args[2]);
        arr[3] = Integer.parseInt(args[3]);
        arr[4] = Integer.parseInt(args[4]);
        arr[5] = Integer.parseInt(args[5]);
        arr[6] = Integer.parseInt(args[6]);
        arr[7] = Integer.parseInt(args[7]);
        int n = 8;  
        int temp = 0;

        for(int i=0; i < n; i++){  
          for(int j=1; j < (n-i); j++){  
            if(arr[j-1] > arr[j]){  
              temp = arr[j-1];
              arr[j-1] = arr[j];  
              arr[j] = temp;  
            }
          }
        }

        for (int i = 7; i > 4; i--) {
          System.out.println(arr[i]);
        }
    } else {
       System.err.println("Masukkan 8 angka berbeda");
    }
  }
}
