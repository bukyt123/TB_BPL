import java.sql.SQLException;
import java.util.Scanner;
public class menu {
	private static String anotherString;
	static User user = new User();
	
	static void menu1 () throws SQLException {
		Scanner sc = new Scanner (System.in);
		Scanner sc2 = new Scanner (System.in);
		boolean jalan=true;
		while (jalan==true) {
			System.out.println("\nDATA BARANG SUPERMARKET SI");
			System.out.println("+--------------------------+");
			System.out.println("| 1. Lihat Data Barang     |");
			System.out.println("| 2. Tambah Barang Baru    |");
			System.out.println("| 3. Edit Barang           |");
			System.out.println("| 4. Hapus Barang          |");
			System.out.println("| 5. Cari Barang           |");
			System.out.println("| 6. Re-Stock Barang       |");
			System.out.println("| 7. Menu Utama            |");
			System.out.println("| 8. Logout                |");
			System.out.println("+--------------------------+");
			System.out.print("Masukkan pilihan : ");
			int menu1 = sc.nextInt();
			switch (menu1) {
			case 1:
				db_barang.tampil();
				break;
			case 2:
				db_barang.tambah();	
				break;
			case 3:
				db_barang.edit();
				break;
			case 4:
				db_barang.hapus();
				break;
			case 5:
				db_barang.cari();
				break;
			case 6:
				db_barang.tbstock();
				break;
			case 7:
				user.user_menu();
				break;
			case 8:
				user.logout();
				break;
			default :
			}
			System.out.print("Apakah anda ingin melanjutkan? [y/n]  ");
			String next = sc2.nextLine();
			String lanjut = "y";
			jalan = next.equalsIgnoreCase(lanjut);
			if (jalan==false) {
				user.user_menu();
			}
		}
	}
	
	static void menu2 () throws SQLException {
		Scanner sc = new Scanner (System.in);
		Scanner sc2 = new Scanner (System.in);
		boolean jalan=true;
		while (jalan==true) {
			System.out.println("\n LAPORAN SUPERMARKET SI");
			System.out.println("+--------------------------+");
			System.out.println("| 1. Laporan Penjualan     |");
			System.out.println("| 2. Laporan Keuntungan    |");
			System.out.println("| 3. Menu Utama            |");
			System.out.println("| 4. Logout                |");
			System.out.println("+--------------------------+");
			System.out.print("Masukkan pilihan : ");
			int menu1 = sc.nextInt();
			switch (menu1) {
			case 1:
				db_transaksi.laporan_penjualan();
				break;
			case 2:
				db_transaksi.laporan_untung();
				break;
			case 3:
				user.user_menu();
				break;
			case 4:
				user.logout();
				break;
			default :
			}
			System.out.print("Apakah anda ingin melanjutkan? [y/n]  ");
			String next = sc2.nextLine();
			String lanjut = "y";
			jalan = next.equalsIgnoreCase(lanjut);
			if (jalan==false) {
				user.user_menu();
			}
		}
	}
	

}

