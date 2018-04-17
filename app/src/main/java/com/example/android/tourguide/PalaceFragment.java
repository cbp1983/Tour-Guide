package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PalaceFragment extends Fragment {


    public PalaceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        //create ArrayList for places

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.palace1Name, R.string.palace1Address, R.string.palace1Phone, R.string.palace1Description, -1, 59.2559626, 17.2169575));
        places.add(new Place(R.string.palace2Name, R.string.palace2Address, R.string.palace2Phone, R.string.palace2Description, -1, 59.3856491, 17.3047765));
        places.add(new Place(R.string.palace3Name, R.string.palace3Address, R.string.palace3Phone, R.string.palace3Description, -1, 59.4469172, 16.6213918));
        places.add(new Place(R.string.palace4Name, R.string.palace4Address, -2, R.string.palace4Description, -1, 59.4272291, 16.7545082));
        places.add(new Place(R.string.palace5Name, R.string.palace5Address, -2, R.string.palace5Description, -1, 59.0558748, 17.0787862));


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