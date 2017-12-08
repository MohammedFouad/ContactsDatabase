package com.mohamedfoad.contactsdatabase;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PC-SMART on 12/7/2017.
 */

public class ContactAdapter  extends ArrayAdapter<Contact>{
    public ContactAdapter(Context context, ArrayList<Contact> contacts) {
        super(context, 0, contacts);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Contact contact = getItem(position);

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.listcontacts,parent,false);
        }

        TextView contactName= convertView.findViewById(R.id.contactsList);
        TextView contactPhoneNumber= convertView.findViewById(R.id.contactPhoneNumber);

        contactName.setText(contact._name);
        contactPhoneNumber.setText(contact._phone_number);

        return super.getView(position, convertView, parent);
    }
}

