package com.zafaralam.thenewboston;

import android.app.Activity;
import android.content.Intent;
//import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity {
	
	//MediaPlayer ourSong;
	
	@Override
	protected void onCreate(Bundle zafarActivity) {
		// TODO Auto-generated method stub
		super.onCreate(zafarActivity);
		setContentView(R.layout.splash);
		//ourSong = MediaPlayer.create(Splash.this, R.raw.start_song);
		//ourSong.start();
		Thread timer = new Thread(){
			public void run() {
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					Intent menu = new Intent("com.zafaralam.thenewboston.MENU");
					startActivity(menu);
					
				}
			}
		};
		timer.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		//ourSong.release();
		finish();
	}
	
	

}
