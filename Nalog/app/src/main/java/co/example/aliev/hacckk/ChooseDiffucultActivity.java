package co.example.aliev.hacckk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import co.example.aliev.hacckk.R;

public class ChooseDiffucultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_diffucult);

        Button begin_game = (Button) findViewById(R.id.button_begin_game);
        begin_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myView = new Intent(v.getContext(), ChooseDiffucultActivity.class);
                startActivityForResult(myView, 0);
            }
        });
    }
}
