package com.example.android.tourguide;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ChurchFragment extends Fragment {


    public ChurchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        //create ArrayList for places

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.church1Name, R.string.church1Address, R.string.church1Phone, R.string.church1Description, -1, 59.273378, 17.1018731));
        places.add(new Place(R.string.church2Name, R.string.church2Address, R.string.church2Phone, R.string.church2Description, -1, 59.3755888, 17.0343608));
        places.add(new Place(R.string.church3Name, R.string.church3Address, R.string.church3Phone, R.string.church3Description, -1, 59.4059051, 16.9391494));
        places.add(new Place(R.string.church4Name, R.string.church4Address, R.string.church4Phone, R.string.church4Description, -1, 59.375921, 17.2552255));
        places.add(new Place(R.string.church5Name, R.string.church5Address, R.string.church5Phone, R.string.church5Description, -1, 59.2814346, 16.9830609));
        places.add(new Place(R.string.church6Name, R.string.church6Address, R.string.church6Phone, R.string.church6Description, -1, 59.2585554, 17.2218617));


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