import java.util.Arrays;

public class SUMARRAY {
    public static void main(String[] args) throws Exception {
        int [] numero = {4, 5, 7, 5, 4, 8};

            repeats(numero);
    }

    public static void repeats(int [] arr){
        Arrays.sort(arr);
        int suma=0;
      
        for (int i=0; i<arr.length-1; i++){
           if (arr[i] == arr[i+1]) {
           arr[i +1] =0;
           arr[i ] =0;
           } 
           suma = suma + arr[i];
        }

        if (arr.length -1 != arr.length-2 ) {
            suma = suma + arr[arr.length-1];
           }
           System.out.println(suma);   
     
  }
    }

