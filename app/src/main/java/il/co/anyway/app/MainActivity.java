package il.co.anyway.app;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.List;

import il.co.anyway.app.DataObjects.MapMarker;
import il.co.anyway.app.DataObjects.Markers;
import il.co.anyway.app.Networking.GatDataAPI;
import il.co.anyway.app.Networking.RetrofitNetworkManager;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback, View.OnClickListener {

    private DrawerLayout mDrawerLayout;
    private GoogleMap mGoogleMap;
    private List<MapMarker> mMarkerList;
    private Marker mMyMarker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prepareToolbar();

        FloatingActionButton floatingActionButton = findViewById(R.id.floating_find_my_location_button);
        floatingActionButton.setOnClickListener(this);

        SupportMapFragment mapFragment =
                (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mGoogleMap = googleMap;
        mMyMarker = mGoogleMap.addMarker(new MarkerOptions().position(new LatLng( 32.071613, 34.795165 )).title("Marker"));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            mDrawerLayout.openDrawer(GravityCompat.START);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void prepareToolbar() {
        mDrawerLayout = findViewById(R.id.drawer_layout);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp);
            actionBar.setDisplayShowTitleEnabled(false);
        }
    }

    private void requestLocationPermissions() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.floating_find_my_location_button:
//                Intent intent = new Intent(this, TestNetworkActivity.class);
//                startActivity(intent);

              LatLng currentPoint =  mGoogleMap.getCameraPosition().target;
//          String zoom = String.valueOf(mGoogleMap.getCameraPosition().zoom);

                GatDataAPI service = RetrofitNetworkManager.getClient().create(GatDataAPI.class);

                // http://www.anyway.co.il/markers?ne_lat=32.06828054640345&ne_lng=34.777443297207355&sw_lat=32.06362514879965&sw_lng=34.77358058094978&zoom=17&thin_markers=false&start_date=1451599200&end_date=1501534800&format=json&show_markers=1&show_discussions=1&show_urban=3&show_intersection=3&show_lane=3&show_day=7&show_severe=1&show_fatal=1&show_light=1&show_inaccurate=1&start_date=01%2F01%2F2016&end_date=01%2F08%2F2017
                //https://www.anyway.co.il/markers?ne_lat=32.074933503710426&ne_lng=34.76937219500542&sw_lat=32.06562343302103&sw_lng=34.7616470977664&zoom=17&thin_markers=false&start_date=1451599200&end_date=1501534800&format=json&show_markers=1&show_discussions=1
                String ne_lat = "32.074933503710426";
                String ne_lng = "34.76937219500542";
                String sw_lat = "32.06562343302103";
                String sw_lng = "34.7616470977664";
                String zoom = "17";
                String thin_markers = "false";
                String start_date = "1451599200";
                String end_date = "1501534800";
                String format = "json";
                String show_markers = "1";
                String show_discussions = "1";

                Call<Markers> call = service.getAllMarkers(ne_lat, ne_lng, sw_lat, sw_lng, zoom, thin_markers, start_date, end_date, format, show_markers, show_discussions);
//                mProgressBar.setVisibility(View.VISIBLE);
                call.enqueue(new Callback<Markers>() {

                    @Override
                    public void onResponse(Call<Markers> call, Response<Markers> response) {
                        String responseBody = response.body().toString();
//                        mProgressBar.setVisibility(View.GONE);
//                        generateDataList(response.body().getMarkers());
                        mMarkerList = response.body().getMarkers();
                        for (MapMarker marker : mMarkerList){
                            mGoogleMap.addMarker(new MarkerOptions().position(new LatLng(marker.getLatitude(), marker.getLongitude())).title(marker.getAccident_severity().toString()));
                        }
                    }

                    @Override
                    public void onFailure(Call<Markers> call, Throwable t) {
//                        mProgressBar.setVisibility(View.GONE);
                        Toast.makeText(getApplicationContext(), "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
                    }
                });
                break;
        }
    }
}
