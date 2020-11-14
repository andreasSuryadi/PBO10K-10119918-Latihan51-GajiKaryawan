/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan51gajikaryawan;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA      : Andreas Suryadi
 * KELAS     : IF-10K
 * NIM       : 10119918
 * Deskripsi Program : Program ini bertujuan untu penghitungan data gaji 
 * karyawan
 * 
 */

public class PBO10K10119918Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Manager manager = new Manager();
        
        String nik, nama, jabatan;
        int golongan, kehadiran;
        
        // Untuk Input data
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK : ");
        nik = scanner.nextLine();
        
        System.out.print("Masukkan Nama : ");
        nama = scanner.nextLine();
        
        System.out.print("Masukkan Golongan (1/2/3) : ");
        golongan = scanner.nextInt();
        
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        jabatan = scanner.next();
        
        System.out.print("Masukkan Jumlah Kehadiran : ");
        kehadiran = scanner.nextInt();
        
        manager.setNik(nik);
        manager.setNama(nama);
        manager.setGolongan(golongan);
        manager.setJabatan(jabatan);
        manager.setKehadiran(kehadiran);
        
        // Untuk menghitung gaji karyawan
        System.out.println("====Hasil Perhitungan====");
        System.out.println("NIK \t: " + manager.getNik());
        System.out.println("NAMA \t: " + manager.getNama());
        System.out.println("GOLONGAN: " + manager.getGolongan());
        System.out.println("JABATAN : " + manager.getJabatan());
        
        float tunjGolongan = manager.tunjanganGolongan(manager.getGolongan());
        float tunjJabatan = manager.tunjanganJabatan(manager.getJabatan());
        float tunjKehadiran = manager.tunjanganKehadiran(manager.getKehadiran());
        
        float gajiTotal = manager.gajiTotal();
        
        System.out.println("\nTUNJANGAN GOLONGAN \t : " + tunjGolongan);
        System.out.println("TUNJANGAN JABATAN \t : " + tunjJabatan);
        System.out.println("TUNJANGAN KEHADIRAN \t : " + tunjKehadiran);
        
        System.out.println("\nGAJI TOTAL \t : " + gajiTotal);
    }
    
}
