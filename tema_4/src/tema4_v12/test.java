package tema4_v12;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import tema4_v12.modules.cursos.classes.Singleton;
import tema4_v12.modules.cursos.classes.Desarrollo_web;

public class test {

    public static void main(String[] args) {
    	Singleton.array_desarrollo = new ArrayList<Desarrollo_web>();

    	Singleton.array_desarrollo.add(new Desarrollo_web("auto"));
    	Singleton.array_desarrollo.add(new Desarrollo_web("manual"));

    	String[] manual_auto = new String[Singleton.array_desarrollo.size()];

        for (int i = 0; i < Singleton.array_desarrollo.size(); i++) {
            Desarrollo_web obj = Singleton.array_desarrollo.get(i);
            manual_auto[i] = String.valueOf(obj.get_ID_course()); 
        } // end for
    }
}


