/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

/**
 *
 * @author RJGC
 */
public class Venta {
    int idVenta;
    String local;
    int dia;
    String mes;
    int ano;
    int rutClient;
    int rutEmpleado;
    int idAuto;

    public Venta(int idVenta, String local, int dia, String mes, int ano, int rutClient, int rutEmpleado, int idAuto) {
        this.idVenta = idVenta;
        this.local = local;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.rutClient = rutClient;
        this.rutEmpleado = rutEmpleado;
        this.idAuto = idAuto;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getRutClient() {
        return rutClient;
    }

    public void setRutClient(int rutClient) {
        this.rutClient = rutClient;
    }

    public int getRutEmpleado() {
        return rutEmpleado;
    }

    public void setRutEmpleado(int rutEmpleado) {
        this.rutEmpleado = rutEmpleado;
    }

    public int getIdAuto() {
        return idAuto;
    }

    public void setIdAuto(int idAuto) {
        this.idAuto = idAuto;
    }
    
    
}
