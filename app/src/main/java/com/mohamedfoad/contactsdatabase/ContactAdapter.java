package com.mohamedfoad.contactsdatabase;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by PC-SMART on 12/7/2017.
 */

public class ContactAdapter  extends ArrayAdapter<Contact>{
    @NonNull


    public ContactAdapter(@NonNull Context context, @LayoutRes int resource) {
        super(context, resource);
    }

    public ContactAdapter(@NonNull Context context, @LayoutRes int resource, @IdRes int textViewResourceId) {
        super(context, resource, textViewResourceId);
    }

    public ContactAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull Contact[] objects) {
        super(context, resource, objects);
    }

    public ContactAdapter(@NonNull Context context, @LayoutRes int resource, @IdRes int textViewResourceId, @NonNull Contact[] objects) {
        super(context, resource, textViewResourceId, objects);
    }

    public ContactAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Contact> objects) {
        super(context, resource, objects);
    }

    public ContactAdapter(@NonNull Context context, @LayoutRes int resource, @IdRes int textViewResourceId, @NonNull List<Contact> objects) {
        super(context, resource, textViewResourceId, objects);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }
}
