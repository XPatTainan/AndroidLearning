package com.demo.yamba;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Button;
import winterwell.jtwitter.Twitter;

public class MainActivity extends Activity implements OnClickListener{

    private static final String TAG = "StatusActivity";
    EditText editText;
    Button updateButton;
    Twitter twitter;


	@SuppressWarnings("deprecation")
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.status);
        Log.d(TAG,"123");
        editText=(EditText) findViewById(R.id.editText);
        updateButton = (Button) findViewById(R.id.buttonUpdate);
        updateButton.setOnClickListener(this);
        twitter = new Twitter("student","password");
        twitter.setAPIRootUrl("http://yamba.demo.com/api");
    }


	@Override
	public void onClick(View v) {
		twitter.setStatus(editText.getText().toString());
		Log.d(TAG,"onClicked");
		
	}
    
}
