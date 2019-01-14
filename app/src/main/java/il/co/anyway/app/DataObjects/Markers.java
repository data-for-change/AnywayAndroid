package il.co.anyway.app.DataObjects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Markers {

    @SerializedName("markers")
    @Expose
    private List<MapMarker> markers = null;
    @SerializedName("pagination")
    @Expose
    private Pagination pagination;

    public List<MapMarker> getMarkers() {
        return markers;
    }

    public void setMarkers(List<MapMarker> markers) {
        this.markers = markers;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

}
