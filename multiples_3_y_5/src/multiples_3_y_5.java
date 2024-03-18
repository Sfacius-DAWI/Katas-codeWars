public class multiples_3_y_5{

    public int multiples(int number) {
        int solution = 0;

        for(int i = 3; i < number; i++){
            if(i % 3 == 0 || i % 5 == 0){
                solution += i;
            }
        }

        return solution;
    }

}