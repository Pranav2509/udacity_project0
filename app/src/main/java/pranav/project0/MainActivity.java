package pranav.project0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button popular_music_button, stock_hawk_button,
            build_it_bigger_button, make_your_app_material_button, go_ubiquitous_button, capstone_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        popular_music_button = (Button) findViewById(R.id.popular_music_button);
        popular_music_button.setOnClickListener(this);
        stock_hawk_button = (Button) findViewById(R.id.stock_hawk_button);
        stock_hawk_button.setOnClickListener(this);
        build_it_bigger_button = (Button) findViewById(R.id.build_it_bigger_button);
        build_it_bigger_button.setOnClickListener(this);
        make_your_app_material_button = (Button) findViewById(R.id.make_your_app_material_button);
        make_your_app_material_button.setOnClickListener(this);
        go_ubiquitous_button = (Button) findViewById(R.id.go_ubiquitous_button);
        go_ubiquitous_button.setOnClickListener(this);
        capstone_button = (Button) findViewById(R.id.capstone_button);
        capstone_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.popular_music_button :
                Toast.makeText(MainActivity.this, "This button will open popular music app", Toast.LENGTH_SHORT).show();
                break;

            case R.id.stock_hawk_button :
                Toast.makeText(MainActivity.this, "This button will open stock hawk app", Toast.LENGTH_SHORT).show();
                break;

            case R.id.build_it_bigger_button :
                Toast.makeText(MainActivity.this, "This button will open build it bigger app", Toast.LENGTH_SHORT).show();
                break;

            case R.id.make_your_app_material_button :
                Toast.makeText(MainActivity.this, "This button will open make your app material app", Toast.LENGTH_SHORT).show();
                break;

            case R.id.go_ubiquitous_button :
                Toast.makeText(MainActivity.this, "This button will open go ubiquitous app", Toast.LENGTH_SHORT).show();
                break;

            case R.id.capstone_button :
                Toast.makeText(MainActivity.this, "This button will open capstone app", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
