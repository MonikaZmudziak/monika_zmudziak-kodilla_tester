package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class WeatherNotificationServiceTestSuite {

//    WeatherNotificationService weatherNotificationService = new WeatherNotificationService();
//    User user1 = Mockito.mock(User.class);
//    User user2 = Mockito.mock(User.class);
//
//    Location location1 = Mockito.mock(Location.class);
//    Location location2 = Mockito.mock(Location.class);


    //Osoba zainteresowana może zostać zapisana do danej lokalizacji i zacznie otrzymywać powiadomienia
    @Test
    public void addUserToLocation() {
        WeatherNotificationService weatherNotificationService = new WeatherNotificationService();
        User user1 = Mockito.mock(User.class);
        User user2 = Mockito.mock(User.class);

        Location location1 = Mockito.mock(Location.class);
        Location location2 = Mockito.mock(Location.class);

        WeatherNotification notification = Mockito.mock(WeatherNotification.class);


        weatherNotificationService.addSubscriber(user1, location1);
        weatherNotificationService.addSubscriber(user2, location2);

        weatherNotificationService.sendNotification(notification, location1);
        weatherNotificationService.sendNotification(notification, location2);

        Mockito.verify(user1, Mockito.times(1)).receive(notification);
        Mockito.verify(user2, Mockito.times(1)).receive(notification);

    }


    //Można wycofać subskrypcję z danej lokalizacji.
    @Test
    public void removeUserSubscriptionFromLocation() {
        WeatherNotificationService weatherNotificationService = new WeatherNotificationService();
        User user1 = Mockito.mock(User.class);

        Location location1 = Mockito.mock(Location.class);
        Location location2 = Mockito.mock(Location.class);

        WeatherNotification notification = Mockito.mock(WeatherNotification.class);
        WeatherNotification notification1 = Mockito.mock(WeatherNotification.class);
        weatherNotificationService.addSubscriber(user1, location1);
        weatherNotificationService.addSubscriber(user1, location2);
        weatherNotificationService.removeSubscriptionFromLocation(user1, location1);

        weatherNotificationService.sendNotification(notification, location1);
        weatherNotificationService.sendNotification(notification1, location2);


        Mockito.verify(user1, Mockito.never()).receive(notification);
        Mockito.verify(user1, Mockito.times(1)).receive(notification1);

    }

    //Można wycofać subskrypcję ze wszystkich lokalizacji, co równa się kompletnemu wypisaniu klienta z powiadomień.
    @Test
    public void removeUserFromAllLocation() {
        WeatherNotificationService weatherNotificationService = new WeatherNotificationService();
        User user1 = Mockito.mock(User.class);
        User user2 = Mockito.mock(User.class);

        Location location1 = Mockito.mock(Location.class);
        Location location2 = Mockito.mock(Location.class);

        WeatherNotification notification = Mockito.mock(WeatherNotification.class);


        weatherNotificationService.addSubscriber(user1, location1);
        weatherNotificationService.addSubscriber(user2, location2);

        weatherNotificationService.unsubscribeUser(user1);
        weatherNotificationService.unsubscribeUser(user2);

        weatherNotificationService.sendNotification(notification, location1);
        weatherNotificationService.sendNotification(notification, location2);

        Mockito.verify(user1, Mockito.never()).receive(notification);
        Mockito.verify(user2, Mockito.never()).receive(notification);
    }

    @Test
    public void notSubscribedUserShouldNotReceiveWeatherNotification() {
        WeatherNotificationService weatherNotificationService = new WeatherNotificationService();
        User user = Mockito.mock(User.class);
        WeatherNotification notification = Mockito.mock(WeatherNotification.class);
        Location location = Mockito.mock(Location.class);

        weatherNotificationService.sendNotification(notification, location);
        Mockito.verify(user, Mockito.never()).receive(notification); //metoda receive nigdy nie będzie wywołana z argumentem notification
    }

    //Możliwość wysyłki powiadomienia do wszystkich.
    @Test
    public void subscribedUserShouldReceiveWeatherNotification() {
        WeatherNotificationService weatherNotificationService = new WeatherNotificationService();

        User user = Mockito.mock(User.class);
        WeatherNotification notification = Mockito.mock(WeatherNotification.class);
        Location location = Mockito.mock(Location.class);

        weatherNotificationService.addSubscriber(user, location);
        weatherNotificationService.sendNotification(notification, location);

        Mockito.verify(user, Mockito.times(1)).receive(notification);
    }


// Możliwość skasowania danej lokalizacji.

    @Test
    public void testRemoveLocation() {
        WeatherNotificationService weatherNotificationService = new WeatherNotificationService();
        User user1 = Mockito.mock(User.class);
        User user2 = Mockito.mock(User.class);

        Location location1 = Mockito.mock(Location.class);
        Location location2 = Mockito.mock(Location.class);

        WeatherNotification notification = Mockito.mock(WeatherNotification.class);

        weatherNotificationService.addSubscriber(user1, location1);
        weatherNotificationService.addSubscriber(user2, location2);

        weatherNotificationService.removeLocation(location1);
        weatherNotificationService.removeLocation(location2);


        weatherNotificationService.sendNotification(notification, location1);
        weatherNotificationService.sendNotification(notification, location2);

        Mockito.verify(user1, Mockito.never()).receive(notification);
        Mockito.verify(user2, Mockito.never()).receive(notification);
    }


    //Powiadomienie dla osób w danej lokalizacji powinno dotrzeć tylko do określonej grupy osób.
    @Test
    public void testWeatherNotificationForUserFromLocation() {
        WeatherNotificationService weatherNotificationService = new WeatherNotificationService();
        User user1 = Mockito.mock(User.class);
        User user2 = Mockito.mock(User.class);
        User user3 = Mockito.mock(User.class);

        Location location1 = Mockito.mock(Location.class);
        Location location2 = Mockito.mock(Location.class);

        WeatherNotification notification = Mockito.mock(WeatherNotification.class);


        weatherNotificationService.addSubscriber(user1, location1);
        weatherNotificationService.addSubscriber(user2, location1);
        weatherNotificationService.addSubscriber(user3, location2);


        weatherNotificationService.sendNotification(notification, location1);

        Mockito.verify(user1, Mockito.times(1)).receive(notification);
        Mockito.verify(user2, Mockito.times(1)).receive(notification);
        Mockito.verify(user3, Mockito.never()).receive(notification);
    }
}