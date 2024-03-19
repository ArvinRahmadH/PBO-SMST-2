import java.util.Scanner;

public class Main {

    public static class studentvariabel {

        public static String[][] daftarBuku = {
                {"0", "Buku Indonesia", "author", "388c-e681-9152", "10"},
                {"1", "Buku Jepang", "author", "ed90-be305cdb", "5"},
                {"2", "Buku Inggris", "author", "d95e-0c4a-9523", "20"},
        };

        public static int inputstudent;
        public static int exit;
        public static int inputbuku;

        public static void Student() {
            Scanner input = new Scanner(System.in);
            System.out.println(" ");
            System.out.println("===student menu===");
            System.out.println("1. daftar buku");
            System.out.println("2. pinjam buku");
            System.out.println("3. buku yang dipinjam");
            System.out.println("4. exit");
            System.out.print("pilih 1 - 4 = ");
            inputstudent = input.nextInt();

            switch (inputstudent) {
                case 1:
                    System.out.println("======================================================================================================");
                    System.out.printf("%-10s | %-20s | %-20s | %-15s | %-10s |%n", "Nomor ", "Judul", "Author", "ID Buku", "Stok");
                    System.out.println("======================================================================================================");
                    System.out.printf("| %-10s | %-20s | %-20s | %-15s | %-10s |%n", "0", "Buku Indonesia", "author", "388c-e681-9152", "10 ");
                    System.out.printf("| %-10s | %-20s | %-20s | %-15s | %-10s |%n", "1", "Buku Jepang", "author", "ed90-be305cdb", "5 ");
                    System.out.printf("| %-10s | %-20s | %-20s | %-15s | %-10s |%n", "2", "Buku Inggris", "author", "d95e-0c4a-9523", "20 ");
                    System.out.println("=======================================================================================================");
                    System.out.print("klik 99 jika ingin keluar = ");
                    exit = input.next().charAt(0);
                    if (exit == 99) {
                        System.out.println("keluar ");
                    }
                    break;

                case 2:
                    System.out.println("======================================================================================================");
                    System.out.printf("%-10s | %-20s | %-20s | %-15s | %-10s |%n", "Nomor ", "Judul", "Author", "ID Buku", "Stok");
                    System.out.println("======================================================================================================");
                    System.out.printf("| %-10s | %-20s | %-20s | %-15s | %-10s |%n", "0", "Buku Indonesia", "author", "388c-e681-9152", "10 ");
                    System.out.printf("| %-10s | %-20s | %-20s | %-15s | %-10s |%n", "1", "Buku Jepang", "author", "ed90-be305cdb", "5 ");
                    System.out.printf("| %-10s | %-20s | %-20s | %-15s | %-10s |%n", "2", "Buku Inggris", "author", "d95e-0c4a-9523", "20 ");
                    System.out.println("=======================================================================================================");
                    System.out.print("Pilih NOMOR buku yang dipinjam = ");
                    inputbuku = input.nextInt();
                    if (inputbuku >= 0 && inputbuku < daftarBuku.length) {
                        System.out.println("Buku = " + daftarBuku[inputbuku][1] + " berhasil dipinjam");
                    } else {
                        System.out.println("pilihan tidak falid");
                    }
                    break;

                case 3:
                    System.out.println(" buku yang dipinjam =  (No buku : " + inputbuku + ")");
            }
        }
    }


    public static class adminvariabel {
        public static String addstudent = null;
        public static String addnim = null;
        public static String jurusan = null;

        public static void Admin() {
            Scanner input = new Scanner(System.in);

            System.out.println("===admin menu===");
            System.out.println("1. add student");
            System.out.println("2. display student");
            System.out.println("3. exit ");
            System.out.print("pilih 1 - 3 = ");
            int inputAdmin = input.nextInt();
            switch (inputAdmin) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    addstudent = input.next();

                    do {
                        System.out.print("Masukkan NIM Mahasiswa (15 digit): ");
                        addnim = input.next();
                        if (addnim.length() != 15) {
                            System.out.println("NIM Harus 15 Digit!");
                        }
                    } while (addnim.length() != 15);

                    input.nextLine();

                    System.out.print("Masukkan Jurusan Mahasiswa: ");
                    jurusan = input.nextLine();

                    System.out.println("Data Mahasiswa Berhasil Ditambahkan!");
                    break;

                case 2:
                    if (addstudent == null || addnim == null || jurusan == null) {
                        System.out.println("Data Mahasiswa Belum Ditambahkan!");
                    } else {
                        System.out.println("=================================");
                        System.out.println("Data Mahasiswa: ");
                        System.out.println("Nama Siswa: " + addstudent);
                        System.out.println("NIM Siswa: " + addnim);
                        System.out.println("Fakultas Siswa: " + jurusan);
                        System.out.println("=================================");
                    }
                    break;
                case 3:
                    System.out.println("keluar ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(" ");
            System.out.println("===library sistem===");
            System.out.println("1. login as student");
            System.out.println("2. login as admin");
            System.out.println("3. exit");
            System.out.print("pilih 1-3 = ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    Scanner input = new Scanner(System.in);
                    System.out.print("Enter your Nim= ");
                    String inputnim = input.next();

                    if (inputnim.equals("1234567890")) {
                        System.out.println("Successful login as student👌");
                    } else {
                        System.out.println("User not found");
                        break;
                    }
                    studentvariabel.Student();
                    break;

                case 2:
                    adminvariabel.Admin();
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan program.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih angka 1-5.");
            }
        }
    }
}
