package com.kodilla.mockito.homework;

import javax.sound.sampled.FloatControl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherNotificationService {

    private Map<User, Set<Location>> subscriptions = new HashMap<>(); // jeden unikalny user do kilku unikalnych lokalizacji


    public void addSubscriber(User user, Location location) {

        boolean hasUser = subscriptions.containsKey(user);
        if (!hasUser) {
            subscriptions.put(user, new HashSet<Location>());
        }

        Set<Location> userLocations = subscriptions.get(user);// set ze śledzonymi lokalizacjami dla danego usera
        userLocations.add(location);

    }

    public void sendNotification(WeatherNotification weatherNotification, Location location) {
        for (Map.Entry<User, Set<Location>> entry : subscriptions.entrySet()) { //czy w secie jest dana lokalizacja, jak tak to wysyłam powiadomienie
            Set<Location> userLocations = entry.getValue();
            User user = entry.getKey();

            if(userLocations.contains(location)) {
                user.receive(weatherNotification);
            }
        }
    }

    public void unsubscribeUser(User user) {
        subscriptions.remove(user);
    }

    public void removeLocation(Location location) {
        for (Map.Entry<User, Set<Location>> entry : subscriptions.entrySet()) {
            Set<Location> userLocations = entry.getValue(); //getValue -wartości z setów
           userLocations.remove(location); //or entry.getValue().remove(location);
        }
    }

    public void removeSubscriptionFromLocation(User user, Location location){
        Set<Location>userLocation = subscriptions.get(user);
        userLocation.remove(location);

    }


}
