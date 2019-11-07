/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118059.latihan51gajikaryawan;
import java.util.Scanner;
/**
 *
 * @author 
 * Nama : Muhammad Rakha Firdaus
 * NIM : 10118059
 * Kelas : IF-2
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Manager manager = new Manager();
        Karyawan karyawan = new Karyawan();
        
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK : ");
        karyawan.setNik(input.next());
        System.out.print("Masukkan Nama : ");
        karyawan.setNama(input.next());
        System.out.print("Masukkan Golongan (1/2/3) : ");
        karyawan.setGolongan(input.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        karyawan.setJabatan(input.next());
        System.out.print("Masukkan Jumlah Kehadiran : ");
        manager.setKehadiran(input.nextInt());
        
        System.out.println("");
        
        System.out.println("====Hasil Perhitungan====");
        System.out.println("NIK      : " + karyawan.getNik());
        System.out.println("NAMA     : " + karyawan.getNama());
        System.out.println("GOLONGAN : " + karyawan.getGolongan());
        System.out.println("JABATAN  : " + karyawan.getJabatan());
        
        System.out.println("");
        
        System.out.println("TUNJANGAN GOLONGAN  : Rp. " + manager.tunjanganGolongan(karyawan.getGolongan()));
        System.out.println("TUNJANGAN JABATAN   : RP. " + manager.tunjaganJabatan(karyawan.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN : Rp. " + manager.tunjanganKehadiran(manager.getKehadiran()));
        
        System.out.println("");
        
        System.out.println("GAJI TOTAL : Rp. " + manager.gajiTotal());
        
    }
    
}
