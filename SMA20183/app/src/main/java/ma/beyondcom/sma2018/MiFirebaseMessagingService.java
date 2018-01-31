/*package ma.beyondcom.sma2018;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.NotificationCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by pc hp on 01/05/2017.

public class MiFirebaseMessagingService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Intent intent = new Intent(this,Notification.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        PendingIntent pi = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_ONE_SHOT);
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(this);
        // set notification properties
        notificationBuilder.setContentTitle("SMA2018"); //title of notification
        notificationBuilder.setContentText(remoteMessage.getNotification().getBody()); //in this method we pass extracted message to get actual message we pass parameter remotemessage which contain actual data.
        // tgetData returns the datatype of object that saves information in key value
        //to get value from our message we call method get with the key being message
       / notificationBuilder.setAutoCancel(true);
        notificationBuilder.setSmallIcon(R.mipmap.ic_app); // change notification icon
        notificationBuilder.setContentIntent(pi);
        NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(0, notificationBuilder.build());
    }
}
*/