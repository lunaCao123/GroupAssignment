package com.example.barbootcamp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.barbootcamp.R;
import com.example.barbootcamp.model.Topic;
import com.example.barbootcamp.model.TopicsDB;

public class TopicDetail1Fragment extends Fragment {
   private TextView detail_topicName;
   private TextView detail_topicDetail1;
   private ImageView detail_topicImage;
   private ImageButton detail_nextButton;
   private int topicID;

   @Override
    public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       topicID = getArguments().getInt("id");

   }

   @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
       View view = inflater.inflate(R.layout.fragment_topicdetail1, container, false);
       detail_topicName = view.findViewById(R.id.topicDetail_topicName);
       detail_topicDetail1 = view. findViewById(R.id.topicDetail_detail1Text);
       detail_topicImage = view.findViewById(R.id.topicDetail_imageView);
       detail_nextButton = view.findViewById(R.id.topicDetail_nextButton);
       Topic topic = TopicsDB.getTopicById(topicID);

       detail_topicName.setText(topic.getTopicName());
       detail_topicDetail1.setText(topic.getDetail1());
       detail_topicImage.setImageResource(topic.getImageDrawableId());
       detail_nextButton.setImageResource(R.drawable.ic_arrow_forward_gold);
       return view;

   }



}
