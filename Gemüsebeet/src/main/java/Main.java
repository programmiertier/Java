import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        BeetM meinBeet = new BeetM();
        List<Moehre> moehr = new ArrayList<Moehre>();
        moehr.add(new Moehre());
        moehr.add(new Moehre());
        moehr.add(new Moehre());
        moehr.add(new Moehre());
        moehr.add(new Moehre());
        moehr.add(new Moehre());
        meinBeet.aussaehen(moehr);
        String result = meinBeet.bewirtschaften();
        System.out.println(result);

        for (Moehre m : meinBeet.ernten()) {
            System.out.println(m);
        }

        BeetK meinzweitesBeet = new BeetK();
        List<Kohlrabi> kohl = new ArrayList<Kohlrabi>();
        kohl.add(new Kohlrabi());
        kohl.add(new Kohlrabi());
        kohl.add(new Kohlrabi());
        kohl.add(new Kohlrabi());
        kohl.add(new Kohlrabi());
        kohl.add(new Kohlrabi());
        meinzweitesBeet.aussaehen(kohl);
        result = meinzweitesBeet.bewirtschaften();
        System.out.println(result);
        ;

        for (Kohlrabi k : meinzweitesBeet.ernten()
                ) {
            System.out.println(k);

        }
    }
}
