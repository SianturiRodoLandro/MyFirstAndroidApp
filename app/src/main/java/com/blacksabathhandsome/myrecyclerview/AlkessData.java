package com.blacksabathhandsome.myrecyclerview;

import java.util.ArrayList;

public class AlkessData {
    public static String[][] data = new String[][]{
            {"Steteskop", "Alat kesehatan yang tidak asing bagi kita, karena sering digunakan oleh para dokter maupun perawat untuk memeriksa pasien. Stetoskop adalah alat kesehatan akustik yang berfungsi untuk memeriksa suara dalam tubuh. Stetoskop sering digunakan untuk mendengar suara detak jantung, dan juga suara organ-organ tubuh lainnya, seperti organ pernapasan, organ pencernaan bahkan suara detak jantung janin dalam kandungan.", "https://jurnalmanajemen.com/wp-content/uploads/2019/03/alkes-stetoskop.jpg"},
            {"Jarum Suntik", "Alat suntik (spuit) adalah alat yang berbentuk  pompa piston sederhana yang berfungsi untuk menyuntikkan cairan / gas ke dalam tubuh pasien. Selain itu alat suntik juga berfungsi menghisap cairan / gas dari dalam tubuh untuk diambil sampelnya guna keperluan uji laborat. Ukuran dan macamnya bervariasi tergantung penggunaannya. Biasanya alat kesehatan ini satu paket dengan jarum suntik.", "https://jurnalmanajemen.com/wp-content/uploads/2019/03/alkes-suntikan.jpg"},
            {"Termometer", "Termometer adalah alat kesehatan yang berfungsi untuk mengukur suhu tubuh. Jenis termometer yang paling banyak digunakan saat ini adalah termometer digital, digunakan karena bisa menunjukkan hasil lebih cepat dan akurat, juga mudah didapatkan di apotek, toko obat, atau toko alat kesehatan.", "https://jurnalmanajemen.com/wp-content/uploads/2019/03/alkes-termometer.jpg"},
            {"Tensimeter Manual", "Tensimeter adalah alat kesehatan yang digunakan oleh tim medis untuk mengukur tekanan darah pasiennya. Dalam istilah medis dikenal juga dengan nama sphygmomanometer.", "https://jurnalmanajemen.com/wp-content/uploads/2019/03/alkes-tensimeter-manual.jpg"},
            {"Alat Infus", "Alat infus atau infus set adalah alat kesehatan yang berfungsi untuk memasukkan cairan infus atau obat ke dalam tubuh pasien lewat pembuluh darah vena, dengan kecepatan yang bisa diatur secara konstan dalam waktu tertentu, infus set ini termasuk alat kesehatan disposable atau sekali pakai langsung dibuang.", "https://jurnalmanajemen.com/wp-content/uploads/2019/03/alkes-alat-infus.jpg"},
            {"Kruk (Alat Bantu Jalan)", "Kruk adalah alat bantu jalan yang berfungsi untuk menopang keseimbangan dan mengurangi beban berat badan saat berjalan pada pasien. Digunakan terutama oleh orang yang mengalami cedera kaki, patah tulang di kaki, kelemahan kaki atau cacat kaki bawaan lahir. Cara penggunaannya dengan dipegang dengan tangan dan ujungnya disandarkan pada ketiak, sehingga sering disebut juga dengan nama kruk ketiak. Kruk dapat digunakan satu atau berpasangan (kanan kiri) sesuai kebutuhan untuk mengatur keseimbangan badan. Bahan untuk membuat kruk bisa dari kayu atau logam yang ringan.", "https://jurnalmanajemen.com/wp-content/uploads/2019/03/alkes-kruk.jpg"},
            {"Kursi Roda", "Kursi roda merupakan alat bantu yang digunakan oleh orang yang mengalami kesulitan berjalan, baik dikarenakan kondisi sakit, usia lanjut, cedera, maupun cacat bawaan lahir. Atau keadaan orang tersebut memang sangat lemah atau benar-benar sudah tidak mampu untuk berjalan lagi, maka kursi roda digunakan sebagai alat bantu jalan.", "https://jurnalmanajemen.com/wp-content/uploads/2019/03/alkes-kursi-roda.jpg"},
            {"Patient Monitor", "Patient monitor adalah alat kesehatan yang berfungsi untuk memonitor kondisi kesehatan pasien secara langsung atau realtime, sehingga dapat diketahui kondisi fisiologis dan tanda vital pasien saat itu juga. Data fisiologis pasien ditampilkan pada layar monitor berupa LCD atau CRT secara terus menerus. Parameter yang dimonitor antara lain detak jantung, tekanan darah, irama nafas dan jantung, kadar oksigen dalam darah, suhu tubuh, grafik EKG dan sebagainya.", "https://jurnalmanajemen.com/wp-content/uploads/2019/03/alkes-pasien-monitor.jpg"},
            {"Blood Warmer", "Blood warmer atau alat penghangat darah adalah alat kesehatan yang berfungsi untuk menghangatkan atau memanaskan darah hingga mencapai suhu yang sesuai dengan suhu internal manusia sebelum dilakukan transfuse, untuk mencegah hiportemia. Penyimpanan darah biasanya dalam lemari pendingin, sehingga perlu dihangatkan terlebih dahulu saat transfusi. Sistem termostat dalam blood warmer berfungsi untuk menjaga kestabilan suhu darah.", "https://jurnalmanajemen.com/wp-content/uploads/2019/03/alat-medis-blood-warmer.jpg"},
            {"Fetal Monitor", "Fetal monitor atau biasa disebut dengan cardiotocography (CTG) adalah alat kesehatan yang berfungsi untuk mamantau kondisi janin dalam kandungan, dengan mengukur detak jantung janin dan kontraksi rahim. Dibandingkan dengan fetal doppler, alat ini bekerja lebih detail, karena bisa menganalisa dan menampilkan hasil detak jantung janin dan kontraksi rahim dalam bentuk grafik di monitor. Pemeriksaan CTG biasanya dilakukan pada saat menjelang persalinan, sehingga dapat menentukan kemungkinan tindakan yang perlu dilakukan untuk memudahkan persalinan.", "https://jurnalmanajemen.com/wp-content/uploads/2019/03/alat-medis-fetal-monitor.jpg"},
    };

    public static ArrayList<Alkes> getListData(){
        ArrayList<Alkes> list = new ArrayList<>();
        for (String[] aData : data) {
            Alkes alkes = new Alkes();
            alkes.setName(aData[0]);
            alkes.setFrom(aData[1]);
            alkes.setPhoto(aData[2]);
            list.add(alkes);
        }
        return list;
    }
}
