package com.example.barbootcamp.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.example.barbootcamp.R;
import com.example.barbootcamp.model.Topic;
import com.example.barbootcamp.model.TopicsDB;

public class TopicDetail3Fragment extends Fragment {
    private TextView detail3_topicName;
    private TextView detail3_topicDetail;
    private Button detail3_quizButton;
    private ImageView detail3_image;
    private int topicID;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        topicID = getArguments().getInt("id");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_topicdetail3, container, false);
        detail3_topicName = view.findViewById(R.id.topicDetail3_topicName);
        detail3_topicDetail = view.findViewById(R.id.topicDetail3_detail1Text);
        detail3_image = view.findViewById(R.id.topicDetail3_imageView);
        detail3_quizButton = view.findViewById(R.id.topicDetail3_quizBtn);
        final Topic topic = TopicsDB.getTopicById(topicID);

        detail3_topicName.setText(topic.getTopicName());
        detail3_topicDetail.setText(topic.getDetail2());
        detail3_image.setImageResource(topic.getImageDrawableId());
//        detail3_quizButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                TopicDetail3Fragment topicDetail3Fragment = new TopicDetail3Fragment();
//                Bundle bundle = new Bundle();
//                bundle.putInt("id", topic.getTopicID());
//                topicDetail3Fragment.setArguments(bundle);
//
//                ((FragmentActivity) v.getContext()).getSupportFragmentManager()
//                        .beginTransaction().replace(R.id.fragmentMain_slot,
//                        topicDetail3Fragment).commit();
//            }
//        });
        return view;

    }
}