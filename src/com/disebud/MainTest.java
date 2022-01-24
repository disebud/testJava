package com.disebud;
import java.util.Scanner;


public class MainTest {

    public static void main(String[] args) {

        // membuat scanner inputan
        Scanner inputan  = new Scanner(System.in);

        FindTest findTest = new FindTest();
        int jlhLantai, noLoker;

        // Tampilkan output ke user
        System.out.println("### Mencari Letak Nomor Loker di Nomor Lantai Berapa.");
        System.out.print("Masukkan No Loker yang dicari : ");
        noLoker = inputan.nextInt();

        findTest.findFloor(noLoker);

    }


}
