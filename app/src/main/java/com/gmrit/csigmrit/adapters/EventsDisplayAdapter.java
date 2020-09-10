package com.gmrit.csigmrit.adapters;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gmrit.csigmrit.R;
import com.gmrit.csigmrit.activities.events.EventRegistrationActivity;
import com.gmrit.csigmrit.modals.EventData;

import java.util.List;

public class EventsDisplayAdapter extends RecyclerView.Adapter<EventsDisplayAdapter.ViewHolder> {

    Context context;
    List<EventData> eventDataList;

    public EventsDisplayAdapter(Context context, List<EventData> eventDataList) {
        this.context = context;
        this.eventDataList = eventDataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.event_display_card, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        holder.eventImageLayout.setBackgroundResource(eventDataList.get(position).getEventImage());
        holder.txtEventName.setText(eventDataList.get(position).getEventName());
        holder.txtEventDescription.setText(eventDataList.get(position).getEventDescription());
        holder.txtEventType.setText(eventDataList.get(position).getEventType());
        holder.txtDateTime.setText(eventDataList.get(position).getEventDateTime());

        holder.eventWholeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, EventRegistrationActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("eventName",eventDataList.get(position).getEventName());
                bundle.putString("eventDateTime",eventDataList.get(position).getEventDateTime());
                bundle.putInt("eventImage",eventDataList.get(position).getEventImage());
                intent.putExtras(bundle);
                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return eventDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        RelativeLayout eventImageLayout, eventWholeLayout;
        TextView txtDateTime, txtEventType, txtEventName, txtEventDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            eventWholeLayout = itemView.findViewById(R.id.eventWholeLayout);
            eventImageLayout = itemView.findViewById(R.id.relativeLayout);
            txtDateTime = itemView.findViewById(R.id.dateTime);
            txtEventType = itemView.findViewById(R.id.eventType);
            txtEventName = itemView.findViewById(R.id.eventName);
            txtEventDescription = itemView.findViewById(R.id.eventDescription);

        }
    }
}
