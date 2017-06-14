package ghatnandurkar.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements TextView.OnClickListener {

    private EditText editText;
    private TextView txtShowName;
    private Button btnClickme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // find views by ID
        editText= (EditText) findViewById(R.id.editTxt);
        txtShowName= (TextView) findViewById(R.id.txtShowName);
        btnClickme= (Button) findViewById(R.id.btnClickMe);

        // set onlick listeners
        btnClickme.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnClickMe:
                // do onclick logic here

                break;
        }
    }
}
