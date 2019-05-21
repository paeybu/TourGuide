package com.kabu.kabi.tourguide;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class AttractionAdapter extends ArrayAdapter<Attraction> {
    private final static String LOG_TAG = AttractionAdapter.class.getSimpleName();

    public AttractionAdapter(@NonNull Context context, int resource, @NonNull List<Attraction> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, @androidx.annotation.Nullable View convertView, @androidx.annotation.NonNull ViewGroup parent) {
        Log.v(LOG_TAG, "Attraction adapter getView()");
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Attraction currentAttraction = getItem(position);

        TextView nameTv = listItemView.findViewById(R.id.name_text_view);
        TextView addressTv = listItemView.findViewById(R.id.address_text_view);

        nameTv.setText(currentAttraction.getName());
        Log.v(LOG_TAG, currentAttraction.getName());
        addressTv.setText(currentAttraction.getAddress());
        return listItemView;
    }


}
