package com.example.homepc.restauranteatitapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class FastFoodFragment extends Fragment {


    public FastFoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fast_food, container, false);

        ArrayList<FastfoodClass> fastfood = new ArrayList<FastfoodClass>();
        fastfood.add(new FastfoodClass("Beef Burger", "6000 Dt", R.drawable.beef,"10"));
        fastfood.add(new FastfoodClass("Chicken Burger", "8000 Dt", R.drawable.chicken,"20"));
        fastfood.add(new FastfoodClass("Zinger Burger", "10000 Dt", R.drawable.zinger,"30"));
        fastfood.add(new FastfoodClass("Fries", "1500 Dt", R.drawable.fries,"15"));
        fastfood.add(new FastfoodClass("Zinger Roll", "8000 Dt", R.drawable.roll,"9"));
        fastfood.add(new FastfoodClass("Club Sandwich", "8500 Dt", R.drawable.club,"7"));
        fastfood.add(new FastfoodClass("Chicken Wings", "12000 Dt", R.drawable.wings,"17"));
        fastfood.add(new FastfoodClass("Chicken Broast", "14000 Dt", R.drawable.broast,"1"));
        fastfood.add(new FastfoodClass("Chicken Nuggets", "9000 Dt", R.drawable.nuggets,"0"));

        FastFoodAdapter fastfoodadapter = new FastFoodAdapter(getActivity(),fastfood);

        ListView listView = (ListView) view.findViewById(R.id.listview_fastfood);
        listView.setAdapter(fastfoodadapter);
        return view;

    }

}
