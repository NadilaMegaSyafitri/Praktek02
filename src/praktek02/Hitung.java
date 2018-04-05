package praktek02;
public class Hitung {
    double p;
    double l;

    public Hitung() {
        p=7;
        l=5;
    }

    public Hitung(double p, double l) {
        this.p = p;
        this.l = l;
    }
    
    
    
    void cetakInfo (){
        System.out.println("|-|-|-|-|-|-|-|-|-|-|");
        System.out.println("panjang  : "+p);
        System.out.println("lebar  : "+l);
        System.out.println("|-|-|-|-|-|-|-|-|-|-|");
    }
    
    double hitungLuas(){
        double luas;
        luas=p*l;
        return luas;
    }
    
    void cetakLuas(){
        System.out.println("Luasnya adalah = "+hitungLuas());
    }
}
