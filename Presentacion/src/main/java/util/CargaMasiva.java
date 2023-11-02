/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import dominio.CondicionVehiculo;
import dominio.Costos;
import dominio.Persona;
import dominio.TarifaLicencias;
import dominio.TarifaPlacas;
import dominio.VigenciaTarifaLicencia;
import fachada.Fachada;
import fachada.IFachada;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author HP
 */
public class CargaMasiva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IFachada fachada = new Fachada();

        //Agregar Personas
        List<Persona> personas = new LinkedList<>();

        Persona persona1 = new Persona("ABC123456", "Juan", "Perez", "Lopez", Calendar.getInstance(), false, "555-123-4567", "XYZ123456");
        personas.add(persona1);
        Persona persona2 = new Persona("DEF789012", "Maria", "Gonzalez", "Rodriguez", Calendar.getInstance(), true, "555-987-6543", "UVW789012");
        personas.add(persona2);
        Persona persona3 = new Persona("GHI345678", "Carlos", "Ramirez", "Diaz", Calendar.getInstance(), false, "555-234-5678", "RST345678");
        personas.add(persona3);
        Persona persona4 = new Persona("JKL901234", "Ana", "Martinez", "Gomez", Calendar.getInstance(), true, "555-876-5432", "OPQ901234");
        personas.add(persona4);
        Persona persona5 = new Persona("MNO567890", "Luis", "Fernandez", "Lopez", Calendar.getInstance(), false, "555-345-6789", "LMN567890");
        personas.add(persona5);
        Persona persona6 = new Persona("PQR123456", "Laura", "Gutierrez", "Hernandez", Calendar.getInstance(), true, "555-678-9012", "IJK123456");
        personas.add(persona6);
        Persona persona7 = new Persona("STU789012", "Carlos", "Sanchez", "Torres", Calendar.getInstance(), false, "555-345-6789", "LMN567890");
        personas.add(persona7);
        Persona persona8 = new Persona("VWX345678", "Elena", "Rodriguez", "Gutierrez", Calendar.getInstance(), true, "555-123-4567", "ABC345678");
        personas.add(persona8);
        Persona persona9 = new Persona("YZA901234", "Luisa", "Lopez", "Ramirez", Calendar.getInstance(), false, "555-234-5678", "DEF901234");
        personas.add(persona9);
        Persona persona10 = new Persona("BCD567890", "Pedro", "Fernandez", "Gomez", Calendar.getInstance(), true, "555-987-6543", "GHI567890");
        personas.add(persona10);
        Persona persona11 = new Persona("EFG123456", "Marta", "Gutierrez", "Torres", Calendar.getInstance(), false, "555-876-5432", "JKL123456");
        personas.add(persona11);
        Persona persona12 = new Persona("HIJ789012", "Sofia", "Hernandez", "Lopez", Calendar.getInstance(), true, "555-123-4567", "MNO789012");
        personas.add(persona12);
        Persona persona13 = new Persona("KLM345678", "Javier", "Torres", "Gomez", Calendar.getInstance(), false, "555-234-5678", "PQR345678");
        personas.add(persona13);
        Persona persona14 = new Persona("NOP901234", "Susana", "Gomez", "Fernandez", Calendar.getInstance(), true, "555-345-6789", "STU901234");
        personas.add(persona14);
        Persona persona15 = new Persona("UVW567890", "Carlos", "Ramirez", "Sanchez", Calendar.getInstance(), false, "555-678-9012", "VWX567890");
        personas.add(persona15);
        Persona persona16 = new Persona("XYZ123456", "Maria", "Torres", "Lopez", Calendar.getInstance(), true, "555-987-6543", "YZA123456");
        personas.add(persona16);
        Persona persona17 = new Persona("ABC789012", "Luis", "Gutierrez", "Hernandez", Calendar.getInstance(), false, "555-123-4567", "BCD789012");
        personas.add(persona17);
        Persona persona18 = new Persona("DEF345678", "Andres", "Lopez", "Gomez", Calendar.getInstance(), true, "555-234-5678", "EFG345678");
        personas.add(persona18);
        Persona persona19 = new Persona("GHI901234", "Ana", "Ramirez", "Torres", Calendar.getInstance(), false, "555-876-5432", "HIJ901234");
        personas.add(persona19);
        Persona persona20 = new Persona("JKL567890", "Miguel", "Fernandez", "Hernandez", Calendar.getInstance(), true, "555-345-6789", "KLM567890");
        personas.add(persona20);
        for (int i = 0; i < personas.size(); i++) {
            fachada.agregarPersona(personas.get(i));
        }

        List<Costos> costos = new LinkedList<>();
        //Agregar Costos Licencias
        TarifaLicencias tarifaLicencias1 = new TarifaLicencias(200f, VigenciaTarifaLicencia.I_AÑO, 600f);
        costos.add(tarifaLicencias1);
        TarifaLicencias tarifaLicencias2 = new TarifaLicencias(500f, VigenciaTarifaLicencia.II_AÑO, 900f);
        costos.add(tarifaLicencias2);
        TarifaLicencias tarifaLicencias3 = new TarifaLicencias(700f, VigenciaTarifaLicencia.III_AÑO, 1100f);
        costos.add(tarifaLicencias3);
        //Agregar Costos Placas
        TarifaPlacas tarifaPlacas1 = new TarifaPlacas(CondicionVehiculo.NUEVO, 1500f);
        costos.add(tarifaPlacas1);
        TarifaPlacas tarifaPlacas2 = new TarifaPlacas(CondicionVehiculo.USADO, 1000f);
        costos.add(tarifaPlacas2);

        for (int i = 0; i < costos.size(); i++) {
            fachada.agregarCosto(costos.get(i));
        }
    }

}
