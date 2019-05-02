// Copyright © 2016-2018 Shawn Baker using the MIT License.
package ml.ajwad.findlyfcamera.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
import android.widget.TextView;

import ca.frozen.library.classes.Log;
import ml.ajwad.findlyfcamera.classes.Utils;

public class HelpActivity extends AppCompatActivity
{
	//******************************************************************************
	// onCreate
	//******************************************************************************
    @Override
    protected void onCreate(Bundle savedInstanceState)
	{
		// configure the activity
        super.onCreate(savedInstanceState);
		setContentView(ml.ajwad.findlyfcamera.R.layout.activity_help);

		// initialize the logger
		Utils.initLogFile(getClass().getSimpleName());

		// set the views
		TextView text = findViewById(ml.ajwad.findlyfcamera.R.id.help_info);
		text.setMovementMethod(LinkMovementMethod.getInstance());
	}

	//******************************************************************************
	// onOptionsItemSelected
	//******************************************************************************
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
	{
        if (item.getItemId() == android.R.id.home)
		{
			Log.info("finish");
			this.finish();
			return true;
		}
		return super.onOptionsItemSelected(item);
    }
}
