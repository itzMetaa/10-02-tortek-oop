package tortoop;

import java.util.Random;

public class TortOOP {

    static Random r = new Random();
    public static void main(String[] args) {
        Tort t = new Tort(r.nextInt(100)+1,r.nextInt(100)+1);
        Tort t2 = new Tort(r.nextInt(100)+1,r.nextInt(100)+1);
        System.out.println(t);
        //t.kiir();
        t.legegyszerubbAlak();
        //t.kiir();
        System.out.println(t);
        //System.out.println(t.lnko(12,8));
    }
    
}
