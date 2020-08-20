package in.prali.one;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

import static android.content.Context.MODE_PRIVATE;

public class OneSharedPref {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    public OneSharedPref(Context context, String TableName) {
        sharedPreferences = context.getSharedPreferences(TableName, MODE_PRIVATE);
    }

    @SuppressLint("CommitPrefEdits")
    public void edit (){
        editor = sharedPreferences.edit();
    }

    public void remove(String field){
        editor.remove(field);
    }

    public void apply (){
        editor.apply();
    }

    public void addString (String FieldName, String InputValue){
        editor.putString(FieldName, InputValue);
    }

    public void addBoolean (String FieldName, Boolean InputValue){
        editor.putBoolean(FieldName, InputValue);
    }

    public String getString (String FieldName){
         return sharedPreferences.getString(FieldName, "");
    }

    public Boolean getBoolean (String FieldName){
        return sharedPreferences.getBoolean(FieldName, false);
    }
}
