/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_pbo1;

/**
 *
 * @author Najwa
 
 */
import java.util.Scanner;
public class  TUGAS_PBO1 {
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    int departemen, pengalaman, skill; 
    int bonus = 0; 
    int tip = 0; 
    int upah = 0;
    int gajitotal;
    String namaKaryawan,alamat;
    
    System.out.print("\tMasukkan Nama: ");
    namaKaryawan=input.next();
    
    System.out.print("\tMasukkan Alamat Anda: ");
    alamat=input.next();
    
    System.out.print("\t1.IT ");
    System.out.print("2. HRD ");
    System.out.print("3. Finance ");
    System.out.print("\n\tMasukkan Departemen karyawan : ");
    departemen=input.nextInt();
    
    System.out.print("\t1.Pemula ");
    System.out.print("2. Menengah ");
    System.out.print("3. expert ");
    System.out.print("\n\tMasukkan pengalaman karyawan: ");
    pengalaman=input.nextInt();
    
    System.out.print("\t1.Web ");
    System.out.print("2. Mobile ");
    System.out.print("3. Desktop ");
    System.out.print("\n\tMasukkan skill yang dimiliki karyawan: ");
    skill=input.nextInt();
    
    switch(departemen){
        case 1 : //IT
            bonus = 8000000;
            break;
        case 2 : //HRD
            bonus = 5000000;
            break;
        case 3 : //Finance
            bonus = 4000000;
            break;
    }
    
    switch (pengalaman){
        case 1 : //pemula
            tip = 500000;
            break;
        case 2 : //menengah
            tip = 1000000;
            break;
        case 3 : //expert
            tip = 2000000;
            break;
    }
    
    switch (skill){
        case 1 : //web
            upah = 1000000;
            break;
        case 2 : //mobile
            upah = 2000000;
            break;
        case 3 : //desktop
            upah = 2500000;
            break;
    }
    gajitotal = ((bonus + tip + upah));
    
    System.out.println("\n\t=============================\n");
    System.out.println("\t Nama Karyawan: "+namaKaryawan);
    System.out.println("\tAlamat Karyawan: "+alamat);
    System.out.println("\tGaji sesuai departemen: "+bonus);
    System.out.println("\tGaji sesuai pengalaman: "+tip);
    System.out.println("\tGaji sesuai skill: "+upah);
    System.out.println("\tGaji Bersih karyawan: "+gajitotal);
    }
    
}
