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
    
    /*public Contact findContact(String name){
         for(Contact temp : this.contacts){
            if(temp.getName().equals(name)){
                return temp;//Estoy regresando un apuntador a una posicion original del Array
            }
        }
         return null;//Como no existe el bojeto lo que tengo que regresar es un null
    }*/
    public int findContact(String name){
         for(int i = 0; i<contacts.size(); i++){
            if(contacts.get(i).getName().equals(name)){
                return i;//Estoy regresando un apuntador a una posicion original del Array
            }
        }
         return -1;
    }
    public boolean addContact(Contact contact){
        if(findContact(contact.getName()) == -1){
            contacts.add(contact);
            return true;
        }
        return false;
    }
    public boolean addContact(String name, int number){
        return addContact(new Contact(name , number));
    }
    public boolean removeContact(Contact contact){
        int pos = findContact(contact.getName());
        if(pos == -1){//No EXISTE
            return false;
        }
        contacts.remove(pos);
        return true;
    }
    public boolean removeContact(String name, int number){
        return removeContact(new Contact(name , number));
    }
    public boolean removeContact(String name){
        return removeContact(new Contact(name , 000));
    }
    public boolean updateContact(Contact contact){
        int pos = findContact(contact.getName());
        if(pos == -1){//No EXISTE
            return false;
        }
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
    public String queryContact(String name){
        int pos = findContact(name);
        if(pos == -1){
            return "Contact not found";
        }else{
            return contacts.get(pos).toString();
        }
    }
}
