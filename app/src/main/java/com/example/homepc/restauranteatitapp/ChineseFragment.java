package com.example.homepc.restauranteatitapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */


public class ChineseFragment extends Fragment {
    DatabaseHelper mydb;

    public ChineseFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_chinese, container, false);
        this.mydb = new DatabaseHelper(getContext());
        ArrayList<ChineseClass> c_food = new ArrayList<ChineseClass>();
        c_food.add(new ChineseClass("Fried Rice", "6000 Dt", R.drawable.friedrice,"11"));
        c_food.add(new ChineseClass("Sushi", "5000 Dt", R.drawable.sushi,"10"));
        c_food.add(new ChineseClass("Haka Noodles", "7500 Dt", R.drawable.haka,"9"));
        c_food.add(new ChineseClass("Corn Soup", "5000 Dt", R.drawable.soup,"8"));

        ChineseAdapter cadapter = new ChineseAdapter(getActivity(),c_food);


        ListView listView = (ListView) view.findViewById(R.id.listview_chinese);
        listView.setAdapter(cadapter);



        return view;
    }





}
