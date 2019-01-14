package il.co.anyway.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.List;

import il.co.anyway.app.DataObjects.MapMarker;
import il.co.anyway.app.DataObjects.Markers;
import il.co.anyway.app.Networking.GatDataAPI;
import il.co.anyway.app.Networking.RetrofitNetworkManager;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TestNetworkActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = TestNetworkActivity.class.getSimpleName();
    private CustomAdapter mAdapter;
    private RecyclerView mRecyclerView;
    private Button mButton;
    private ProgressBar mProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_network);
        mProgressBar = findViewById(R.id.progressbar);
        mButton = findViewById(R.id.start_button);
        mButton.setOnClickListener(this);

    }

    private void generateDataList(List<MapMarker> markerList) {
        mRecyclerView = findViewById(R.id.customRecyclerView);
        mAdapter = new CustomAdapter(markerList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.start_button:
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
                mProgressBar.setVisibility(View.VISIBLE);
                call.enqueue(new Callback<Markers>() {

                    @Override
                    public void onResponse(Call<Markers> call, Response<Markers> response) {
                        String responseBody = response.body().toString();
                        mProgressBar.setVisibility(View.GONE);
                        generateDataList(response.body().getMarkers());
                    }

                    @Override
                    public void onFailure(Call<Markers> call, Throwable t) {
                        mProgressBar.setVisibility(View.GONE);
                        Toast.makeText(getApplicationContext(), "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
                    }
                });
                break;
        }

    }
}
