package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodFragment extends Fragment {


    public FoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        //create ArrayList for places

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.food1Name, R.string.food1Address, R.string.food1Phone, R.string.food1Description, -1, 59.3770348, 17.032499));
        places.add(new Place(R.string.food2Name, R.string.food2Address, R.string.food2Phone, R.string.food2Description, -1, 59.3775912, 17.0304615));
        places.add(new Place(R.string.food3Name, R.string.food3Address, R.string.food3Phone, R.string.food3Description, -1, 59.3769513, 17.0146261));
        places.add(new Place(R.string.food4Name, R.string.food4Address, R.string.food4Phone, R.string.food4Description, -1, 59.3764368, 17.0275935));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_church);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // place_listyout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}