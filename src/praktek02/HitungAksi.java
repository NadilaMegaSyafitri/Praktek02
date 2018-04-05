package praktek02;
public class HitungAksi {
    public static void main(String[] args) {
        Hitung r1 = new Hitung();
        r1.p = 10;
        r1.l = 6;
        
        r1.cetakInfo();
        System.out.println("Luas Rectangle = "+r1.hitungLuas());
        r1.cetakLuas();
        
        Hitung r2 = new Hitung();
        r2.cetakInfo();
        
        Hitung r3 = new Hitung (50,30);
        r3.cetakInfo();
    }
}
