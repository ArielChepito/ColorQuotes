package ariel.sv.com.colorquotes;

import java.util.Random;

/**
 * Created by Ariel on 16/6/2017.
 */

public class Utils {
    public static int generarNuevosAleatorios(int max){
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());
        return random.nextInt(max);
    }
}
