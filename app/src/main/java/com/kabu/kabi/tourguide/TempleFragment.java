package com.kabu.kabi.tourguide;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class TempleFragment extends Fragment {
    private ArrayList<Attraction> mAttraction;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_fragment, container, false);
        mAttraction = new ArrayList<Attraction>();
        mAttraction.add(new Attraction("Wat Pikul Ngoen", "Bang Muang, Bang Yai District, Nonthaburi 11140"));
        mAttraction.add(new Attraction("Wat Ampawan", "53 หมู่ 4 Tambon Phrom Buri, Amphoe Phrom Buri, Chang Wat Sing Buri 16160"));

        ListView listView = rootView.findViewById(R.id.list_view);
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), R.layout.list_item, mAttraction);
        listView.setAdapter(adapter);
        return rootView;
    }
}
