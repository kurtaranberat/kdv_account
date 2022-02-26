import  java.util.Scanner;
public class kdv {
    public  static  void  main (String[]args ) {
        Scanner brt = new Scanner(System.in);

        System.out.println("urun fiyatını gırınız");
        double urun = brt.nextDouble();

        double fiyat = 0;
        if (urun < 1000) {
            fiyat = urun * 0.18;
            fiyat= fiyat+ urun ;
            System.out.println(fiyat);
          }
        else  {
            fiyat = urun * 0.08;
            fiyat= fiyat+ urun ;
            System.out.println(fiyat);
        }

    }
}
