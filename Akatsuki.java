/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117048.latihan60.akatsuki;

/**
 *
 * @author
 * Nama : Arrijal Tanzil Maulana
 * NIM : 23215037
 * Kelas : TI
 * Deskripsi Program : Program ini berisi tentang karakter akatsuki
 *                     dari serial anime naruto
 */
public class Akatsuki {

    protected String pakaian;
    protected String tujuan;

    public Akatsuki(String pakaian, String tujuan) {
        this.pakaian = pakaian;
        this.tujuan = tujuan;
    }

    public String getpakaian() {
        return pakaian;
    }

    public String gettujuan() {
        return tujuan;
    }

}
