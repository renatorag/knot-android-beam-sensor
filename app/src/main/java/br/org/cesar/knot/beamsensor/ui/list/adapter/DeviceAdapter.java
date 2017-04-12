package br.org.cesar.knot.beamsensor.ui.list.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import br.org.cesar.knot.beamsensor.R;
import br.org.cesar.knot.beamsensor.model.BeamSensor;

public class DeviceAdapter extends RecyclerView.Adapter<DeviceViewHolder> {

    private List<BeamSensor> beamSensors;
    private ItemClickListener mItemClickListener;

    public void setItemClickListener(ItemClickListener mItemClickListener) {
        this.mItemClickListener = mItemClickListener;
    }

    public void setData(List<BeamSensor> beamSensorList) {
        this.beamSensors = beamSensorList;
        notifyDataSetChanged();
    }


    @Override
    public DeviceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.beam_sensor_list_item, parent, false);


//        shotViewHolder.itemView.setOnClickListener(v -> {
//            final int position = shotViewHolder.getAdapterPosition();
//            if (position != RecyclerView.NO_POSITION && mItemClickListener != null) {
//                mItemClickListener.onClick(mShots.get(position));
//            }
//        });
        return new DeviceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DeviceViewHolder holder, int position) {
        final BeamSensor beamSensor = beamSensors.get(position);

    }

    @Override
    public int getItemCount() {
        return beamSensors.size();
    }


    public interface ItemClickListener {
        void onClick(BeamSensor shot);
    }


}
