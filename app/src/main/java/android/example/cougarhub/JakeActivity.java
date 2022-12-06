package android.example.cougarhub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JakeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jakepage);

        Button BackButton = (Button) findViewById(R.id.backtologinbutton);
        BackButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                BackToLogin();
            }
        });
    }
    public void BackToLogin() {
        setContentView(R.layout.loginpage);
    }
}