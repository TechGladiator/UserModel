package gladiator.tech.usermodel.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import gladiator.tech.usermodel.R;
import gladiator.tech.usermodel.model.DisplayDataActivity;

public class MainActivity extends AppCompatActivity {
    private EditText mUsername;
    private EditText mRealName;
    private EditText mAge;
    private EditText mGender;
    private EditText mLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUsername = findViewById(R.id.username);
        mRealName = findViewById(R.id.realName);
        mAge = findViewById(R.id.age);
        mGender = findViewById(R.id.gender);
        mLocation = findViewById(R.id.location);
        Button submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = mUsername.getText().toString();
                String realName = mRealName.getText().toString();
                String age = mAge.getText().toString();
                String gender = mGender.getText().toString();
                String location = mLocation.getText().toString();

                String[] userInfo = { username, realName, age, gender, location };

                showData(userInfo);
            }
        });

    }

    private void showData(String[] userInfo) {
        Intent intent = new Intent(this, DisplayDataActivity.class);
        Resources resources = getResources();
        String key = getString(R.string.key_name);
        intent.putExtra(key, userInfo);
        startActivity(intent);
    }
}
