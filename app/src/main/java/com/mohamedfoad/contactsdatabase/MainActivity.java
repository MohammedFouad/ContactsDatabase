package com.mohamedfoad.contactsdatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView contactsList = (ListView)findViewById(R.id.contactsList);

        DatabaseHandler db = new DatabaseHandler(this);

        ArrayList<Contact> arrayOfContacts = new ArrayList<>();

        ContactAdapter contactAdapter = new ContactAdapter(this,arrayOfContacts);

        /**
         * CRUD Operations
         * */

        //Inserting contacts

        Log.d("Insert: " , "Inserting....");
        db.addContact(new Contact("Mohamed","01003260023"));
        db.addContact(new Contact("Ahmed","011585"));
        db.addContact(new Contact("Ali","012586456"));
        db.addContact(new Contact("Hany","01425466"));
        db.addContact(new Contact("Eman","01142578"));

        contactAdapter.add(db.getContact(0));
        contactsList.setAdapter(contactAdapter);

        //Reading
      //  Log.d("Reading: ", "Reading all contacts..");
       // List<Contact> contacts = db.getAllContacts();
/*
        for (Contact cn : contacts){
            String log = "Id: "+ cn.get_id()+" , Name: " + cn.get_name() + " ,Phone: " + cn.get_phone_number();

            Log.d("Name: ", log);
        }
**/
    }
}
