package projects.android.my.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Notification notification = new NotificationCompat.Builder(this)
                .setColor(Color.RED)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentText("Context Text")
                .setContentTitle("Content Title")
                .setStyle(new NotificationCompat.BigTextStyle().bigText("Welcome to the BIGGGGGGGGGGGGGGGGGGGGGG Expandable notification"))
                .build();

        NotificationManager manager  = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        manager.notify(100,notification);
    }
}