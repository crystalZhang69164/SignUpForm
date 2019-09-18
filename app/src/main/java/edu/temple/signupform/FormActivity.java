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

        //TextView txtView;

        Button button;


        final TextView email = findViewById(R.id.editTextEmail);
        final TextView username = findViewById(R.id.editTextUsername);
        final TextView password = findViewById(R.id.editTextPassword);
        final TextView confirmPW = findViewById(R.id.editTextConfirmPass);
        button = findViewById(R.id.btnSave);


        /*button.setOnClickListener(new View.OnClickListener(){

                                  } */
        View.OnClickListener ocl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if email is blank
                if (email.getText().toString().equals("")) {
                    Toast.makeText(FormActivity.this, "Please enter an email", Toast.LENGTH_LONG).show();
                }
                //if username is blank
                else if (username.getText().equals("")) {
                    Toast.makeText(FormActivity.this, "Please enter a valid username", Toast.LENGTH_LONG).show();
                }
                //if password is blank
                else if (password.getText().toString().equals("")) {
                    Toast.makeText(FormActivity.this, "Please enter a password", Toast.LENGTH_LONG).show();
                }
                //if password doesn't = confirm password
                else if (!password.getText().toString().equals(confirmPW.getText().toString())) {
                    Toast.makeText(FormActivity.this, "Error passwords don't match", Toast.LENGTH_LONG).show();
                }
                else{
                    //lets user know they have signed up
                    Toast.makeText(FormActivity.this,"Welcome " + username.getText() + " you have signed up!",Toast.LENGTH_LONG).show();
                }


            }
        };

        button.setOnClickListener(ocl);

    }


}
