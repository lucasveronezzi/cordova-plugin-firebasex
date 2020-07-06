package org.apache.cordova.firebase;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public interface FirebasePluginHandlerInterface {
  public void onMessageReceived(RemoteMessage remoteMessage, FirebaseMessagingService service);
}
