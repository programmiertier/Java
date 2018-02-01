import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class BeetK extends Beet {

    private List<Kohlrabi> kohlrabi;
    private static Random rnd = new Random();

    public BeetK() {
        kohlrabi = new ArrayList<>();
    }

    public void aussaehen(List<Kohlrabi> zeug) {

        for (Kohlrabi m :
                zeug) {
            kohlrabi.add(m);
        }
    }

    public String bewirtschaften() {
        int zufall = rnd.nextInt(2);
        switch (zufall) {
            case 0:
                for (Kohlrabi m : kohlrabi) {
                    m.vernichtenFeind();
                }
                return "Alles vernichtet!";

            case 1:
                for (Kohlrabi m : kohlrabi) {
                    m.bewässern();
                }
                return "Alles bewässert!";
        }
        return "blubb";
    }

    public List<Kohlrabi> ernten() {
        // jede reife Kohlrabi wird geerntet
        List<Kohlrabi> kannWeg = new ArrayList<Kohlrabi>();
        kannWeg = kohlrabi.stream().filter(m -> m.isReif).collect(Collectors.<Kohlrabi>toList());
        kohlrabi.removeAll(kannWeg);
        return kannWeg;
    }
}
