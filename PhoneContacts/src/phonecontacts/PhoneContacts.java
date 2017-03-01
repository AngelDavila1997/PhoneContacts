/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonecontacts;

import java.util.*;

/**
 *
 * @author PC
 */
public class PhoneContacts {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        MobilePhone myPhone = new MobilePhone();
        while(true){
        options(menu(), myPhone);
        }
    }
    
public static int menu(){
        int option;
        Scanner teclado = new Scanner(System.in); //Entrada de teclado para selección de opciones
       do{
        System.out.println("***Contacts***");
        System.out.println("Menu:");
        System.out.println("0. Quit");
        System.out.println("1. Add contact");
        System.out.println("2. Update contact");
        System.out.println("3. Delete contact");
        System.out.println("4. Query contact");
        System.out.println("5. List all contacts");
        option=teclado.nextInt();
         }while (option <0 || option >= 7); //Mientras que la opcion ingresada sea menor que 0 O mayor igual a 7
                                           // seguira mostrando el menu
        return option;
    }   
public static void options(int option, MobilePhone mobilePhone){  
      String name;
      int number;
         switch(option){ //Seleccion multiple
            case 1:
                System.out.println("***Add contact***");
                    name = solicitarDatosString("Contact name:");
                    number = solicitarDatosInt("Number:"); 
                  if (mobilePhone.addContact(name , number)){
                    System.out.println("Contact added");
                        }else{
                    System.out.println("Contact already in list");
                         }
                break;
            case 2:
                System.out.println("***Update contact***");
                    name = solicitarDatosString("Contact name:");
                    number = solicitarDatosInt("Number:"); 
                   if (mobilePhone.updateContact(name , number)){
                    System.out.println("Contact updated");
                        }else{
                    System.out.println("Contact does not exist");
                         }
                break;
            case 3:
                System.out.println("***Delete contact***");
                    name = solicitarDatosString("Contact name:");
                   if (mobilePhone.removeContact(name)){
                    System.out.println("Contact removed");
                        }else{
                    System.out.println("Contact does not exist");
                         }
                break;
            case 4:
                System.out.println("***Query contact***");
                    name = solicitarDatosString("Contact name:");
                    System.out.println(mobilePhone.queryContact(name));
                break;
            case 5:
                System.out.println("***Contact list***");
                    mobilePhone.listContacts();
                break;
            default:
                exit();
                break;
        }
    }
public static void exit(){
        System.out.print("***Goodbye***");
        System.exit(0);
    }
public static int solicitarDatosInt(String d){ //Solicita los valores
        int miDato;
        Scanner entradaEscaner = new Scanner(System.in);
        System.out.print(d);
        miDato= entradaEscaner.nextInt();
        return miDato;
    }
public static String solicitarDatosString(String d){ //Solicita los valores
        String miDato;
        Scanner entradaEscaner = new Scanner(System.in);
        System.out.print(d);
        miDato= entradaEscaner.nextLine();
        return miDato;
    }
}
