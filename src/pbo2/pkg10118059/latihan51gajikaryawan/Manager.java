/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118059.latihan51gajikaryawan;

/**
 *
 * @author 
 * Nama : Muhammad Rakha Firdaus
 * NIM : 10118059
 * Kelas : IF-2
 */
public class Manager extends Karyawan{
    private int kehadiran;
    private float tunjanganGolongan, tunjanganJabatan, tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }

    public float tunjanganKehadiran(int hadir){
        return hadir*10000;
    }
    
    public float tunjaganJabatan(String jabatan){
        if(jabatan.equals("Manager")){
            tunjanganJabatan = 2000000;
        } else if (jabatan.equals("Kabag")){
            tunjanganJabatan = 1000000;
        } else {
            tunjanganJabatan = 0;
        }
        return tunjanganJabatan;
    }
    
    public float tunjanganGolongan(int golongan){
        if (golongan == 1){
            tunjanganGolongan = 5000000;
        } else if (golongan == 2){
            tunjanganGolongan = 1000000;
        } else if (golongan == 3){
            tunjanganGolongan = 1500000;
        } else {
            tunjanganGolongan = 0;
        }
        
        return tunjanganGolongan;
    }
    
    public float gajiTotal(){
        return tunjanganJabatan + tunjanganGolongan + tunjanganKehadiran(getKehadiran());
    }

    
    
    
}
