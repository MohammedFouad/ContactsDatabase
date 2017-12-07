package com.mohamedfoad.contactsdatabase;

/**
 * Created by PC-SMART on 12/7/2017.
 */

public class Contact {

    int _id;
    String _name;
    String _phone_number;


    //Empty constructor

    public Contact(){

    }
    public Contact(String name, String _phone_number){
        this._name = name;
        this._phone_number = _phone_number;
    }

    //constructor
    public Contact(int _id, String _name, String _phone_number) {
        this._id = _id;
        this._name = _name;
        this._phone_number = _phone_number;
    }

    // getting ID
    public int get_id() {
        return _id;
    }

    //setting ID
    public void set_id(int _id) {
        this._id = _id;
    }

    // getting name
    public String get_name() {
        return _name;
    }

    //setting name
    public void set_name(String _name) {
        this._name = _name;
    }

    //getting phone number
    public String get_phone_number() {
        return _phone_number;
    }

    //setting phone number
    public void set_phone_number(String _phone_number) {
        this._phone_number = _phone_number;
    }






}
