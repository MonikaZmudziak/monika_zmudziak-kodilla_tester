package com.kodilla.mockito.homework;

import javax.sound.sampled.FloatControl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherNotificationService {
    private Map<Location, Set<User>> subscriptions = new HashMap<>(); // jeden unikalny user do kilku unikalnych lokalizacji


    public void addSubscriber(User user, Location location) {

        boolean hasLocation = subscriptions.containsKey(location);
        if (!hasLocation) { //czy lokalizacja nie została jeszcze dodana, jak nie to dodaje lokacje tworząc  nowego seta dla userów
            subscriptions.put(location, new HashSet<User>());
        }

        Set<User> locationSubscriber = subscriptions.get(location);// set z userami danej lokalizacji
        locationSubscriber.add(user);
    }

    public void sendNotification(WeatherNotification weatherNotification, Location location) {
        boolean hasLocation = subscriptions.containsKey(location);
        if (!hasLocation) {
            return;
        }

        Set<User> locationSubscribers = subscriptions.get(location); // pobranie seta userów danej lokalizacji, wartość dla klucza
        for (User user : locationSubscribers) { // każdy pojedyńczy user
            user.receive(weatherNotification);
        }
    }

    public void unsubscribeUser(User user) {
        for (Location location : subscriptions.keySet()) { //same  (lokalizaje)
            Set<User> locationSubscribers = subscriptions.get(location);               //pobranie seta userów dla danej lokaliziacji
            locationSubscribers.remove(user);
        }
    }

    public void removeLocation(Location location) {
        subscriptions.remove(location);

    }

    public void removeSubscriptionFromLocation(User user, Location location) {
        Set<User> locationSubscribers = subscriptions.get(location);
        locationSubscribers.remove(user);

    }


}
