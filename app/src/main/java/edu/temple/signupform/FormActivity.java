package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtView;
        final TextView email;
        final TextView username;
        final TextView password;
        final TextView confirmPW;
        Button button;


        email = findViewById(R.id.textViewEmail);
        username = findViewById(R.id.txtViewUserName);
        password = findViewById(R.id.textViewPW);
        confirmPW = findViewById(R.id.textViewPWConfirm);
        button = findViewById(R.id.btnSave);


        /*button.setOnClickListener(new View.OnClickListener(){

                                  } */
        View.OnClickListener ocl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (email.getText().equals("")) {
                    Toast.makeText(FormActivity.this, "Please enter an email", Toast.LENGTH_LONG).show();
                } else if (username.getText().equals("")) {
                    Toast.makeText(FormActivity.this, "Please enter a valid username", Toast.LENGTH_LONG).show();
                } else if (password.getText().equals("")) {
                    Toast.makeText(FormActivity.this, "Please enter a password", Toast.LENGTH_LONG).show();
                } else if (confirmPW.getText() != password.getText() && confirmPW.getText()!= "") {
                    Toast.makeText(FormActivity.this, "Error passwords don't match", Toast.LENGTH_LONG).show();
                }
                

            }
        };

        button.setOnClickListener(ocl);

    }

    private class onClickListener {
    }
}
