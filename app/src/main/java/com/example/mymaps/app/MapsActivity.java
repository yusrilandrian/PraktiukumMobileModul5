package com.example.mymaps.app;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney a nd move the camera
        LatLng smpn2tarakan = new LatLng(	3.3074, 	117.5867);
        mMap.addMarker(new MarkerOptions().position(smpn2tarakan).title("SMPN 2 Tarakan"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(smpn2tarakan));

        LatLng smpn1tarakan = new LatLng(	3.308, 	117.5959);
        mMap.addMarker(new MarkerOptions().position(smpn1tarakan).title("SMPN 1 Tarakan"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(smpn1tarakan));

        LatLng smpn3tarakan = new LatLng(	3.3061, 	117.6254);
        mMap.addMarker(new MarkerOptions().position(smpn3tarakan).title("SMPN 3 Tarakan"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(smpn3tarakan));

        LatLng smpn4tarakan = new LatLng(	3.3012, 	117.5883);
        mMap.addMarker(new MarkerOptions().position(smpn4tarakan).title("SMPN 4 Tarakan"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(smpn4tarakan));

        LatLng smpn5tarakan = new LatLng(	3.2948, 	117.5961);
        mMap.addMarker(new MarkerOptions().position(smpn5tarakan).title("SMPN 5 Tarakan"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(smpn5tarakan));
    }
}
