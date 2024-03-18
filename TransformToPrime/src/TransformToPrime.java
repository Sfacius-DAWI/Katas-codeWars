public class TransformToPrime {
    public static void main(String[] args) throws Exception {
        
        int [] numbers = {2,12,8,4,6};
        minimumNumber(numbers);
    }

    public static void minimumNumber(int[] numbers)
    {
      int suma =0, contador=1, incremento = 0;
      for (int i=0; i<numbers.length; i++) {
        suma = suma +numbers[i];
      }
      for(int i = 2; i < suma; i++) {
		if (suma%i == 0) {
			suma++;
            incremento++;
            i=2;
		}
       
	}
	 System.out.println(incremento);

      
        
     
        
}
}
