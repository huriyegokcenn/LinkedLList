package LinkedLListYeni;

public class LinkedList {
	Eleman bas;
	Eleman son;
	LinkedList(){
		bas=null;
		son=null;
	}
	void BasaElemanEkle(Eleman yeni) {
		if(bas==null) {
			bas=yeni;
			son=yeni;
		}else {
			yeni.ileri=bas;
			bas=yeni;
		}
	}
	 
    void ListeYazdir() {
    	Eleman tmp;
    	tmp=bas;
    	while(tmp.ileri!=null) {
    		System.out.println("Kişinin adı:"  + tmp.ad +"  " + "Kişinin soyadı:" + tmp.soyad+ "  " + "Kişinin TCKN:"+tmp.tckn+"  "+"Kişinin Doğum Tarihi:"+tmp.dt);
    		tmp=tmp.ileri;
    	while(tmp.ileri==null) {
    		System.out.println("Kişinin adı:"  + tmp.ad +"  " + "Kişinin soyadı:" + tmp.soyad+ "  " + "Kişinin TCKN:"+tmp.tckn+"  "+"Kişinin Doğum Tarihi:"+tmp.dt);
    	    return;
    	}
    	
    }
    }
    
    void BastanSil(Eleman yeni) {
    	if (bas==null) {
    		System.out.println("Liste Boş Silinecek Eleman Bulunamadı.");
    	}else {
    		bas=bas.ileri;
    	}
    }
    
    void SonaElemanEkle(Eleman yeni) {
    	if(bas==null) {
    		bas=yeni;
    		son=yeni;
    	}else {
    		son.ileri=yeni;
    		son=yeni;
    	}
    }
    
    void SondanSil() {
    	Eleman sondanbiröncekieleman =bas;
    	Eleman tmp = sondanbiröncekieleman;
    	if(bas!=null) {
    		while(tmp.ileri!=son) {
    			tmp=tmp.ileri;
    		}
    	son=tmp;
    	tmp.ileri=null;
    		
    	}
    }
    
    int Elemansayısı() {
    	Eleman tmp = bas;
    	lenght();
        int sayac=0;
        if(bas!=null) {
        	while (tmp!=null) {
        		tmp=tmp.ileri;
        		sayac++;
        	}
        }
		System.out.println("LİSTEDEKİ ELAMAN SAYISI:" +sayac);
		return sayac;
		
    }
    
	public void lenght() {
	}
	void ArayaElemanEkle(Eleman yeni, int sayi) {
		if(bas==null) {                             //LİSTE BOŞSA
			System.out.println("LİSTE BOŞ OLDUĞU İÇİN ARAYA ELEMAN EKLENEMEDİ BAŞA EKLENDİ");
			BasaElemanEkle(yeni);
		}else {                        //LİSTE DOLUYSA
			Eleman tmp = bas;
	    	lenght();
	        int sayac=0;
	        if(bas!=null) {
	        	while (tmp!=null) {
	        		tmp=tmp.ileri;
	        		sayac++;
	        	}
	        }
			if(sayac<sayi) {
				System.out.println("LİSTE SINIRI SAYIDAN LISA O YÜZDEN SONA EKLENDİ");
				SonaElemanEkle(yeni);
			}else {                             //TAM ARAYA EKLEME KISMI
				Eleman tmp1=bas;
				int sayac1=1;
				while(sayac1<sayi) {
					sayac1++;
					tmp1=tmp1.ileri;     //İLERLEME
				} //SONRASSINA EKLENECEK ELEMAN BULUNDU
				yeni.ileri=tmp1.ileri;
				tmp1.ileri=yeni;
				
			}
		
		}
	}
     LinkedList ListedeAra(int dogumtarihi) {
		if(bas==null) { 
			System.out.println("LİSTE BOŞ SORGULAMA YAPILAMAZ");
		}else {
			Eleman tmp=bas;
			int sayac=0;
			while(tmp!=null) {
				if(tmp.dt==dogumtarihi) {
					System.out.println("ARANAN DOĞUM TARİHİ" +" "+ tmp.ad+" "+tmp.soyad+" "+tmp.dt+" "+tmp.tckn+"  "+" KİŞİSİNDE BULUNUR"); //BİRDEN FAZA KİŞİ OLURSA NE YAPARIZZ SONRA UĞRAŞ?
					sayac++;
				}
				tmp=tmp.ileri;
			}
			if(sayac==0) {;
				System.out.println("LİSTEDE BÖYLE BİR ELEMAN YOK");
			}
		}
		return null;
		
		}
     LinkedList ListedeAra1(int tckimlik) {
 		if(bas==null) { 
 			System.out.println("LİSTE BOŞ SORGULAMA YAPILAMAZ");
 		}else {
 			Eleman tmp=bas;
 			int sayac=0;
 			while(tmp!=null) {
 				if(tmp.tckn==tckimlik) {
 					System.out.println("ARANAN TC NUMARASI" +" "+ tmp.ad+" "+tmp.soyad+" "+tmp.dt+" "+tmp.tckn+"  "+" KİŞİSİNDE BULUNUR"); //BİRDEN FAZA KİŞİ OLURSA NE YAPARIZZ SONRA UĞRAŞ?
 					sayac++;
 				}
 				tmp=tmp.ileri;
 			}
 			if(sayac==0) {;
 				System.out.println("LİSTEDE BÖYLE BİR ELEMAN YOK");
 			}
 		}
 		return null;
 		
 		}
     LinkedList ListedeAra2(String adı) {
  		if(bas==null) { 
  			System.out.println("LİSTE BOŞ SORGULAMA YAPILAMAZ");
  		}else {
  			Eleman tmp=bas;
  			int sayac=0;
  			while(tmp!=null) {
  				if(tmp.ad==adı) {
  					System.out.println("ARANAN İSİM" +" "+ tmp.ad+" "+tmp.soyad+" "+tmp.dt+" "+tmp.tckn+"  "+" KİŞİSİNDE BULUNUR"); //BİRDEN FAZA KİŞİ OLURSA NE YAPARIZZ SONRA UĞRAŞ?
  					sayac++;
  				}
  				tmp=tmp.ileri;
  			}
  			if(sayac==0) {;
  				System.out.println("LİSTEDE BÖYLE BİR ELEMAN YOK");
  			}
  		}
  		return null;
  		
  		}
     LinkedList ListedeAra3(String soyadı) {
   		if(bas==null) { 
   			System.out.println("LİSTE BOŞ SORGULAMA YAPILAMAZ");
   		}else {
   			Eleman tmp=bas;
   			int sayac=0;
   			while(tmp!=null) {
   				if(tmp.soyad==soyadı) {
   					System.out.println("ARANAN SOYAD" +" "+ tmp.ad+" "+tmp.soyad+" "+tmp.dt+" "+tmp.tckn+"  "+" KİŞİSİNDE BULUNUR"); //BİRDEN FAZA KİŞİ OLURSA NE YAPARIZZ SONRA UĞRAŞ?
   					sayac++;
   				}
   				tmp=tmp.ileri;
   			}
   			if(sayac==0) {;
   				System.out.println("LİSTEDE BÖYLE BİR ELEMAN YOK");
   			}
   		}
   		return null;
   		
   		}
  	
			
}
	
	

