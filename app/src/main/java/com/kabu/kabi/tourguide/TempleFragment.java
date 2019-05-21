package com.kabu.kabi.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class TempleFragment extends Fragment {
    private ArrayList<Attraction> mAttraction;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_fragment, container, false);
        mAttraction = new ArrayList<Attraction>();
        mAttraction.add(new Attraction("Wat Pikul Ngoen", "Bang Muang, Bang Yai District, Nonthaburi 11140", R.drawable.watpikulngoen));
        mAttraction.add(new Attraction("Wat Ampawan", "1 หมู่ที่ 13 Tambon Bang Muang, Amphoe Bang Yai, Chang Wat Nonthaburi 11140", R.drawable.ampawan));

        ListView listView = rootView.findViewById(R.id.list_view);
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), R.layout.list_item, mAttraction);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("geo:0,0?q=" + mAttraction.get(position).getName()));
                startActivity(intent);
            }
        });
        return rootView;
    }
}
