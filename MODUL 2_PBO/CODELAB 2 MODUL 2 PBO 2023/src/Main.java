import java.util.Scanner;

public class Main {

    public static void main (String [] args)

    {
        int pilihan;
        long nimMahasiswa = 0;
        String namaMahasiswa = null, jurusanMahasiswa = null;

        Scanner dataNamaMahasiswa = new Scanner (System.in);
        Scanner dataNimMahasiswa = new Scanner (System.in);
        Scanner dataJurusanMahasiswa = new Scanner (System.in);

        do
        {
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Keluar");

            System.out.print("Pilihan Anda: ");
            Scanner menuPilihan = new Scanner (System.in);
            pilihan = menuPilihan.nextInt();


            switch (pilihan)
            {
                case 1:

                    System.out.print("Masukkan Nama Mahasiswa: ");
                    namaMahasiswa = dataNamaMahasiswa.nextLine();

                    System.out.print("Masukkan NIM Mahasiswa: ");
                    nimMahasiswa = dataNimMahasiswa.nextLong();
                    dataNimMahasiswa.nextLine();

                    if (String.valueOf(nimMahasiswa).length() != 15)
                    {

                        System.out.println("NIM Harus 15 Digit!");

                    }

                    System.out.print("Masukkan Jurusan Mahasiswa: ");
                    jurusanMahasiswa = dataJurusanMahasiswa.nextLine();
                    break;

                case 2:
                    System.out.println("Data Mahasiswa: ");
                    if (namaMahasiswa == null || nimMahasiswa == 0 || jurusanMahasiswa == null) {
                        System.out.println("Data Mahasiswa Belum Ditambahkan!");
                    }
                    else {
                        System.out.println("Nama: " + namaMahasiswa);
                        System.out.println("NIM: " + nimMahasiswa);
                        System.out.println("Jurusan: " + jurusanMahasiswa);
                    }
                    break;
                case 3:
                    System.out.println("Done!");
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid!");
                    break;
            }
        }while (pilihan != 3);

    }
}