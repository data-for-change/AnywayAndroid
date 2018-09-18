package il.co.anyway.app.DataObjects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MapMarker {

    @SerializedName("address")
    @Expose
    private Object address;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("cross_direction")
    @Expose
    private Object crossDirection;
    @SerializedName("cross_location")
    @Expose
    private Object crossLocation;
    @SerializedName("cross_mode")
    @Expose
    private Object crossMode;
    @SerializedName("dayType")
    @Expose
    private Object dayType;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("didnt_cross")
    @Expose
    private Object didntCross;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("intactness")
    @Expose
    private Object intactness;
    @SerializedName("junction")
    @Expose
    private Object junction;
    @SerializedName("km")
    @Expose
    private Object km;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("locationAccuracy")
    @Expose
    private Integer locationAccuracy;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    @SerializedName("mainStreet")
    @Expose
    private Object mainStreet;
    @SerializedName("multi_lane")
    @Expose
    private Object multiLane;
    @SerializedName("object_distance")
    @Expose
    private Object objectDistance;
    @SerializedName("one_lane")
    @Expose
    private Object oneLane;
    @SerializedName("provider_code")
    @Expose
    private Integer providerCode;
    @SerializedName("road1")
    @Expose
    private Object road1;
    @SerializedName("road2")
    @Expose
    private Object road2;
    @SerializedName("roadShape")
    @Expose
    private Object roadShape;
    @SerializedName("roadType")
    @Expose
    private Object roadType;
    @SerializedName("road_control")
    @Expose
    private Object roadControl;
    @SerializedName("road_light")
    @Expose
    private Object roadLight;
    @SerializedName("road_object")
    @Expose
    private Object roadObject;
    @SerializedName("road_sign")
    @Expose
    private Object roadSign;
    @SerializedName("road_surface")
    @Expose
    private Object roadSurface;
    @SerializedName("road_width")
    @Expose
    private Object roadWidth;
    @SerializedName("secondaryStreet")
    @Expose
    private Object secondaryStreet;
    @SerializedName("severity")
    @Expose
    private Integer severity;
    @SerializedName("speed_limit")
    @Expose
    private Object speedLimit;
    @SerializedName("subtype")
    @Expose
    private Object subtype;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("type")
    @Expose
    private Integer type;
    @SerializedName("unit")
    @Expose
    private Object unit;
    @SerializedName("video_link")
    @Expose
    private Object videoLink;
    @SerializedName("weather")
    @Expose
    private Object weather;
    @SerializedName("identifier")
    @Expose
    private String identifier;

    public Object getAddress() {
        return address;
    }

    public void setAddress(Object address) {
        this.address = address;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public Object getCrossDirection() {
        return crossDirection;
    }

    public void setCrossDirection(Object crossDirection) {
        this.crossDirection = crossDirection;
    }

    public Object getCrossLocation() {
        return crossLocation;
    }

    public void setCrossLocation(Object crossLocation) {
        this.crossLocation = crossLocation;
    }

    public Object getCrossMode() {
        return crossMode;
    }

    public void setCrossMode(Object crossMode) {
        this.crossMode = crossMode;
    }

    public Object getDayType() {
        return dayType;
    }

    public void setDayType(Object dayType) {
        this.dayType = dayType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getDidntCross() {
        return didntCross;
    }

    public void setDidntCross(Object didntCross) {
        this.didntCross = didntCross;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getIntactness() {
        return intactness;
    }

    public void setIntactness(Object intactness) {
        this.intactness = intactness;
    }

    public Object getJunction() {
        return junction;
    }

    public void setJunction(Object junction) {
        this.junction = junction;
    }

    public Object getKm() {
        return km;
    }

    public void setKm(Object km) {
        this.km = km;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Integer getLocationAccuracy() {
        return locationAccuracy;
    }

    public void setLocationAccuracy(Integer locationAccuracy) {
        this.locationAccuracy = locationAccuracy;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Object getMainStreet() {
        return mainStreet;
    }

    public void setMainStreet(Object mainStreet) {
        this.mainStreet = mainStreet;
    }

    public Object getMultiLane() {
        return multiLane;
    }

    public void setMultiLane(Object multiLane) {
        this.multiLane = multiLane;
    }

    public Object getObjectDistance() {
        return objectDistance;
    }

    public void setObjectDistance(Object objectDistance) {
        this.objectDistance = objectDistance;
    }

    public Object getOneLane() {
        return oneLane;
    }

    public void setOneLane(Object oneLane) {
        this.oneLane = oneLane;
    }

    public Integer getProviderCode() {
        return providerCode;
    }

    public void setProviderCode(Integer providerCode) {
        this.providerCode = providerCode;
    }

    public Object getRoad1() {
        return road1;
    }

    public void setRoad1(Object road1) {
        this.road1 = road1;
    }

    public Object getRoad2() {
        return road2;
    }

    public void setRoad2(Object road2) {
        this.road2 = road2;
    }

    public Object getRoadShape() {
        return roadShape;
    }

    public void setRoadShape(Object roadShape) {
        this.roadShape = roadShape;
    }

    public Object getRoadType() {
        return roadType;
    }

    public void setRoadType(Object roadType) {
        this.roadType = roadType;
    }

    public Object getRoadControl() {
        return roadControl;
    }

    public void setRoadControl(Object roadControl) {
        this.roadControl = roadControl;
    }

    public Object getRoadLight() {
        return roadLight;
    }

    public void setRoadLight(Object roadLight) {
        this.roadLight = roadLight;
    }

    public Object getRoadObject() {
        return roadObject;
    }

    public void setRoadObject(Object roadObject) {
        this.roadObject = roadObject;
    }

    public Object getRoadSign() {
        return roadSign;
    }

    public void setRoadSign(Object roadSign) {
        this.roadSign = roadSign;
    }

    public Object getRoadSurface() {
        return roadSurface;
    }

    public void setRoadSurface(Object roadSurface) {
        this.roadSurface = roadSurface;
    }

    public Object getRoadWidth() {
        return roadWidth;
    }

    public void setRoadWidth(Object roadWidth) {
        this.roadWidth = roadWidth;
    }

    public Object getSecondaryStreet() {
        return secondaryStreet;
    }

    public void setSecondaryStreet(Object secondaryStreet) {
        this.secondaryStreet = secondaryStreet;
    }

    public Integer getSeverity() {
        return severity;
    }

    public void setSeverity(Integer severity) {
        this.severity = severity;
    }

    public Object getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(Object speedLimit) {
        this.speedLimit = speedLimit;
    }

    public Object getSubtype() {
        return subtype;
    }

    public void setSubtype(Object subtype) {
        this.subtype = subtype;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Object getUnit() {
        return unit;
    }

    public void setUnit(Object unit) {
        this.unit = unit;
    }

    public Object getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(Object videoLink) {
        this.videoLink = videoLink;
    }

    public Object getWeather() {
        return weather;
    }

    public void setWeather(Object weather) {
        this.weather = weather;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}