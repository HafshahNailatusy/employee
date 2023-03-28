/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;
public class CleaningService extends Employee {
  
    public void nameP(){
//        cs.name="Uwoo";
        System.out.println("Nama        :"+name);
    }
    public void nipP(){
//        cs.NIP=721127;
        System.out.println("NIP         :"+NIP);
    }
    public void statusP(){
//        cs.status="Belum Menikah";
        System.out.println("Status      :"+status);
    }
    public void waktukerjaP(){
//        cs.waktuKerja=6;
        System.out.println("Waktu Kerja :"+waktuKerja+" Jam");
    }
    public void bonusP(){
//        cs.bonus=5000000;
        System.out.println("Bonus       :"+bonus);
    }
    public void potonganP(){
//        cs.potongan=250000;
        System.out.println("Potongan    :"+potongan);
    }
    public void gajiP(){
//        cs.gaji=3000000;
        System.out.println("Gaji sebenarnya: "+gaji);
        int y=gaji+bonus;
        int e=y-potongan;
        System.out.println("Gaji setelah ditambah bonus dan mendapat potongan: "+e);
    }
    
}
