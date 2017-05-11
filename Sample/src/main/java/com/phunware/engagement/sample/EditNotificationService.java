package com.phunware.engagement.sample;

        import android.media.RingtoneManager;
        import android.support.v4.app.NotificationCompat;

        import com.phunware.engagement.messages.services.NotificationCustomizationService;

public class EditNotificationService extends NotificationCustomizationService {

    @Override
    public void editNotification(NotificationCompat.Builder notificationBuilder) {
        // Use the default notification sound for all notifications
        notificationBuilder
                .setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION))
                .setSmallIcon(R.drawable.ic_motorcycle_black_24dp);
    }

}

