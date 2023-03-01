import java.util.Random;
public class average {
	
	
		public static double aritmetik_ortalama(int a , double b) {
			double c = b/a;
			return c;
		}
		
		
		public static double geometrik_ortalama(double d) {
			double e = Math.sqrt(d) ;
			return e;
		}
		
		public static double harmonik_ortalama(int f , double g) {
			double x = f/g;
			return x;
		}
	    public static void main(String[] args){

	        int sayi_1, sayi_2;
	        double toplam=0, carpim=1, harmonik_toplam=0;
	        
	        sayi_1=(int) (Math.random()*16+10);

	        for (int i=0;i<sayi_1;i++)
	        {
	        sayi_2=(int) (Math.random()*100+1);
	        toplam+=sayi_2;
	        carpim*=sayi_2;
	        harmonik_toplam+=1.0/sayi_2;
	        }
	        
	        System.out.println("Aritmetik Ortalama="+ aritmetik_ortalama(sayi_1 , toplam));
	
	        System.out.println("Geometrik Ortalama="+geometrik_ortalama(carpim));
	        System.out.println("Harmonik Ortalama="+harmonik_ortalama(sayi_1 , harmonik_toplam));
	        
	    }
	    
	}


