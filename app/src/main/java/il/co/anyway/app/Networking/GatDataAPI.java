package il.co.anyway.app.Networking;

import il.co.anyway.app.DataObjects.Markers;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GatDataAPI {

    @GET("/markers")
    Call<Markers> getAllMarkers(@Query("ne_lat") String ne_lat,
                                @Query("ne_lng") String ne_lng,
                                @Query("sw_lat") String sw_lat,
                                @Query("sw_lng") String sw_lng,
                                @Query("zoom") String zoom,
                                @Query("thin_markers") String bool,
                                @Query("start_date") String start_date,
                                @Query("end_date") String end_date,
                                @Query("format") String json,
                                @Query("show_markers") String show_markers,
                                @Query("show_discussions") String discussions);
}
