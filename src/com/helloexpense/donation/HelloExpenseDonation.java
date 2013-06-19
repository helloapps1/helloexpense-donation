package com.helloexpense.donation;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class HelloExpenseDonation extends Activity {

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    setContentView(R.layout.main);
  }

  @SuppressWarnings("UnusedDeclaration")
  public void onExitButtonClicked(View v) {
    finish();
  }

  @SuppressWarnings("UnusedDeclaration")
  public void onDownloadButtonClicked(View v) {
    startActivity(new Intent(Intent.ACTION_VIEW,
        Uri.parse("market://details?id=com.helloexpense")));
  }
}
