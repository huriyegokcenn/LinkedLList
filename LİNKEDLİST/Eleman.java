package LinkedLListYeni;

public class Eleman {
	public int tckn;
	public int dt;
	public 	String ad;
	public String soyad;
	Eleman ileri;
	public Eleman(int tckn,int dt,String ad,String soyad ) {
		this.tckn=tckn;
		this.ad=ad;
		this.dt=dt;
		this.soyad=soyad;
		this.ileri=null;
		
	}
}
