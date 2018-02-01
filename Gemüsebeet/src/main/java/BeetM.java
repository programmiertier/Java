import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class BeetM extends Beet {

    private List<Moehre> moehre;
    private static Random rnd = new Random();

    public BeetM() {
        moehre = new ArrayList<>();
    }

    public void aussaehen(List<Moehre> zeug) {

        for (Moehre m :
                zeug) {
            moehre.add(m);
        }
    }

    public String bewirtschaften() {
        int zufall = rnd.nextInt(2);
        switch (zufall) {
            case 0:
                for (Moehre m : moehre) {
                    m.vernichtenFeind();
                }
                return "Alles vernichtet!";

            case 1:
                for (Moehre m : moehre) {
                    m.bewässern();
                }
                return "Alles bewässert!";
        }
        return "blubb";
    }

    public List<Moehre> ernten() {
        // jede reife Moehre wird geerntet
        List<Moehre> kannWeg = new ArrayList<Moehre>();
        kannWeg = moehre.stream().filter(m -> m.isReif).collect(Collectors.<Moehre>toList());
        moehre.removeAll(kannWeg);
        return kannWeg;
    }
}
