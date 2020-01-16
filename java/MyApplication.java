import android.app.Application;

import com.google.android.gms.ads.MobileAds;
import com.vaibhav.lakshya.miet.R;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        MobileAds.initialize(this, getString(R.string.admob_app_id));
    }
}
