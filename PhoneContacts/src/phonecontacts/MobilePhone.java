/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonecontacts;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class MobilePhone {
    private ArrayList<Contact> contacts;

    public MobilePhone() {
        this.contacts = new ArrayList<Contact>();//eL ArrayList tomara una posicion en memoria
    }
    
    public int findContact(String name){
         for(int i = 0; i<contacts.size(); i++){//Mientras que i sea menor al tamaño del arraylist
            if(contacts.get(i).getName().equals(name)){//Si el nombre del contacto en la posicion es igual al nombre
                return i;//Estoy regresando un apuntador a una posicion original del Array
            }
        }
         return -1;//Regresa -1 (no hay posicion -1)
    }
    public boolean addContact(Contact contact){//Añade un contacto
        if(findContact(contact.getName()) == -1){//Si regresa -1 se añade el contacto ya que no existe
            contacts.add(contact);
            return true;
        }
        return false;
    }
    public boolean addContact(String name, int number){
        return addContact(new Contact(name , number));
    }
    public boolean removeContact(Contact contact){//Remueve el contacto
        int pos = findContact(contact.getName());//Recibe la posicion
        if(pos == -1){//No EXISTE
            return false;
        }
        contacts.remove(pos);//Se borra el conacto en la posicion .remove(index)
        return true;
    }
    public boolean removeContact(String name, int number){
        return removeContact(new Contact(name , number));
    }
    public boolean removeContact(String name){
        return removeContact(new Contact(name , 000));
    }
    public boolean updateContact(Contact contact){//Actualiza el contacto
        int pos = findContact(contact.getName());//Obtiene la posicion
        if(pos == -1){//No EXISTE
            return false;
        }//Establece nuevos valores
        contacts.get(pos).setName(contact.getName());
        contacts.get(pos).setNumber(contact.getNumber());
        return true;
    }
    public boolean updateContact(String name, int number){
        return updateContact(new Contact(name , number));
    }
    public void listContacts(){
        for(Contact temp: this.contacts){
            System.out.println(temp.toString());
        }
    }
    public String queryContact(String name){ //Busca el contacto
        int pos = findContact(name);//Regresa una posicion
        if(pos == -1){//No existe
            return "Contact not found";
        }else{
            return contacts.get(pos).toString();//regresa un String con la informacion del contacto
        }
    }
}
