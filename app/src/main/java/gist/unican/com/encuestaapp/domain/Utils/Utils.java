package gist.unican.com.encuestaapp.domain.Utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;

import gist.unican.com.encuestaapp.R;

/**
 * Created by andres on 08/05/2017.
 */

public class Utils {
    public Utils() {
    }

    public static void saveUserInPreference(Context context, String token, String username) {
        SharedPreferences sharedPref = context.getSharedPreferences(
                context.getString(R.string.preference_file_key), Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(context.getString(R.string.PREFERENCES_TOKEN), encrypt(token));
        editor.putString(context.getString(R.string.PREFERENCES_USER), encrypt(username));
        long time = System.currentTimeMillis();
        long expiration_time = time + 604800000;
        editor.putString(context.getString(R.string.PREFERENCES_EXPIRATION), encrypt(String.valueOf(expiration_time)));
        editor.commit();
    }

    public static String getUserFromPreference(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(
                context.getString(R.string.preference_file_key), Context.MODE_PRIVATE);

        return decrypt(sharedPref.getString(context.getString(R.string.PREFERENCES_USER), null));
    }

    public static void saveLastSyncInPreference(Context context, String time) {
        SharedPreferences sharedPref = context.getSharedPreferences(
                context.getString(R.string.preference_file_key), Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(context.getString(R.string.PREFERENCES_TIME_LAST_SYNC), time);
        editor.commit();
    }

    public static String getLastSyncFromPreference(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(
                context.getString(R.string.preference_file_key), Context.MODE_PRIVATE);

        return sharedPref.getString(context.getString(R.string.PREFERENCES_TIME_LAST_SYNC), null);
    }
    public static void saveLineInPreferences(Context context, String time) {
        SharedPreferences sharedPref = context.getSharedPreferences(
                context.getString(R.string.preference_file_key), Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(context.getString(R.string.PREFERENCES_BUS_LINE), time);
        editor.commit();
    }

    public static String getBusLineFromPreferences(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(
                context.getString(R.string.preference_file_key), Context.MODE_PRIVATE);

        return sharedPref.getString(context.getString(R.string.PREFERENCES_BUS_LINE), null);
    }

    public static String getMotivoViaje(Context context, int category) {
        switch (category) {
            case 1:
                return context.getString(R.string.motivo_casa);
            case 2:
                return context.getString(R.string.motivo_trabajo);
            case 3:
                return context.getString(R.string.motivo_estudios);
            case 4:
                return context.getString(R.string.motivo_sanidad);
            case 5:
                return context.getString(R.string.motivo_compras);
            case 6:
                return context.getString(R.string.motivo_ocio);
            case 7:
                return context.getString(R.string.motivo_otros);
            default:
                throw new IllegalArgumentException("Invalid category");
        }

    }


    public static String encrypt(String input) {
        // Simple encryption, not very strong!
        return Base64.encodeToString(input.getBytes(), Base64.DEFAULT);
    }

    public static String decrypt(String input) {
        return new String(Base64.decode(input, Base64.DEFAULT));
    }
}
