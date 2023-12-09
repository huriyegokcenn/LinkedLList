package LinkedLListYeni;

import java.util.Scanner;

public class AnaSinif {

	public static void main(String[] args) {
		    Scanner giris = new Scanner(System.in);
			Eleman el=new Eleman (12342,2002,"Ahmmet","çoban");
			Eleman el1= new Eleman (13341,2003,"gökçen","açıkgöz");
			
			LinkedList bl =new LinkedList();
			bl.BasaElemanEkle(el);
			bl.BasaElemanEkle(el1);
			//bl.ListeYazdir();
			
			
			bl.BasaElemanEkle(new Eleman(1234567, 2005, "Sümeyye","Açıkgöz"));
			bl.ListeYazdir();
			System.out.println("🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧");
			System.out.println("sona eleman ekliyoruz");
			bl.SonaElemanEkle(new Eleman(3746034, 1980, "Nurdan","AÇIKGÖZ"));
			bl.SonaElemanEkle(new Eleman(16536532,1978,"İdris","AÇIKGÖZ"));
			bl.Elemansayısı();
			bl.ListeYazdir();
			System.out.println("🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧");
			bl.SondanSil();
			bl.ListeYazdir();
			System.out.println("🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧🫧");
			System.out.println("sona eleman ekledik");
			bl.ArayaElemanEkle(new Eleman(123435,1955,"Emire","AÇIKGÖZ"), 2);
			bl.Elemansayısı();
			bl.ListeYazdir();
			
			int secim;
			System.out.println("doğum tarihi aramak için 1'i seçiniz,tckn aramak için 2'yi seçiniz,isim aramak için 3'ü seçiniz,soyad için 4'ü seçiniz");
			System.out.println("Secim yapiniz (1 - 2 - 3 - 4)");
			secim=giris.nextInt();

			switch (secim) {
			case 1 :
				bl.ListedeAra(2002);
			    break;

			case 2 :
			    bl.ListedeAra1(123435);
			    break;

			case 3 :
			    bl.ListedeAra2("Ahmmet");
			    break;

			default :
			    bl.ListedeAra3("Çoban");
			    break;
}
		    }
}

