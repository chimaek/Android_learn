package max.com;

import android.app.Application;
import android.content.Context;

public class MainApplication extends Application {
    private static Context context;

    public static Context getAppContext() {
        return context;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        context = getAppContext();
    }
}
