/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import modelo.Persona;

/**
 *
 * @author marna.salazar
 */
public class Ejemplomap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        HashMap<Integer, Persona> map1 = new HashMap<>();
        LinkedHashMap<Integer, Persona> map2 = new LinkedHashMap<>();
        TreeMap<Integer,Persona> map3 = new TreeMap<>();
        
        map1.put(3, new Persona("Majo", "1130", 31));
        map1.put(2, new Persona("Lina", "1131", 300));
        map1.put(36, new Persona("Lola", "1132", 300));
        map1.put(6, new Persona("Paola", "1133", 300));
        
        map2.put(3, new Persona("Majo", "1130", 31));
        map2.put(2, new Persona("Lina", "1131", 300));
        map2.put(36, new Persona("Lina", "1131", 300));
        map2.put(6, new Persona("Lina", "1131", 300));
        
        map3.put(3, new Persona("Majo", "1130", 31));
        map3.put(2, new Persona("Lina", "1131", 300));
        map3.put(36, new Persona("Lina", "1131", 300));
        map3.put(6, new Persona("Lina", "1131", 300));
        
        String m1 = mostrar(map1);
        String m2 = mostrar(map2);
        String m3 = mostrar(map3);
        
        System.out.println(m1);
        System.out.println("____________");
        System.out.println(m2);
        System.out.println("______________");
        System.out.println(m3);
        System.out.println("____________");
        
    }
    
    //Resivo un map con esa key y ese valor 
    public static String mostrar(Map<Integer,Persona> m)
    {
        String mostrar ="";
        
        //iterador para obtener los datos que estan dentro del map y poder obtner el key y el valor
        Iterator<Map.Entry<Integer,Persona>> it = m.entrySet().iterator();
        
        // el hasnext para comprobar que siguen quedando elementos en el iterador
        while (it.hasNext())
        {
            Map.Entry<Integer,Persona> pair = it.next();
            mostrar+= pair.getKey() + " " + pair.getValue() + "\n";
        }
        
        return mostrar;
    }


    
    
    
}
