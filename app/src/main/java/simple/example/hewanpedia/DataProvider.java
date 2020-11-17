package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Anjing;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Ikan;
import simple.example.hewanpedia.model.Kucing;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing("Angora", "Turki",
                "Aslinya berasal dari Ankara, Turki dengan ciri khas berbulu panjang dan lembut", R.drawable.cat_angora));
        kucings.add(new Kucing("Bengal", "Inggris",
                "Merupakan hasil persilangan antara Kucing Leopard Asia dengan kucing domestik Inggris", R.drawable.cat_bengal));
        kucings.add(new Kucing("Birmani", "Birma/Myanmar",
                "Konon awalnya merupakan ras kucing yand biasa menemani para biksu yang menetap pada kuil di Birma", R.drawable.cat_birman));
        kucings.add(new Kucing("Persia", "Iran",
                "Kucing berbulu panjang dengan wajah bundar dan hidung pesek. Awalnya berasal dari Iran kemudian diimpor ke Italia", R.drawable.cat_persia));
        kucings.add(new Kucing("Siam", "Thailand",
                "Kucing hasil turunan dari Wichian Maat (Kucing Thailand) dengan ciri khas berbadan panjang dan langsing, wajah lonjong, telinga lebar, dan mata kebiruan", R.drawable.cat_siam));
        kucings.add(new Kucing("Siberia", "Rusia",
                "Kucing domestik Rusia dengan bulu lebat dan badan besar tapi sangat lincah dan terkenal dengan kemampuan melompatnya ", R.drawable.cat_siberian));
        return kucings;
    }

    private static List<Anjing> initDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing("Bulldog", "Inggris",
                "Anjing populer yang dikenal dengan badan yang gemuk berotot, wajah seperti kain kusut, dan hidung yang pesek", R.drawable.dog_bulldog));
        anjings.add(new Anjing("Husky", "Alaska,Siberia,Finlandia (daerah bersalju) ",
                "Anjing jenis khusus yang awalnya digunakan untuk menarik kereta salju", R.drawable.dog_husky));
        anjings.add(new Anjing("Kintamani", "Indonesia",
                "Ras anjing asli pulau Bali ", R.drawable.dog_kintamani));
        anjings.add(new Anjing("Samoyed", "Rusia",
                "Anjing yang berasal dari Siberia yang awalnya biasa digunakan untuk menjaga ternak oleh suku Samoyed", R.drawable.dog_samoyed));
        anjings.add(new Anjing("Shepherd", "Jerman",
                "Anjing pintar dan kuat, sekarang banyak digunakan sebagai anjing penjaga, pengawal, dan anjing polisi (K9)", R.drawable.dog_shepherd));
        anjings.add(new Anjing("Shiba", "Jepang",
                "Anjing dari daerah Shiba ini gesit dan lincah sehingga awalnya banyak digunakan untuk berburu ", R.drawable.dog_shiba));
        return anjings;
    }

    private static List<Ikan> intDataIkan(Context ctx) {
        List<Ikan> ikans = new ArrayList<>();
        ikans.add(new Ikan("Mas", "Cina",
                "Ikan ini banyak disukai masyarakat Indoonesia, selain karena kandungan proteinnya cukup tinggi rasa daging ikan Mas juga enak dan gurih bahkan pada beberapa daerah di Indonesia, ikan Mas kerap di sajikan dengan bumbu spesial dan menjadi masakan khas.", R.drawable.ikan_mas));
        ikans.add(new Ikan("Ikan Lele", "Afrika",
                "Lele merupakan ikan tanpa sisik yang dapat ditemukan di perairan tawar di dua benua, yaitu di Benua Afrika dan Asia. Ikan ini memiliki nama internasional sama dengan ikan patin dan baung, yaitu catfish.", R.drawable.ikan_lele));
        ikans.add(new Ikan("Nila", "Sungai Nil Uganda",
                "Ikan nila melakukan migrasi secara alami dari habitat aslinya di Sungai Nil di Uganda (bagian hulu Sungai Nil) ke arah selatan melewati Danau Raft dan Tanganyika hingga ke daerah Mesir sepanjang Sungai Nil.",R.drawable.ikan_nila));
        ikans.add(new Ikan("gurame" ,"malaysia",
                "Gurami merupakan ikan asli Indonesia, tepatnya berasal dari perairan daerah sunda ( Jawa Barat, Indonesia ). Kemudian ikan ini menyebar ke Malaysia, Thailand, Ceylon, dan Australia. Ikan berbentuk pipih lebar ini hidup di air tawar yang tidak mengalir.",R.drawable.ikan_gurame));
        ikans.add(new Ikan("Bawal","Hindia",
                "Ikan Bawal banyak terdapat di Lautan Hindia selain terdapat juga di Afrika, Malaysia dan Jepang. Ikan Bawal hidup dan berenang secara bergerombol. Bawal sering juga ditemukan beriringan dengan udang di dasar laut.",R.drawable.ikan_bawal));

        return ikans;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(intDataIkan(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
