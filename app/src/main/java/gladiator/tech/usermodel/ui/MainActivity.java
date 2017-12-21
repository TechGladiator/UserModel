package gladiator.tech.usermodel.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import gladiator.tech.usermodel.R;

public class MainActivity extends AppCompatActivity {
    private EditText mUsername;
    private EditText mRealName;
    private EditText mAge;
    private EditText mGender;
    private EditText mLocation;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUsername = findViewById(R.id.username);
        mRealName = findViewById(R.id.realName);
        mAge = findViewById(R.id.age);
        mGender = findViewById(R.id.gender);
        mLocation = findViewById(R.id.location);
        submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = mUsername.getText().toString();
                String realName = mRealName.getText().toString();
                int age = Integer.parseInt(mAge.getText().toString());
                String gender = mGender.getText().toString();
                String location = mLocation.getText().toString();
            }
        });

    }
}
