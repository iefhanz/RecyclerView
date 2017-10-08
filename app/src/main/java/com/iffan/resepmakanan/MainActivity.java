package com.iffan.resepmakanan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    private List<Listitem> listitems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=(RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listitems = new ArrayList<>();
        Listitem listitem1=new Listitem("Tahu Gimbal","Bahan-bahan\t\n" +
                "Secukupnya lontong, potong\n" +
                "Secukupnya sambel kacang/ pecel\n" +
                "Secukupnya timun\n" +
                "1 buah tahu putih ukuran sedang\n" +
                "1 butir telur\n" +
                "1/2 sdt bawang merah,bawang putih haluskan\n" +
                "Garam\n" +
                "Daun sop, daun bawang, bawang goreng (optional)\n" +
                "Langkah\t\n" +
                "Potong2 tahu ukuran dadu, goreng sebentar hingga permukaan kekuningan. Agkat, sisihkan\n" +
                "Kocok telur bersama bawang halus dan garam, campurkan tahu. Goreng seperti telur dadar\n" +
                "Cairkan bumbu kacang dengan air, siram sebagian diatas lontong,\n" +
                "Letakkan tahu telur di atas lontong yang sudah disiram bumbu kacang\n" +
                "Tambahkan timun diatasnya, tuangkan sisa bumbu kacang\n" +
                "Taburi dengan daun sop, daun bawang dan bawang goreng",R.drawable.nasigorengsosis);

        Listitem listitem2=new Listitem("Nasi Kuning","Bahan-bahan\t\n" +
                "4 porsi\n" +
                "100 gram beras\n" +
                "75 ml santan cair\n" +
                "3 siung bawang putih\n" +
                "2 siung bawang merah\n" +
                "1 ruas kunyit tua\n" +
                "2 lembar daun salam\n" +
                "1 batang serai (memarkan)\n" +
                "secukupnya Garam dan penyedap rasa\n" +
                "Air (sesuai masak nasi biasa aja)\n" +
                "Langkah\t\n" +
                "15 menit\n" +
                "Cuci bersih beras, daun salam, serai lalu masukkan ke dalam panci magicom\n" +
                "Haluskan bawang merah, bawang putih. Parut kunyit dan saring. Masukkan bumbu halus kedalam panci beras tadi.\n" +
                "\n" +
                "Tambahkan santan, garam, penyedap rasa dan air yg ke dalam panci magicom. Lalu aduk hingga rata dan masak sampai matang sekitar 10 - 15 menit. Nasi kuning mudah dan praktis siap disajikan \uD83D\uDE0B\uD83D\uDC4Ckeep it simple and easy, piko ☺️☺️",R.drawable.makanan);

        Listitem listitem3=new Listitem("Ayam Goreng","Bahan-bahan\t\n" +
                "1 ekor ayam (potong 12pc)\n" +
                "3 sdm tepung sachet ayam goreng (aku pakai tepung putri)\n" +
                "4 sdm tepung terigu\n" +
                "1 sdm maizena (sdm muncung)\n" +
                "1 sdt garam\n" +
                "1 sdt bubuk bawang putih\n" +
                "1/2 sdt lada\n" +
                "Langkah\t\n" +
                "Cuci ayam sampai bersih,tiriskan lgs masukan smua bumbu\n" +
                "Diaduk2 dipencet2 sampai semua menyatu.. jika bumbu terasa kurang tebal tambahkan lg smua bahannya tapi takerannya 1/2 aja\n" +
                "Biarkan 5-10 menit saja.. lalu goreng dgn minyak panas dan banyak.\n" +
                "Simple dan cepat kan\uD83D\uDE04.. sajikan bu\uD83D\uDE19\uD83D\uDE19",R.drawable.ayamgoreng);

        Listitem listitem4=new Listitem("Sukiyaki","Bahan-bahan\t\n" +
                "3-4 porsi\n" +
                "1 bungkus frozen suki\n" +
                "1 buah wortel (iris kecil)\n" +
                "1 ikat pokcoy\n" +
                "1 bungkus jamur enoki\n" +
                "1 buah brokoli (potong kecil dan rendam dengan air garam)\n" +
                "1 liter air\n" +
                "2 siung bawang putih (geprek dan iris halus)\n" +
                "2 buah bawang daun (iris)\n" +
                "2 kotak maggi blok\n" +
                "3 sdm saus tiram\n" +
                "2 sdm kecap asin\n" +
                "2 sdm gula\n" +
                "secukupnya garam\n" +
                "secukupnya merica bubuk\n" +
                "secukupnya minyak wijen atau minyak goreng\n" +
                "Langkah\t\n" +
                "Cuci bersih seluruh bahan dan tiriskan. Potong-potong sayuran sesuai selera.\n" +
                "Panaskan wajan dengan minyak secukupnya. Tumis irisan bawang putih hingga harum.\n" +
                "Masukkan air putih dan wortel. Tambahkan maggi blok, saus tiram, kecap asin, gula, garam, dan merica. Rebus hingga mendidih dan koreksi rasa sesuai selera.\n" +
                "Ada 2 cara penyajian: a). Kuah dan bahan suki dipisahkan. Bahan suki baru direbus ketika akan dimakan. b). Bahan suki dan sayuran yang lebih lunak dimasukkan langsung ke dalam kuah.\n" +
                "Tips: Brokoli dan bahan utama suki dapat dimasukan bersamaan. Jangan rebus brokoli terlalu lama karena akan menghilangkan gizinya. Jika menggunakan crabstick, sebaiknya dimasukkan 1 menit sebelum dimatikan karena crabstick cepat sekali matang. Sedangkan jamur enoki dapat dimasukkan segera setelah api dimatikan.\n" +
                "\n" +
                "Sajikan selagi hangat. Oiya, karena saya suka pedas, biasanya saya tambahkan irisan cabe rawit. Selamat menikmati :)",R.drawable.sukiyaki);

        Listitem listitem5=new Listitem("Jamur Krispi","Bahan-bahan\t\n" +
                "100 gr jamur tiram\n" +
                "1 butir telor\n" +
                "secukupnya Tepung bumbu krispi (saya pake kobe)\n" +
                "Minyak untuk menggoreng\n" +
                "Langkah\t\n" +
                "Cuci bersih jamur kemudian peras airnya\n" +
                "Kocok lepas telur, masukan jamur.\n" +
                "Guling jamur pada tepung kering.\n" +
                "Goreng jamur sampai kuning keemasan.\n" +
                "\n" +
                "Angkat dan jamur krispi siap dihidangkan.",R.drawable.jamur);

        Listitem listitem6=new Listitem("Nasi Rawon","Bahan-bahan\t\n" +
                "300 gr daging sapi bagian kisi, potong dadu, rebus sampai empuk\n" +
                "2 saset bumbu rawon indofood\n" +
                "5 butir telur asin matang\n" +
                "1 ons kerupuk udang\n" +
                "10 cabe rawit\n" +
                "3 biji bawang putih\n" +
                "2 buah jeruk nipis\n" +
                "3 biji bawang merah, iris tipis, goreng kering\n" +
                "2 batang daun bawang, potong pendek2\n" +
                "2 lt air\n" +
                "2 helai daun salam\n" +
                "2 keping lengkuas, keprek\n" +
                "1 batang serai, keprek\n" +
                "Langkah\t\n" +
                "Siapkan daging yg sdh empuk beserta kaldu tersisa 2lt, tmbhkan serai salam lengkuas berikut bumbu rawon indofood...didihkan sampe bumbu meresap dan wangi rempah\n" +
                "Teman rawon: Siapkan kerupuk, telur bebek asin, daun bawang, bawang goreng, jeruk nipis, toge segar, sambal dlm wadah terpisah\n" +
                "Sambal: goreng cabe rawit dan bawang putih, tumbuk ckp halus\n" +
                "Sajikan bersama nasi dan kuah rawon panas lengkap dgn teman2nya..\n",R.drawable.rawon);

        listitems.add(listitem1);
        listitems.add(listitem2);
        listitems.add(listitem3);
        listitems.add(listitem4);
        listitems.add(listitem5);
        listitems.add(listitem6);


        adapter=new MyAdapter(listitems,this);
        recyclerView.setAdapter(adapter);

    }
}
