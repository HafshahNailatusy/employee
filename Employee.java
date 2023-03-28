/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;
public class Employee {
    int NIP;
    String name;
    String status;
    int gaji=3000000;
    int bonus;
    int potongan;
    int waktuKerja;
    int money;
  
    public void nameP(){
        System.out.println("Nama Pekerja");
    }
    public void statusP(){
        System.out.println("Status Pekerja");
    }
    public void nipP(){
        System.out.println("Nomor Identitas Pegawai");
//        return 0;
    }
    public void waktukerjaP(){
        System.out.println("Waktu Kerja Pekerja");
        
    }
    public void gajiP(){
        System.out.println("Gaji Pekerja");
//        return 0;
    }
    public void bonusP(){
        System.out.println("Bonus");
        System.out.println("Sudah Menikah: 10000000 \nBelum Menikah: 5000000");
    }
    public void potonganP(){
        System.out.println("Potongan");
    }
}
