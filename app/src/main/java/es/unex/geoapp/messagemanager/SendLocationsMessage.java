package es.unex.geoapp.messagemanager;



import java.util.List;

import es.unex.geoapp.model.LocationFrequency;

/**
 * Created by Javier on 10/10/2017.
 */

public class SendLocationsMessage extends  LocationMessage{

    /** Location of users */
    List<LocationFrequency> locationList;


    public SendLocationsMessage(List<LocationFrequency> locationList) {
        this.locationList = locationList;
        this.kind = NotificationKind.SendLocation;
    }

    public SendLocationsMessage(String senderId, List<LocationFrequency> locationList) {
        this.senderId = senderId;
        this.locationList = locationList;
        this.kind = NotificationKind.SendLocation;
    }

    public List<LocationFrequency> getLocationList() {
        return locationList;
    }

    public void setLocationList(List<LocationFrequency> locationList) {
        this.locationList = locationList;
    }

}
