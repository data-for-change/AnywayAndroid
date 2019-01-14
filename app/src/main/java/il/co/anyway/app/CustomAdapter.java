package il.co.anyway.app;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import il.co.anyway.app.DataObjects.MapMarker;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    private List<MapMarker> mMarkerList;

    public CustomAdapter(List<MapMarker> dataList) {
        this.mMarkerList = dataList;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {

        public final View mView;
        public TextView mTextView;

        CustomViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            mTextView = mView.findViewById(R.id.title);
        }
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.custom_row, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        StringBuilder sb = new StringBuilder();
        sb.append("Title: ").append(mMarkerList.get(position).getTitle()).append("\n")
                .append("Description: ").append(mMarkerList.get(position).getDescription()).append("\n")
                .append("Address: ").append(mMarkerList.get(position).getAddress()).append("\n")
                .append("Created: ").append(mMarkerList.get(position).getCreated()).append("\n")
                .append("Severity: ").append(mMarkerList.get(position).getAccident_severity()).append("\n");
        holder.mTextView.setText(sb.toString());
    }

    @Override
    public int getItemCount() {
        return mMarkerList.size();
    }
}