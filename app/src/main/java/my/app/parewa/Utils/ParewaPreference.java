package my.app.parewa.Utils;

import android.content.Context;
import android.content.SharedPreferences;

public class ParewaPreference {
    private String PREF_NAME = "parewa_name";
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor mEditor;

    private static final String USER_ID_KEY = "user_id";

    public ParewaPreference(Context ctx) {
        sharedPreferences = ctx.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
    }

    public void saveUserID(String userId) {
        mEditor = sharedPreferences.edit();
        mEditor.putString(USER_ID_KEY, userId);
        mEditor.apply();
    }

    public String getUserId(){
      return sharedPreferences.getString(USER_ID_KEY,null);
    }
}
