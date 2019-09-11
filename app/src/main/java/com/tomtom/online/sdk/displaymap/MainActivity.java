package com.tomtom.online.sdk.displaymap;

import com.tomtom.online.sdk.map.TomtomMap;
// Add here the OnMapReadyCallback import
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
// Add here the NonNull import



public class MainActivity extends AppCompatActivity
// Implement here the MainActivity with OnMapReadyCallback
{
  private TomtomMap tomtomMap;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  // Add here the onMapReady callback
}
