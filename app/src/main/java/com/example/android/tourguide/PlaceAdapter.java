package com.example.android.tourguide;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.logging.Handler;

public class PlaceAdapter extends ArrayAdapter<Place> {


    private int mColorResourceID;

    public PlaceAdapter(Activity context, ArrayList<Place> places, int colorResourceID) {
        super(context, 0, places);
        mColorResourceID = colorResourceID;
    }

    private static final String LOG_TAG = PlaceAdapter.class.getSimpleName();

    //Override getView
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        //This looks for which view to display. If outside view, not shown

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link Place} object located at this position in the list
        Place currentPlace = getItem(position);

        // Find the TextView in the list_item.xml layout with the place name
        TextView nameView = (TextView) listItemView.findViewById(R.id.name_text_view);

        // Get the version name from the current Place object and
        // set this text on the Place TextView
        nameView.setText(currentPlace.getName());

        // Find the TextView in the list_item.xml layout with the address
        TextView addressView = (TextView) listItemView.findViewById(R.id.address_text_view);

        // Get the version number from the current Place object and
        // set this text on the place TextView
        addressView.setText(currentPlace.getAddress());

        // Find the TextView in the list_item.xml layout with the phone number
        TextView phoneView = (TextView) listItemView.findViewById(R.id.phone_text_view);

        // Get the version number from the current Place object and
        // set this text on the place TextView
        phoneView.setText(currentPlace.getPhone());

        // Check if a phone number is provided for this place or not
        if (currentPlace.hasPhone()) {
            // If a phone number is available, display the provided string
            phoneView.setText(currentPlace.getPhone());
            // Make sure the view is visible
            phoneView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the TextView(set visibility to GONE)
            phoneView.setVisibility(View.GONE);
        }

        // Find the TextView in the list_item.xml layout with the description
        TextView descriptionView = (TextView) listItemView.findViewById(R.id.description_text_view);

        // Get the version number from the current Place object and
        // set this text on the place TextView
        descriptionView.setText(currentPlace.getDescription());

        // Find the ImageView in the list_item.xml layout for places
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        // Check if an image is provided for this place or not
        if (currentPlace.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentPlace.getImageResourceID());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        /**
         * Now we want to make the location load by pressing on the pin button in the list item.
         */

        //find the location pin icon
        ImageView pinItem = (ImageView) listItemView.findViewById(R.id.location_pin);

        //create latitude and longitude of the item
        final double placeLatitude = currentPlace.getLatitude();
        final double placeLongitude = currentPlace.getLongitude();

        //now create the onClickListener
        pinItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                       Uri intentUri = Uri.parse("geo:" + placeLatitude + "," + placeLongitude + "?q=");
                       Intent mapIntent = new Intent(Intent.ACTION_VIEW, intentUri);
                       getContext().startActivity(mapIntent);
                   }
            }
        );



        /**
         *
         *
         // Set the theme color for the list item
         View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceID);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

         */


        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
