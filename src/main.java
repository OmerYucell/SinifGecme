import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int mat,fizik,kimya,türkce,muzik, toplam = 0,ortalama = 0;


        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Matematik Notunuzu Girniz :");
        mat = inp.nextInt();
        if (mat >= 0 && mat <=100){
            toplam += mat;
            ortalama++;
        }

        System.out.print("Lütfen Fizik Notunuzu Girniz :");
        fizik = inp.nextInt();
        if (fizik >= 0 && fizik <=100){
            toplam += fizik;
            ortalama ++;
        }

        System.out.print("Lütfen Kimya Notunuzu Girniz :");
        kimya = inp.nextInt();
        if (kimya >= 0 && kimya <=100){
            toplam += kimya;
            ortalama++;
        }

        System.out.print("Lütfen Türkçe Notunuzu Girniz :");
        türkce = inp.nextInt();
        if (türkce >= 0 && türkce <=100){
            toplam += türkce;
            ortalama++;
        }

        System.out.print("Lütfen Müzik Notunuzu Girniz :");

        muzik = inp.nextInt();
        if (muzik >= 0 && muzik <=100){
            toplam += muzik;
            ortalama++;
        }


        int sonuc =toplam/ortalama;



        if (sonuc >= 55){
            System.out.print("Tebrikler Geçtiniz :"+ sonuc);
        }else {
            System.out.print("Kaldiniz " + "Ortalama :" + sonuc);
        }


    }
}
