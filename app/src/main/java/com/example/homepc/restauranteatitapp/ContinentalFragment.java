package com.example.homepc.restauranteatitapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContinentalFragment extends Fragment {


    public ContinentalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_continental, container, false);

        ArrayList<ContinentalClass> conti_food = new ArrayList<ContinentalClass>();
        conti_food.add(new ContinentalClass("Salsa", "6000 Dt", R.drawable.coneone,"10"));
        conti_food.add(new ContinentalClass("Arabic Pizza", "11500 Dt", R.drawable.ctwo,"10"));
        conti_food.add(new ContinentalClass("Macaroni", "14000 Dt", R.drawable.cthree,"10"));
        conti_food.add(new ContinentalClass("Pan Burger", "12000 Dt", R.drawable.cfive,"10"));


        ContinentalAdapter continentaladapter = new ContinentalAdapter(getActivity(),conti_food);

        ListView listView = (ListView) view.findViewById(R.id.listview_continental);
        listView.setAdapter(continentaladapter);

        return view;
    }

}
