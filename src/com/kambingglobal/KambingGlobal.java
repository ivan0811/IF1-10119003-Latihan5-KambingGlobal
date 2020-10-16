package com.kambingglobal;

/*
	NAMA = Ivan Faathirza
	KELAS = IF1
	NIM = 10119003
	Deskripsi program = program ini untuk mengakses dan mengubah variabel instance melalui method
	lalu menampilkan ke layar
 */

public class KambingGlobal {
    int jumlahKambing = 88;

    public void getJumlahKambing(){
        System.out.println("Jumlah kambing: "+jumlahKambing);
    }

    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambahkan: "+jumlahKambing);
    }

    public static void main(String[] args) {
        KambingGlobal kambingSusu = new KambingGlobal();

        //Menampilkan jumlah kambing yang ada saat program pertama x perjalan
        kambingSusu.tambahKambing();

        kambingSusu.getJumlahKambing();
    }
}
