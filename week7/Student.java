import java.util.Scanner;

class Person {
    protected String name;
    protected String address;
    protected String hobby;

    public void identity() {
        System.out.println("Nama: " + name);
        System.out.println("Alamat: " + address);
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void displayHobby() {
        System.out.println("Hobi: " + hobby);
    }
}

public class Student extends Person {
    private String nim;
    private double spp;
    private double sks;
    private double modul;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setSpp(double spp) {
        this.spp = spp;
    }

    public void setSks(double sks) {
        this.sks = sks;
    }

    public void setModul(double modul) {
        this.modul = modul;
    }

    public double hitungPembayaran() {
        return spp + sks + modul;
    }
}

class InheritMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student mahasiswa = new Student();

        // Input nilai name
        System.out.print("Masukkan Nama: ");
        mahasiswa.name = scanner.nextLine();

        // Input nilai address
        System.out.print("Masukkan Alamat: ");
        mahasiswa.address = scanner.nextLine();

        // Input nilai hobby
        System.out.print("Masukkan Hobi: ");
        mahasiswa.setHobby(scanner.nextLine());

        // Input nilai nim
        System.out.print("Masukkan NIM: ");
        mahasiswa.setNim(scanner.nextLine());

        // Input nilai SPP
        System.out.print("Masukkan Biaya SPP: ");
        mahasiswa.setSpp(scanner.nextDouble());

        // Input nilai SKS
        System.out.print("Masukkan Biaya SKS: ");
        mahasiswa.setSks(scanner.nextDouble());

        // Input nilai Modul
        System.out.print("Masukkan Biaya Modul: ");
        mahasiswa.setModul(scanner.nextDouble());

        scanner.close();

        // Pemanggilan method dari superclass
        mahasiswa.identity();

        // Tampilkan hobi
        mahasiswa.displayHobby();

        // Hitung pembayaran dan tampilkan
        double totalPembayaran = mahasiswa.hitungPembayaran();
        System.out.println("Total Pembayaran: " + totalPembayaran);
    }
}
