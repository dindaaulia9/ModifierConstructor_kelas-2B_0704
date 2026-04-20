import Base.Produk;

public class Main {
    public static void main(String[] args) {
        Produk produk = new Produk("Indomie", 3000, 200);

        System.out.println(produk.getNama());
        System.out.println(produk.getHarga());
        System.out.println(produk.getStok());

        produk.setHarga(3500);
        produk.setStok(100);

        System.out.println(produk.getNama());
        System.out.println(produk.getHarga());
        System.out.println(produk.getStok());
        

    }
    
}
