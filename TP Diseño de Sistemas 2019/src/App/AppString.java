package App; 

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AppString {

    private static final DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public static void main(String[] args) {

        Date date = new Date();
        String fechaactual = sdf.format(date);
        
        String anioactual= fechaactual.substring(0, 4);
        int anio = Integer.parseInt(anioactual);
        int anio18=anio-18;
        int anio30=anio-30;
        String aniostring18 = String.valueOf(anio18);
        String aniostring30 = String.valueOf(anio30);
        
        String fecha18 = aniostring18.concat(fechaactual.substring(4,10));
        String fecha30 = aniostring30.concat(fechaactual.substring(4,10));
        
        System.out.println(fecha18+" "+fecha30);
        
        String fecha = "1998-05-18";
        
        System.out.println(fecha.compareTo(fecha18)+" "+fecha.compareTo(fecha30));
        
        
        
    }

}
