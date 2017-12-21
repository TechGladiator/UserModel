package gladiator.tech.usermodel.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import gladiator.tech.usermodel.R;

public class MainActivity extends AppCompatActivity {
    private EditText username;
    private EditText realName;
    private EditText age;
    private EditText gender;
    private EditText location;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        realName = findViewById(R.id.realName);
        age = findViewById(R.id.age);
        gender = findViewById(R.id.gender);
        location = findViewById(R.id.location);
        submitButton = findViewById(R.id.submitButton);

    }
}
