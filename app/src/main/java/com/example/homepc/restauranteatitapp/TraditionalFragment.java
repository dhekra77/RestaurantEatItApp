package com.example.homepc.restauranteatitapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class TraditionalFragment extends Fragment {


    public TraditionalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_traditional, container, false);

        ArrayList<TraditionalfoodClass> trad_food = new ArrayList<TraditionalfoodClass>();
        trad_food.add(new TraditionalfoodClass("Karahi", "12500 Dt", R.drawable.karahi,"0"));
        trad_food.add(new TraditionalfoodClass("Biryani", "11500 Dt", R.drawable.biryani,"90"));
        trad_food.add(new TraditionalfoodClass("Malai Boti", "10000 Dt", R.drawable.malaiboti,"60"));
        trad_food.add(new TraditionalfoodClass("Seekh Kabab", "9000 Dt", R.drawable.kabab,"9"));
        trad_food.add(new TraditionalfoodClass("Tikka", "10000 Dt", R.drawable.tikka,"8"));
        trad_food.add(new TraditionalfoodClass("Sajji", "15500 Rs", R.drawable.sajjione,"1"));

        TraditionalFoodAdapter tradfoodadapter = new TraditionalFoodAdapter(getActivity(),trad_food);

        ListView listView = (ListView) view.findViewById(R.id.listview_traditional);
        listView.setAdapter(tradfoodadapter);

        return view;
    }

}
