public class BitCounting {

    public static int countBits(int n){

        int binario=0, recuento=0, terminado=0;
        while (n>terminado) {

            recuento = n%2;
            n = n/2;
            if (recuento%2==0) {

            }
            else {
                binario = binario +1;
            }

        }
        return binario;
    }
}

	