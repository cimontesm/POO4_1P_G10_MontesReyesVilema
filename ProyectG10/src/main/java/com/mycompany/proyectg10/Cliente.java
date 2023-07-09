/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectg10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cmontes
 */
public class Cliente extends Usuario {
    private int tarjetaCredito;
    private int puntosLicencia;
    private TipoCliente tipoC;
    private Vehiculo vehiculo;
    
    public Cliente(String numCedula, String nombre, int edad, TipoUsuario perfil, String correo, String contrasenia, int tarjetaCredito, int puntosLicencia, TipoCliente tipoC, Vehiculo vehiculo){
        super(numCedula,nombre,edad,perfil,correo,contrasenia);
        this.tarjetaCredito = tarjetaCredito;
        this.puntosLicencia = puntosLicencia;
        this.tipoC = tipoC;
        this.vehiculo = vehiculo;
    }
    public int getTarjetaCredito() {
        return tarjetaCredito;
    }
    public void setTarjetaCredito(int tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }
    public int getPuntosLicencia() {
        return puntosLicencia;
    }
    public void setPuntosLicencia(int puntosLicencia) {
        this.puntosLicencia = puntosLicencia;
    }
    public TipoCliente getTipoC() {
        return tipoC;
    }
    public void setTipoC(TipoCliente tipoC) {
        this.tipoC = tipoC;
    }
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    @Override
    public void consultarMultas(ArrayList<Multa> listaMultas){
        ArrayList<Double> valoresMultas = new ArrayList<>();
        double total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su cédula o número de placa: ");
        String dato = sc.nextLine();
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("                                          DETALLE DE MULTAS                                           ");
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("CÉDULA | MATRÍCULA | INFRACCIÓN | VALOR A PAGAR | FECHA DE INFRACCIÓN | FECHA DE NOTIFICACIÓN | PUNTOS");
        for (Multa multa : listaMultas){
            if (dato.equals(multa.getCliente().getNumCedula()) || dato.equals(multa.getCliente().getVehiculo().getNumPlaca())){
                multa.toString();
            }
        }
        for (Multa m : listaMultas){
            valoresMultas.add(m.getValorAPagar());
        }
        for (int i=0;i<valoresMultas.size();i++){
            total += valoresMultas.get(i);
        }
        System.out.println("TOTAL A PAGAR: "+total);
        System.out.println("PARA PAGAR PUEDE ACERCARSE A LA AGENCIA MÁS CERCANA.");
    }
    
    public void agendarRev(ArrayList<Multa> listaMultas){
        ArrayList<Multa> multasCliente = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("                                           AGENDAR REVISIÓN                                           ");
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.print("Ingrese placa: ");
        String placaCliente = sc.nextLine();
        for (Multa multa : listaMultas){
            if (placaCliente.equals(multa.getCliente().getVehiculo().getNumPlaca())){
                multasCliente.add(multa);
            }
        }
        if (multasCliente.isEmpty()){
            System.out.println("No tiene multas.");
            System.out.println("                          Horarios disponibles                          ");
            System.out.println("1. 10-06-2023 09:00");
            System.out.println("2. 10-06-2023 09:30");
            System.out.println("3. 10-06-2023 10:00");
            System.out.println("4. 10-06-2023 10:30");
            System.out.println("5. 10-06-2023 11:00");
            System.out.println("6. 10-06-2023 11:30");
            System.out.println("7. 10-06-2023 12:00");
            System.out.println("8. 10-06-2023 12:30");
            System.out.println("9. 10-06-2023 13:00");
            System.out.println("10. 10-06-2023 13:30");
            System.out.println("11. 10-06-2023 14:00");
            System.out.println("12. 10-06-2023 14:30");
            System.out.println("13. 10-06-2023 15:00");
            System.out.println("14. 10-06-2023 15:30");
            System.out.println("15. 10-06-2023 16:00");
            System.out.println("16. 10-06-2023 16:30");
            System.out.println("17. 10-06-2023 17:00");
            System.out.println("18. 10-06-2023 17:30");
            System.out.println("19. 10-06-2023 18:00");
            System.out.println("20. 10-06-2023 18:30");
//            System.out.println("21. 10-06-2023 19:00");
//            System.out.println("22. 10-06-2023 19:30");
//            System.out.println("23. 10-06-2023 20:00");
//            System.out.println("24. 10-06-2023 20:30");
//            System.out.println("25. 10-06-2023 21:00");
//            System.out.println("26. 10-06-2023 21:30");
//            System.out.println("27. 10-06-2023 22:00");
//            System.out.println("28. 10-06-2023 22:30");
//            System.out.println("29. 10-06-2023 23:00");
//            System.out.println("30. 10-06-2023 23:30");
            System.out.print("Elija el horario para la revisión: ");
            int num = sc.nextInt();
            sc.nextLine();
            switch(num){
                case 1:
                    System.out.println(getNombre()+", se ha agendado su cita para el 10-06-2023 a las 09:00");
                    break;
                case 2:
                    System.out.println(getNombre()+", se ha agendado su cita para el 10-06-2023 a las 09:30");
                    break;
                case 3:
                    System.out.println(getNombre()+", se ha agendado su cita para el 10-06-2023 a las 10:00");
                    break;
                case 4:
                    System.out.println(getNombre()+", se ha agendado su cita para el 10-06-2023 a las 10:30");
                    break;
                case 5:
                    System.out.println(getNombre()+", se ha agendado su cita para el 10-06-2023 a las 11:00");
                    break;
                case 6:
                    System.out.println(getNombre()+", se ha agendado su cita para el 10-06-2023 a las 11:30");
                    break;
                case 7:
                    System.out.println(getNombre()+", se ha agendado su cita para el 10-06-2023 a las 12:00");
                    break;
                case 8:
                    System.out.println(getNombre()+", se ha agendado su cita para el 10-06-2023 a las 12:30");
                    break;
                case 9:
                    System.out.println(getNombre()+", se ha agendado su cita para el 10-06-2023 a las 13:00");
                    break;
                case 10:
                    System.out.println(getNombre()+", se ha agendado su cita para el 10-06-2023 a las 13:30");
                    break;
                case 11:
                    System.out.println(getNombre()+", se ha agendado su cita para el 10-06-2023 a las 14:00");
                    break;
                case 12:
                    System.out.println(getNombre()+", se ha agendado su cita para el 10-06-2023 a las 14:30");
                    break;
                case 13:
                    System.out.println(getNombre()+", se ha agendado su cita para el 10-06-2023 a las 15:00");
                    break;
                case 14:
                    System.out.println(getNombre()+", se ha agendado su cita para el 10-06-2023 a las 15:30");
                    break;
                case 15:
                    System.out.println(getNombre()+", se ha agendado su cita para el 10-06-2023 a las 16:00");
                    break;
                case 16:
                    System.out.println(getNombre()+", se ha agendado su cita para el 10-06-2023 a las 16:30");
                    break;
                case 17:
                    System.out.println(getNombre()+", se ha agendado su cita para el 10-06-2023 a las 17:00");
                    break;
                case 18:
                    System.out.println(getNombre()+", se ha agendado su cita para el 10-06-2023 a las 17:30");
                    break;
                case 19:
                    System.out.println(getNombre()+", se ha agendado su cita para el 10-06-2023 a las 18:00");
                    break;
                case 20:
                    System.out.println(getNombre()+", se ha agendado su cita para el 10-06-2023 a las 18:30");
                    break;                    
            }
        } else {
            System.out.println("Usted tiene multas, no puede agendar cita para revisión.");
        }
    }
}
