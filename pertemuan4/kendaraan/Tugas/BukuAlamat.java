package Tugas;

import java.util.*;

public class BukuAlamat {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        boolean status = true;
        int n = 0;
        
        ArrayList<EntryBukuAlamat> list = new ArrayList<>();
        EntryBukuAlamat dataDefault = new EntryBukuAlamat();
        
        dataDefault.setNama("Fauzan");
        dataDefault.setAlamat("Antapani");
        dataDefault.setTelp("088970601825");
        dataDefault.setEmail("zand55");
        
        list.add(dataDefault);   

        System.out.println("=====================================");
        System.out.println("=== Selamat Datang di Buku Alamat ===");
        System.out.println("=====================================");
        System.out.println("1. Lihat \n2. Tambah \n3. Sunting \n4. Hapus\n5. Keluar");

        while (status) {            
            System.out.print("\nPilihan anda (1 - 5) : ");
            n = input.nextInt();

            switch (n) {
                case 1:
                    System.out.println("\nLihat Semua Data");
                    if (list.size() == 0) {
                        System.out.println("Data Kosong");
                    } else {
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("No  Nama \t Alamat \t Telp \t\t Email");
                        System.out.println("---------------------------------------------------------------------");
                        for (int i = 0; i < list.size(); i++) {
                            EntryBukuAlamat a = list.get(i);
                            System.out.print((i + 1) + "  ");
                            a.showAll();
                        }
                    }
                    break;
                case 2: 
                    EntryBukuAlamat entry = new EntryBukuAlamat();
                    System.out.println("\nTambah Data");
                    System.out.print("Nama : ");
                    entry.setNama(input.next());
                    
                    System.out.print("Alamat : ");
                    entry.setAlamat(input.next());
                    
                    System.out.print("No. Tlp : ");
                    entry.setTelp(input.next());
                    
                    System.out.print("Email : ");
                    entry.setEmail(input.next());
                    list.add(entry);
                    break;
                case 3: 
                    EntryBukuAlamat edit = new EntryBukuAlamat();
                    
                    System.out.println("\nEdit Data");
                    if (list.size() == 0) {
                        System.out.println("Data Kosong");
                    } else {
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("No  Nama \t Alamat \t Telp \t\t Email");
                        System.out.println("---------------------------------------------------------------------");
                        for (int i = 0; i < list.size(); i++) {
                            EntryBukuAlamat a = list.get(i);
                            System.out.print((i + 1) + "  ");
                            a.showAll();
                        }
                        System.out.print("Pilih data yang ingin diubah : ");
                        n = input.nextInt();
                        EntryBukuAlamat b = list.get(n-1);
                        System.out.print("Nama : ");
                        b.setNama(input.next());

                        System.out.print("Alamat : ");
                        b.setAlamat(input.next());

                        System.out.print("No. Tlp : ");
                        b.setTelp(input.next());

                        System.out.print("Email : ");
                        b.setEmail(input.next());
//                        list.add(b);
                        System.out.println("Anda mengubah data ke-" +n+ "!!!");
                    }
                    break;
                case 4: 
                    EntryBukuAlamat hapus = new EntryBukuAlamat();
                    System.out.println("\nHapus Data");
                    if (list.size() == 0) {
                        System.out.println("Data Kosong");
                    } else {
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("No  Nama \t Alamat \t Telp \t\t Email");
                        System.out.println("---------------------------------------------------------------------");
                        for (int i = 0; i < list.size(); i++) {
                            EntryBukuAlamat a = list.get(i);
                            System.out.print((i + 1) + "  ");
                            a.showAll();
                        }
                        System.out.print("Pilih nomor yang ingin dihapus : ");
                        n = input.nextInt();
                        list.remove(n-1);
                        System.out.println("Anda menghapus data ke-" +n+ "!!!");
                    }
                    break;
                case 5:
                    status = false;
                    break;
                default:
                    System.out.println("Gagal");
                    break;
            }
        }
    }
}
