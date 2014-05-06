/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author RJGC
 */
public class Clientes {
int rut;
int rutTemp;
int valInt;
String nombre;
String apellidos;
int fono;
String email;

    public int getRutTemp() {
        return rutTemp;
    }

    public void setRutTemp(int rutTemp) {
        this.rutTemp = rutTemp;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getValInt() {
        return valInt;
    }

    public void setValInt(int valInt) {
        this.valInt = valInt;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getFono() {
        return fono;
    }

    public void setFono(int fono) {
        this.fono = fono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


public Clientes(int rut, int valInt, String nombre, String apellidos, int fono, String email) {
        this.rut = rut;
        this.valInt = valInt;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fono = fono;
        this.email = email;
    }
public Clientes(int temp)
{
this.rutTemp=temp;
}
public Clientes()
{

}
public int temcliente()
{
    return rutTemp;
}

}
