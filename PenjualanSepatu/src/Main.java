import java.util.Scanner;

class tokosepatu {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("Selamat Datang Di Toko Sepatu Kami");
            System.out.println("1. Login sebagai Admin");
            System.out.println("2. Login sebagai Customer");
            System.out.print("\npilih: ");
            int n = input.nextInt();
            switch (n) {
                case 1:
                    loginuser in = new loginuser();

                    in.data = 1;
                    System.out.println("---------");
                    System.out.println("| Login |");
                    System.out.println("---------");
                    System.out.print("\nUsername: ");
                    String a = input.nextLine();
                    in.setUsername(a);
                    System.out.println(in.getUsername());
                    System.out.print("Password: ");
                    String b = input.nextLine();
                    in.setPassword(b);
                    System.out.println(in.getPassword());
                    in.cek();

                    admin ad = new admin();

                    System.out.print("\nId Admin: ");
                    ad.id_admin = input.nextInt();
                    System.out.print("Nama: ");
                    ad.Nama = input.nextLine();
                    System.out.print("Alamat: ");
                    ad.Alamat = input.nextLine();
                    break;
                case 2:
                    loginuser log = new loginuser();

                    log.data = 2;
                    System.out.println("---------");
                    System.out.println("| Login |");
                    System.out.println("---------");
                    System.out.print("\nUsername: ");
                    String x = input.nextLine();
                    log.setUsername(x);
                    System.out.println(log.getUsername());
                    System.out.print("Password: ");
                    String y = input.nextLine();
                    log.setPassword(y);
                    System.out.println(log.getPassword());
                    log.cek();

                    customer cus = new customer();

                    System.out.print("\nNama: ");
                    cus.Nama = input.nextLine();
                    System.out.print("Alamat: ");
                    cus.Alamat = input.nextLine();
                    System.out.print("Email: ");
                    cus.email = input.nextLine();
                    System.out.println("\n-------------------------------------------");
                    System.out.println("| kode |  Nama Sepatu  | Ukuran |  Harga  |");
                    System.out.println("-------------------------------------------");
                    System.out.println("|   1  |  Adidas       | 41     | 630.000 |");
                    System.out.println("|   2  |  Nike         | 40     | 640.000 |");
                    System.out.println("|   3  |  Converse     | 39     | 549.000 |");
                    System.out.println("|   4  |  Vans         | 42     | 560.000 |");
                    System.out.println("-------------------------------------------");
                    System.out.print("Masukkan kode sepatu: ");
                    cus.kodesepatu = input.nextInt();
                    cus.pilihSepatu();

            }
        }
    }