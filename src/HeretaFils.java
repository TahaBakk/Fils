/**
 * Created by x3727349s on 19/10/16.
 */
public class HeretaFils extends Thread {


    String strImprimir;
    public HeretaFils(String strP){
        strImprimir = strP;
    }


    public void run(){
        for(int i=0; i<=9;i++){
            System.out.println(strImprimir+" "+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread primer = new HeretaFils("Fil 1");
        Thread segon = new HeretaFils("Fil 2");
        primer.start();
        primer.join();
        segon.start();
        segon.join();

        for (int i = 0; i <= 9; i++) {
            System.out.println("padre: "+i);
        }
        System.out.println();
    }

}
