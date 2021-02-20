package pattern1;
;

import java.util.ArrayList;
import java.util.List;

public class Sonda {
    public static void main(String[] args) {

        List<Features> order = new ArrayList<>();

        //order.add(new Sity());
        order.add(new Sivic());
        order.add(new ABS(new Sivic()));
        order.add(new MusicSystem(new ABS(new Airbag(new Sunroof(new Sivic())))));
        order.add(new Sity());
        order.add(new Sunroof(new Sity()));
        order.add(new MusicSystem(new ABS(new Airbag(new Sunroof(new Sity())))));

        int total = 0;
        for( Features feature: order){
            System.out.println(feature.getDescription() + " = " + feature.cost() + " TL " );
            total += feature.cost();
        }

        System.out.println("Total: " + total + " TL");
    }
}
