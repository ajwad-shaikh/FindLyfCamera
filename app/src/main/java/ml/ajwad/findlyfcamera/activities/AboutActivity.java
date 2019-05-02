// Copyright © 2016-2018 Shawn Baker using the MIT License.
package ml.ajwad.findlyfcamera.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import ca.frozen.library.classes.Log;
import ml.ajwad.findlyfcamera.BuildConfig;
import ml.ajwad.findlyfcamera.classes.Utils;

public class AboutActivity extends AppCompatActivity
{
	//******************************************************************************
	// onCreate
	//******************************************************************************
    @Override
    protected void onCreate(Bundle savedInstanceState)
	{
		// configure the activity
        super.onCreate(savedInstanceState);
		setContentView(ml.ajwad.findlyfcamera.R.layout.activity_about);

		// initialize the logger
		Utils.initLogFile(getClass().getSimpleName());

		// set the views
		ImageView icon = findViewById(ml.ajwad.findlyfcamera.R.id.about_icon);
		icon.setImageResource(ml.ajwad.findlyfcamera.R.drawable.logo);

		TextView text = findViewById(ml.ajwad.findlyfcamera.R.id.about_title);
		text.setText(getString(ml.ajwad.findlyfcamera.R.string.app_name));

		text = findViewById(ml.ajwad.findlyfcamera.R.id.about_version);
		text.setText(String.format(getString(ml.ajwad.findlyfcamera.R.string.version), BuildConfig.VERSION_NAME));

		text = findViewById(ml.ajwad.findlyfcamera.R.id.about_license);
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
