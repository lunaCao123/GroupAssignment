package com.example.barbootcamp.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.example.barbootcamp.R;
import com.example.barbootcamp.fragments.TopicDetail1Fragment;
import com.example.barbootcamp.model.Topic;

import java.util.List;

import static java.security.AccessController.getContext;

public class TopicAdapter extends RecyclerView.Adapter<TopicAdapter.TopicViewHolder> {

    private List<Topic>topicsToAdapt;


    public void setTopicData(List<Topic>topicsToAdapt){
        this.topicsToAdapt = topicsToAdapt;
    }

    @NonNull
    @Override
    public TopicAdapter.TopicViewHolder onCreateViewHolder
            (@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.topic,parent,false);
        TopicViewHolder topicViewHolder = new TopicViewHolder(view);

        return topicViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TopicAdapter.TopicViewHolder holder, int position) {
        final Topic topicAtPosition = topicsToAdapt.get(position);

        holder.topicNameTextView.setText(topicAtPosition.getTopicName());
        holder.topicLevelTextView.setText(topicAtPosition.getLevel());
        holder.topicImageView.setImageResource(topicAtPosition.getImageDrawableId());
        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TopicDetail1Fragment topicDetail1Fragment = new TopicDetail1Fragment();
                Bundle bundle = new Bundle();
                bundle.putInt("no",topicAtPosition.getTopicNo());
                bundle.putString("id",topicAtPosition.getTopicID());
                topicDetail1Fragment.setArguments(bundle);

                ((FragmentActivity)v.getContext()).getSupportFragmentManager()
                        .beginTransaction().replace(R.id.fragmentMain_slot,
                        topicDetail1Fragment).commit();
            }
        });

    }

    @Override
    public int getItemCount() {
        return topicsToAdapt.size();
    }

    public class TopicViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView topicNameTextView;
        public ImageView topicImageView;
        public TextView topicLevelTextView;

        public TopicViewHolder(View v) {
            super(v);
            view = v;
            topicNameTextView = v.findViewById(R.id.topic_topicName);
            topicLevelTextView = v.findViewById(R.id.topic_topiclevel);
            topicImageView = v.findViewById(R.id.topic_imageView);
        }
    }
}
