package il.co.anyway.app;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

public class AnywayApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initLeakCanary();
    }

    private void initLeakCanary() {
        if (LeakCanary.isInAnalyzerProcess(this)) {
            return;
        }
        LeakCanary.install(this);
    }
}
