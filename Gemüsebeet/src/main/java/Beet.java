import java.util.List;
import java.util.Random;

public class Beet {

    private List<Moehre> moehren;
    private static Random rnd = new Random();
    public Beet() { moehren = new List<Moehre>(); }

    public void aussaehen(String params, Moehre... zeug)
    {
       foreach (Moehre varagr m in zeug)
        {
            moehren.add();
        }
    }

    public static Random getRnd() {
        return rnd;
    }

    public static void setRnd(Random rnd) {
        Beet.rnd = rnd;
    }

    public List<Moehre> getMoehren() {
        return moehren;
    }

    public void setMoehren(List<Moehre> moehren) {
        this.moehren = moehren;
    }
}
