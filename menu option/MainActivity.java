package com.example.androidpro;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // Inflate the menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }
    // Handle menu item clicks
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            Toast.makeText(this, "Settings Selected",
                    Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.action_about) {
            Toast.makeText(this, "About Selected", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.action_exit) {
            finish(); // Close the app
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}



// Step 1: Create empty views application

// Step 2: Create the Menu XML File
//      Go to: res/menu/
//      IF the menu folder doesn’t exist, create it.
//      Create a new file: menu_main.xml

// Step 4: Update themes.xml
//         Go to: res/values/themes.xml
//         Modify the parent theme to enable the action bar:
//      <style name="Theme.MyApp" parent="Theme.MaterialComponents.Light.DarkActionBar">

// Step 5: Go to: AndroidManifest.xml
//      correct code in AndroidManifest.xml file.
//      <application android:theme="@style/Theme.MyApp">

// Step 6: Run the app
