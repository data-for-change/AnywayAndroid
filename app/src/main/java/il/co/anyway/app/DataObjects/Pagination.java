package il.co.anyway.app.DataObjects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pagination {

    @SerializedName("totalAccidents")
    @Expose
    private Integer totalAccidents;
    @SerializedName("totalRSA")
    @Expose
    private Integer totalRSA;
    @SerializedName("totalRecords")
    @Expose
    private Integer totalRecords;

    public Integer getTotalAccidents() {
        return totalAccidents;
    }

    public void setTotalAccidents(Integer totalAccidents) {
        this.totalAccidents = totalAccidents;
    }

    public Integer getTotalRSA() {
        return totalRSA;
    }

    public void setTotalRSA(Integer totalRSA) {
        this.totalRSA = totalRSA;
    }

    public Integer getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
    }

}