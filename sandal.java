// Class Sandal sebagai representasi objek sandal
class Sandal {
    private String merek;
    private int ukuran;
    private double harga;

    // Konstruktor untuk menginisialisasi objek Sandal
    public Sandal(String merek, int ukuran, double harga) {
        this.merek = merek;
        this.ukuran = ukuran;
        this.harga = harga;
    }

    // Metode untuk mendapatkan informasi merek sandal
    public String getMerek() {
        return merek;
    }

    // Metode untuk mendapatkan informasi ukuran sandal
    public int getUkuran() {
        return ukuran;
    }

    // Metode untuk mendapatkan informasi harga sandal
    public double getHarga() {
        return harga;
    }

    // Metode untuk menampilkan informasi sandal
    public void tampilkanInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Harga: $" + harga);
        System.out.println("-----------------------------");
    }
}

// Class TokoSandal untuk mengelola inventaris sandal
class TokoSandal {
    private Sandal[] inventaris;
    private int jumlahSandal;

    // Konstruktor untuk menginisialisasi objek TokoSandal
    public TokoSandal() {
        inventaris = new Sandal[100];
        jumlahSandal = 0;
    }

    // Metode untuk menambahkan sandal ke inventaris toko
    public void tambahSandal(Sandal sandal) {
        if (jumlahSandal < inventaris.length) {
            inventaris[jumlahSandal] = sandal;
            jumlahSandal++;
            System.out.println("Sandal berhasil ditambahkan ke inventaris toko.");
        } else {
            System.out.println("Inventaris toko sudah penuh.");
        }
    }

    // Metode untuk mencetak informasi semua sandal dalam inventaris toko
    public void cetakInventaris() {
        System.out.println("Inventaris Toko Sandal:");
        for (int i = 0; i < jumlahSandal; i++) {
            inventaris[i].tampilkanInfo();
        }
    }
}

// Class utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek toko sandal
        TokoSandal tokoSandal = new TokoSandal();

        // Membuat beberapa objek sandal
        Sandal sandal1 = new Sandal("Nike", 42, 100.0);
        Sandal sandal2 = new Sandal("Adidas", 39, 80.0);
        Sandal sandal3 = new Sandal("Puma", 38, 90.0);

        // Menambahkan sandal ke inventaris toko sandal
        tokoSandal.tambahSandal(sandal1);
        tokoSandal.tambahSandal(sandal2);
        tokoSandal.tambahSandal(sandal3);

        // Mencetak informasi semua sandal dalam inventaris toko sandal
        tokoSandal.cetakInventaris();
    }
}
