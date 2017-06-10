package example.com.preferencesexample;

import android.os.Bundle;
import android.preference.PreferenceActivity;


/**
 * Created by HPWorld on 6/10/2017.
 */

public class UserSettingActivity extends PreferenceActivity {
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        // add the xml resource
        addPreferencesFromResource(R.xml.user_settings);


    }


}
