package diebiene;

import java.util.Arrays;
import java.util.List;

public class Wiese {
    public Wiese() {
        Biene[] bienen = new Biene[10];

        bienen[0] = new Biene(1, 15, egeschlecht.weiblich);
        bienen[1] = new Biene(2, 10, egeschlecht.maennlich);
        bienen[2] = new Biene(6, 25, egeschlecht.weiblich);

        List<Biene> bienenListe = Arrays.asList(bienen);


        for (int zaehl = 0; zaehl < bienen.length; zaehl++)
        {
            System.out.println(bienen[zaehl]);
        }
    }
}
