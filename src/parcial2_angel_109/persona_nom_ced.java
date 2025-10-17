/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2_angel_109;

/**
 *
 * @author SALA-4
 */
public class persona_nom_ced {
    String nombre;
    String apellido;
    int edad;
    int cedula;
    String ciudad;
    int numero;
    
    public void mostrarxd(){
        System.out.println("mi nombre es"+" "+nombre);
        System.out.println("mi apellido es "+""+apellido);
        System.out.println("mi edad es "+""+edad);
        System.out.println("mi cedulamente es "+""+cedula);
        System.out.println("la ciudad ramdom que escribi es"+""+ciudad);
        System.out.println("mi numero de algo? es"+""+numero);
    }
    
   public static void main(String[] args) {
        persona_nom_ced yo=new persona_nom_ced();
        yo.nombre="dumbo";
        yo.apellido="2?";
        yo.edad=1990;
        yo.cedula=1998732413;
        yo.ciudad="polo desertoso";
        yo.numero=5;
        
        yo.mostrarxd();
    }
  

}
