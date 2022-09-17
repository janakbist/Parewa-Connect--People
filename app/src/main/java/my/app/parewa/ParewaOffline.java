package my.app.parewa;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

public class ParewaOffline extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}
