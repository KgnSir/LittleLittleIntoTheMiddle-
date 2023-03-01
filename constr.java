public class constr{
    String ad;
    String soyad;
    int yas;
    String goz_rengi;
    double boy;
    int dyili;

    public constr(String ad, String soyad, int yas, String goz_rengi, double boy, int dyili) 
    {

        this.ad=ad;
        this.soyad=soyad;
        this.yas=yas;
        this.goz_rengi=gozrengi;
        this.boy=boy;
        this.dyili=dyili;
    }
    public int getDyili(){
        return dyili;
    }

public static void main(String[] args){
Person kaan = new constr("kaan süren", "süren", 22, "siyah", 1.90, 2002);
System.out.println(kaan.ad +" "+ kaan.soyad + " in yaşı= "+kaan.yas + " göz rengi= "+.goz_rengi+
" boyu= "+kaan.boy +" doğum yılı= "+kaan.dyili);
}

}