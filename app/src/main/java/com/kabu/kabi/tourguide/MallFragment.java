package com.kabu.kabi.tourguide;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MallFragment extends Fragment {

    private ArrayList<Attraction> mAttraction;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_fragment, container, false);
        mAttraction = new ArrayList<Attraction>();
        mAttraction.add(new Attraction("Central Westgate", "หมู่ที่ 6 199, 199/1, 199/2 Rattanathibet Rd, Tambon Sao Thong Hin, Amphoe Bang Yai, Chang Wat Nonthaburi 11140"));
        mAttraction.add(new Attraction("Big C Extra Bangyai", "9, 9 หมู่ 11 Kanchanaphisek Expy, Tambon Bang Rak Phatthana, Amphoe Bang Bua Thong, Chang Wat Nonthaburi 11110"));

        ListView listView = rootView.findViewById(R.id.list_view);
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), R.layout.list_item, mAttraction);
        listView.setAdapter(adapter);
        return rootView;
    }
}
