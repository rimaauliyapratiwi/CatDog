package simple.example.kocheng;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.kocheng.model.Anjing;
import simple.example.kocheng.model.Buah;
import simple.example.kocheng.model.Buah;
import simple.example.kocheng.model.Kucing;

public class DataProvider {
    private static List<Kucing> kucings = new ArrayList<>();
    private static List<Anjing> anjings = new ArrayList<>();
    private static List<Buah> buahs = new ArrayList<>();

    static void initDataKucing(Context ctx) {
        kucings.add(new Kucing("Angora", "Turki",
                "Aslinya berasal dari Ankara, Turki dengan ciri khas berbulu panjang dan lembut", R.drawable.c1));
        kucings.add(new Kucing("Bengal", "Inggris",
                "Merupakan hasil persilangan antara Kucing Leopard Asia dengan kucing domestik Inggris", R.drawable.anwar));
        kucings.add(new Kucing("Birmani", "Birma/Myanmar",
                "Konon awalnya merupakan ras kucing yand biasa menemani para biksu yang menetap pada kuil di Birma", R.drawable.c3));
        kucings.add(new Kucing("Persia", "Iran",
                "Kucing berbulu panjang dengan wajah bundar dan hidung pesek. Awalnya berasal dari Iran kemudian diimpor ke Italia", R.drawable.c4));
        kucings.add(new Kucing("Siam", "Thailand",
                "Kucing hasil turunan dari Wichian Maat (Kucing Thailand) dengan ciri khas berbadan panjang dan langsing, wajah lonjong, telinga lebar, dan mata kebiruan", R.drawable.c5));
        kucings.add(new Kucing("Siberia", "Rusia",
                "Kucing domestik Rusia dengan bulu lebat dan badan besar tapi sangat lincah dan terkenal dengan kemampuan melompatnya ", R.drawable.c6));
    }

    static void initDataAnjing(Context ctx) {
        anjings.add(new Anjing("Bulldog", "Inggris",
                "Anjing populer yang dikenal dengan badan yang gemuk berotot, wajah seperti kain kusut, dan hidung yang pesek", R.drawable.b4));
        anjings.add(new Anjing("Husky", "Alaska,Siberia,Finlandia (daerah bersalju) ",
                "Anjing jenis khusus yang awalnya digunakan untuk menarik kereta salju", R.drawable.b2));
        anjings.add(new Anjing("Kintamani", "Indonesia",
                "Ras anjing asli pulau Bali ", R.drawable.b3));
        anjings.add(new Anjing("Samoyed", "Rusia",
                "Anjing yang berasal dari Siberia yang awalnya biasa digunakan untuk menjaga ternak oleh suku Samoyed", R.drawable.b4));
        anjings.add(new Anjing("Shepherd", "Jerman",
                "Anjing pintar dan kuat, sekarang banyak digunakan sebagai anjing penjaga, pengawal, dan anjing polisi (K9)", R.drawable.b5));
        anjings.add(new Anjing("Shiba", "Jepang",
                "Anjing dari daerah Shiba ini gesit dan lincah sehingga awalnya banyak digunakan untuk berburu ", R.drawable.b6));
    }

    static void initDataBuaya(Context ctx) {
        buahs.add(new Buah("jeruk, ","Asia Tenggara",
                "Jeruk atau limau adalah semua tumbuhan berbunga anggota marga Citrus dari suku Rutaceae. Anggotanya berbentuk pohon dengan buah yang berdaging dengan rasa masam yang segar, meskipun banyak di antara anggotanya yang memiliki rasa manis.", R.drawable.a2));
        buahs.add(new Buah("Semangka", "Afrika",
                "Semangka adalah tanaman merambat yang berasal dari daerah setengah gurun di Afrika bagian selatan. Tanaman ini masih sekerabat dengan labu-labuan, melon dan ketimun.", R.drawable.a4));
        buahs.add(new Buah("Melon", "Lembah Panas Persia atau daerah Mediterania ",
                " Melon (Cucumis meloL.) merupakan nama buah sekaligus tanaman yang menghasilkannya yang termasuk dalam suku labu-labuan atau Cucurbitaceae. Buahnya biasanya dimakan segar sebagai buah meja atau diiris-iris sebagai campuran es buah. ", R.drawable.a3));
        buahs.add(new Buah("Pisang", "Asia Tenggara",
                "Pisang adalah nama umum yang diberikan pada tumbuhan terna berukuran besar dengan daun memanjang dan besar yang tumbuh langsung dari bagian tangkai.", R.drawable.a1));
    }

    public static List<Kucing> getAllKucings(Context ctx) {
        if (kucings.size() == 0) {
            initDataKucing(ctx);
        }
        return kucings;
    }

    public static List<Anjing> getAllAnjings(Context ctx) {
        if (anjings.size() == 0) {
            initDataAnjing(ctx);
        }
        return anjings;
    }


    public static List<Buah> getAllBuayas(Context ctx) {
        if (buahs.size() == 0) {
            initDataBuaya(ctx);
        }
        return buahs;
    }
}

