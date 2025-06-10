package hitung;


public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika syifa = new Matematika(2,6);
        
        System.out.println("Hasil penjumlahan: "+syifa.setPenjumlahan());
        System.out.println("Hasil pengurangan: "+syifa.setPengurangan());
        System.out.println("Hasil perkalian: "+syifa.setPerkalian());
        System.out.println("Hasil pembagian: "+syifa.setPembagian());
    }
}
