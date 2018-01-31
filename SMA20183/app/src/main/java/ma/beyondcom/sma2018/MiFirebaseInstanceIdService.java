/*package ma.beyondcom.sma2018;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by pc hp on 01/05/2017.


public class MiFirebaseInstanceIdService extends FirebaseInstanceIdService {
    private static final String registed_Token="registed_Token";
    @Override
    public void onTokenRefresh() {
        String  recent_token= FirebaseInstanceId.getInstance().getToken();

// get token from the server
        Log.d(registed_Token,recent_token); // show device token in Log cat View
/* If you want to send messages to this application instance or

succeed this application contributions on the server side, send the

Instance ID token to your app server.



        sendRegistrationToServer(recent_token);

    }

// this method is used to send token to your app server.

    private void sendRegistrationToServer(String token) {


}
}
        */