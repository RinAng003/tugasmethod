public class T07Method {
    //Method sumFraction() untuk menghitung penjumlahan kedua pecahan
    static void sumFraction(int e1, int d1, int e2, int d2){
        //Hasil penjumlahan disimpan ke variabel es dan ds
        int es, ds;
        es = (e1 * d2 + e2 * d1);
        ds = (d1 * d2);
        //Untuk mencetak hasil keluaran penjumlahan buatlah method printFraction()
        printFraction(es,ds);
    }

    //Method producFraction() untuk menghitung perkalian kedua pecahan
    static void printFraction(int e1, int d1, int e2, int d2){
        //Hasil perkalian disimpan ke variabel ep dan dp
        int ep, dp;
        ep = (e1 * e2);
        dp = (d1 * d2);
        //Untuk mencetak hasil keluaran perkalian buatlah method printFraction()
        printFraction(ep, dp);
    }

        //Method untuk menemukan fob agar bisa menyederhanakan pecahan
        static int fpb(int a, int b){
            if(b == 0){ //jika b = 0, maka nilai a yang akan menjadi fpb-nya
                return a;
            } else{
                return fpb(b, a % b);
            }
        }
    
        //Method untuk mencetak hasil
        static void printFraction(int ex, int dx){
            //int faktor adalah integer untuk nilai fpb sehingga bisa menyederhanakan pecahan
            int faktor = fpb(ex, dx);
    
            //coding menyederhanakan pecahan
            ex = ex / faktor;
            dx = dx / faktor;
    
            //menampilkan hasil akhir pecahan
            if (ex == dx || dx == 1) {
                int ey = ex / dx;
                System.out.println(ey);
            }else{
                System.out.println(ex+" / "+dx);
            }
       }
    

    //Method printFraction() untuk mencetak keluaran hasil penjumlahan ataupun perkalian
    public static void main(String[] args){
        sumFraction(1, 2, 2, 3); //memanggil testcape (1 / 2 + 2 / 3)
        sumFraction(1, 3, 3, 4); //memanggil testcape (1 / 3 + 3 / 4)
        printFraction(1, 2, 2, 3); //memanggil testcape (1 / 2 * 2 / 3)
        printFraction(1, 4, 2, 3); //memanggil testcape (1 / 4 * 2 / 3)
    }
}