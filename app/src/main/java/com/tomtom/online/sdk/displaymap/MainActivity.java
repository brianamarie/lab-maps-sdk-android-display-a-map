package com.tomtom.online.sdk.displaymap;

import com.tomtom.online.sdk.map.TomtomMap;
import com.tomtom.online.sdk.map.OnMapReadyCallback;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;

public class MainActivity extends AppCompatActivity
implements OnMapReadyCallback {
  private TomtomMap tomtomMap;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  @Override
  public void onMapReady(@NonNull final TomtomMap tomtomMap) {
    this.tomtomMap = tomtomMap;
}
}
