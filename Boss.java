/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;
public class Boss extends Employee {
//    String name;
    @Override
    public void nameP(){
        System.out.println("Nama       : "+name);
    }
//    public void nameP(String a, int b){
//        System.out.println("Nama       : "+name);
//    }
    public void statusP(){
        System.out.println("Status     : "+status);
    }
    public void waktukerjaP(){
        System.out.println("Waktu Kerja: "+waktuKerja+" Jam");
    }
    public void bonusP(){
        System.out.println("Bonus: "+bonus);
    }
    @Override
    public void gajiP(){
        System.out.println("Gaji sebenarnya: "+gaji);
        int w=gaji+bonus;
        System.out.println("Gaji setelah ditambah bonus: "+w);
    }
    
    
    
}
