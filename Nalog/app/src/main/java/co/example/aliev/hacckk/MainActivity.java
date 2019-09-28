package co.example.aliev.hacckk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button begin_game = (Button) findViewById(R.id.button_begin_game);
        begin_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myView = new Intent(v.getContext(), ChooseDiffucultActivity.class);
                startActivityForResult(myView, 0);
            }
        });
        Button end_game = (Button)findViewById(R.id.button_game_exit);
        end_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });

        Button rules = (Button)findViewById(R.id.button_game_rules);



    }


}
