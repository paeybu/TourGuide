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
import android.widget.ListView;

import java.util.ArrayList;

public class MallFragment extends Fragment {

    private ArrayList<Attraction> mAttraction;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_fragment, container, false);
        mAttraction = new ArrayList<Attraction>();
        mAttraction.add(new Attraction("Central Westgate", "หมู่ที่ 6 199, 199/1, 199/2 Rattanathibet Rd, Tambon Sao Thong Hin, Amphoe Bang Yai, Chang Wat Nonthaburi 11140", R.drawable.westgate));
        mAttraction.add(new Attraction("Big C Extra Bangyai", "9, 9 หมู่ 11 Kanchanaphisek Expy, Tambon Bang Rak Phatthana, Amphoe Bang Bua Thong, Chang Wat Nonthaburi 11110", R.drawable.bigcextra));

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
