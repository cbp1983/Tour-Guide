package com.example.android.tourguide;

public class Place {

    /** Name of the place */
    private int mNameResourceID;

    /** Address of the place */
    private int mAddressResourceID;

    /** Phone Number of the place */

    private int mPhoneResourceID = NO_PHONE_PROVIDED;

    /** Constant value to represent that no phone number was provided for this place */

    private static final int NO_PHONE_PROVIDED = -2;

    /** Description of the place */

    private int mDescriptionResourceID;

    /** Image associated with the place */

    private int mImageResourceID = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this place */
    private static final int NO_IMAGE_PROVIDED = -1;

    /** GPS coordinates associated with the place */

    private double mLatitude;
    private double mLongitude;


    /**
     * Create a new Place object.
     * @param placeName is the place Name
     * @param address is the place Address
     * @param phone is the place Phone, if available
     * @param description is the place Description
     * @param getImageResourceID is the image for this place, if available
     * @param latitude is latitude
     * @param longitude is longitude
     */

    public Place(int placeName, int address, int phone, int description, int getImageResourceID,
                 double latitude, double longitude) {
        mNameResourceID = placeName;
        mAddressResourceID = address;
        mPhoneResourceID = phone;
        mDescriptionResourceID = description;
        mImageResourceID = getImageResourceID;
        mLatitude = latitude;
        mLongitude = longitude;
    }





    /**
     * Second constructor if a phone number is available.
     *
     * @param placeName
     * @param address
     * @param phone
     * @param description
     * @param gPSLocation
     *

    public Place(int placeName, int address, int phone, int description, int gPSLocation) {
        mNameResourceID = placeName;
        mAddressResourceID = address;
        mPhoneResourceID = phone;
        mDescriptionResourceID = description;
        mGPSLocation = gPSLocation;
    }

    /**
     * Third constructor in case of images but no phone available
     * @param placeName
     * @param address
     * @param address
     * @param getImageResourceID
     * @param gPSLocation
     *

    public Place(int placeName, int address, int description, int getImageResourceID, int gPSLocation) {
        mNameResourceID = placeName;
        mAddressResourceID = address;
        mDescriptionResourceID = description;
        mImageResourceID = getImageResourceID;
        mGPSLocation = gPSLocation;
    }

    /**
     * Fourth constructor in case of images and phone available
     * @param placeName
     * @param address
     * @param phone
     * @param address
     * @param getImageResourceID
     * @param gPSLocation
     *

    public Place(int placeName, int address, int phone, int description, int getImageResourceID, int gPSLocation) {
        mNameResourceID = placeName;
        mAddressResourceID = address;
        mPhoneResourceID = phone;
        mDescriptionResourceID = description;
        mImageResourceID = getImageResourceID;
        mGPSLocation = gPSLocation;
    }

    /**
     * Get the name of the place.
     */
    public int getName() {
        return mNameResourceID;
    }

    /**
     * Get the address of the place.
     */

    public int getAddress() {
        return mAddressResourceID;
    }

    /**
     * get the phone number for the place.
     */

    public int getPhone() {
        return mPhoneResourceID;
    }

    /**
     * Returns whether or not there is a phone number for this place.
     */

    public boolean hasPhone() {
        return mPhoneResourceID != NO_PHONE_PROVIDED;
    }

    /**
     * Get the description of the place.
     */

    public int getDescription() {
        return mDescriptionResourceID;
    }

    /**
     * Get the GPS coordinates for the place.
     */

    public double getLatitude(){
        return mLatitude;
    }

    public double getLongitude(){
        return mLongitude;
    }

    /**
     * Get the image resource for this place.
     */

    public int getImageResourceID() { return mImageResourceID; }

    /**
     * Returns whether or not there is an image for this place.
     */
    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }
}
