/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;
public class mainEmployee  {
    public static void main(String[] args) {
        Employee emye=new Employee(); 
        Boss boss=new Boss();
        
//        boss.nameP();
//        boss.nameP("LOL",0);
        
        boss.name="Jamal";
        boss.status="Sudah Menikah";
        boss.waktuKerja=8;
        boss.bonus=10000000;
        boss.gaji=3000000+(3000000*80/100);
        
        Manager mngr=new Manager();
        mngr.name="Jeman";
        mngr.status="Belum Menikah";
        mngr.NIP=2345;
        mngr.waktuKerja=10;
        mngr.bonus=5000000;
        mngr.gaji=3000000+(3000000*40/100);
        
        CleaningService cs=new CleaningService();
        cs.name="Echan";
        cs.NIP=127;
        cs.status="Belum Menikah";
        cs.waktuKerja=6;
        cs.bonus=5000000;
        cs.potongan=250000;
        cs.gaji=3000000;
        
        System.out.println("=======BOSS=======");
        emye.nameP();
        boss.nameP();
        emye.statusP();
        boss.statusP();
        emye.waktukerjaP();
        boss.waktukerjaP();
        emye.bonusP();
        boss.bonusP();
        emye.gajiP();
        boss.gajiP();
        
        System.out.println(" ");
        System.out.println("=======MANAGER=======");
        emye.nameP();
        mngr.nameP();
        emye.nipP();
        mngr.nipP();
        emye.statusP();
        mngr.statusP();
        emye.waktukerjaP();
        mngr.waktukerjaP();
        emye.bonusP();
        mngr.bonusP();
        emye.gajiP();
        mngr.gajiP();
        
        System.out.println(" ");
        System.out.println("=======CLEANING SERVICE=======");
        emye.nameP();
        cs.nameP();
        emye.nipP();
        cs.nipP();
        emye.statusP();
        cs.statusP();
        emye.waktukerjaP();
        cs.waktukerjaP();
        emye.bonusP();
        cs.bonusP();
        emye.potonganP();
        cs.potonganP();
        emye.gajiP();
        cs.gajiP();
        
        
    }
    
}
