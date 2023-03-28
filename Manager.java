/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;
public class Manager extends Employee {
    int bonuslem;
    int bonuslembu;
    @Override
    public void nameP(){
//        mngr.name="Jeman";
        System.out.println("Nama        :"+name);
    }
    public void statusP(){
//        mngr.status="Belum Menikah";
        System.out.println("Status      :"+status);
    }
    public void nipP(){
//        mngr.NIP=127;
        System.out.println("NIP         :"+NIP);
    }
    public void waktukerjaP(){
//        mngr.waktuKerja=10;
        System.out.println("Waktu Kerja :"+waktuKerja+" Jam");
    }
    public void bonusP(){
//        mngr.bonus=5000000;
        bonuslem=250000;
        System.out.println("Bonus       :"+bonus+"\nDitambah bonus kerja lembur: "+bonuslem);
        bonuslembu=bonus+bonuslem;
        System.out.println("Total bonus yang didapat: "+bonuslembu);
    }
    public void gajiP(){
//        mngr.gaji=3000000;
        System.out.println("Gaji Sebenarnya      :"+gaji);
        int o=gaji+bonuslembu;
        System.out.println("Gaji setelah ditambah bonus: "+o);
    }
    
}
