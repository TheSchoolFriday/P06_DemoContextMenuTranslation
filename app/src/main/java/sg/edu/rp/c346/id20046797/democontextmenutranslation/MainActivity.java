package sg.edu.rp.c346.id20046797.democontextmenutranslation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvTranslatedText, tvTranslatedText2;

    String viewSelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTranslatedText = findViewById(R.id.textViewTranslatedText);
        tvTranslatedText2 = findViewById(R.id.textViewTranslatedText2);

        registerForContextMenu(tvTranslatedText);
        registerForContextMenu(tvTranslatedText2);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        Log.v("Context", "Context Created.");
        menu.add(0, 0, 0, "English");
        menu.add(0, 1, 1, "Italian");
        menu.add(0, 2, 2, "French");
        menu.add(0, 3, 3, "Malay");

        if (v == tvTranslatedText) {
            Log.v("Context", "Top View is Selected");
            viewSelected = "topTextView";
        } else {
            Log.v("Context", "Bottom View is Selected");
            viewSelected = "bottomTextView";
        }

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

          // This is the Teachers Method.

//        if (item.getItemId() == 0) {
//            tvTranslatedText.setText("Hello");
//            Toast.makeText(MainActivity.this, "English is Chosen", Toast.LENGTH_SHORT).show();
//        } else if (item.getItemId() == 1) {
//            tvTranslatedText.setText("Ciao");
//            Toast.makeText(MainActivity.this, "Italian is Chosen", Toast.LENGTH_SHORT).show();
//        } else if (item.getItemId() == 2) {
//            Toast.makeText(this, "French is Chosen", Toast.LENGTH_SHORT).show();
//        } else if (item.getItemId() == 3) {
//            Toast.makeText(this, "Malay is Chosen", Toast.LENGTH_SHORT).show();
//        }

        // My Preferred Method.

        if(viewSelected.equalsIgnoreCase("topTextView")) {
            switch (item.getItemId()) { // This is for the top Text View.
                case 0:
                    tvTranslatedText.setText("Hello");
                    Toast.makeText(MainActivity.this, "English is Chosen", Toast.LENGTH_SHORT).show();
                    break;
                case 1:
                    tvTranslatedText.setText("Ciao");
                    Toast.makeText(MainActivity.this, "Italian is Chosen", Toast.LENGTH_SHORT).show();
                    break;
                case 2:
                    tvTranslatedText.setText("Bonjour");
                    Toast.makeText(this, "French is Chosen", Toast.LENGTH_SHORT).show();
                    break;
                case 3:
                    tvTranslatedText.setText("Apa Khabar");
                    Toast.makeText(this, "Malay is Chosen", Toast.LENGTH_SHORT).show();
                    break;
            }
        } else if (viewSelected.equalsIgnoreCase("bottomTextView")) {
            switch (item.getItemId()) { // This is for the bottom Text View.
                case 0:
                    tvTranslatedText2.setText("Goodbye");
                    Toast.makeText(MainActivity.this, "English is Chosen", Toast.LENGTH_SHORT).show();
                    break;
                case 1:
                    tvTranslatedText2.setText("Addio");
                    Toast.makeText(MainActivity.this, "Italian is Chosen", Toast.LENGTH_SHORT).show();
                    break;
                case 2:
                    tvTranslatedText2.setText("Au Revoir");
                    Toast.makeText(this, "French is Chosen", Toast.LENGTH_SHORT).show();
                    break;
                case 3:
                    tvTranslatedText2.setText("Selamat");
                    Toast.makeText(this, "Malay is Chosen", Toast.LENGTH_SHORT).show();
                    break;
            }
        }

        return super.onContextItemSelected(item);
    }
}