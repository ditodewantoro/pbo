package week1;

public class menghitung {

	public static void main(String[] args) {
		// Menghitung keliling lingkaran
        double diameterLingkaran = 10;
        double jariJari = diameterLingkaran / 2;
        double kelilingLingkaran = Math.PI * diameterLingkaran;
        System.out.println("Keliling lingkaran dengan diameter 10 adalah: " + kelilingLingkaran);

        // Menghitung luas segitiga siku-siku
        double alasSegitiga = 6;
        double tinggiSegitiga = 8;
        double luasSegitiga = (alasSegitiga * tinggiSegitiga) / 2;
        System.out.println("Luas segitiga siku-siku dengan alas 6 dan tinggi 8 adalah: " + luasSegitiga);

        // Menghitung volume tabung
        double diameterTabung = 5;
        double tinggiTabung = 10;
        double jariJariTabung = diameterTabung / 2;
        double volumeTabung = Math.PI * Math.pow(jariJariTabung, 2) * tinggiTabung;
        System.out.println("Volume tabung dengan diameter 5 dan tinggi 10 adalah: " + volumeTabung);

	}

}
