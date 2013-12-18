package com.demo.hello;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    protected static final String TAG = MainActivity.class.getName();
	private EditText editText;
	private Button buttonSubmit;


	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        editText = (EditText) findViewById(R.id.editText);
        buttonSubmit = (Button) findViewById(R.id.buttonSubmmit);
        
        buttonSubmit.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Toast.makeText(MainActivity.this, editText.getText().toString(), Toast.LENGTH_LONG).show();
				Log.d(TAG,editText.getText().toString());
			}
        	
        } );
    } 


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }


	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch(item.getItemId()){
			case R.id.main:
				startActivity(new Intent(this,MainActivity.class));
				break;
			case R.id.second:
				startActivity(new Intent(this, SecondActivity.class));
				break;
		}
		return true;
	}
    
    
    
}
