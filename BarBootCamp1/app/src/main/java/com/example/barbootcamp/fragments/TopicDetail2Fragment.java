package com.example.barbootcamp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.example.barbootcamp.R;
import com.example.barbootcamp.model.Topic;
import com.example.barbootcamp.model.TopicsDB;

public class TopicDetail2Fragment extends Fragment {
    private TextView detail2_topicName;
    private TextView detail2_topicDetail;
    private ImageButton detail2_nextButton;
    private ImageView detail2_image;
    private int topicID;

    public TopicDetail2Fragment(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        topicID = getArguments().getInt("id");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_topicdetail2, container, false);
        detail2_topicName = view.findViewById(R.id.topicDetail2_topicName);
        detail2_topicDetail = view. findViewById(R.id.topicDetail2_detail1Text);
        detail2_image = view.findViewById(R.id.topicDetail2_imageView);
        detail2_nextButton = view.findViewById(R.id.topicDetail2_nextButton);
        final Topic topic = TopicsDB.getTopicById(topicID);

        detail2_topicName.setText(topic.getTopicName());
        detail2_topicDetail.setText(topic.getDetail2());
        detail2_image.setImageResource(topic.getImageDrawableId());
        detail2_nextButton.setImageResource(R.drawable.ic_arrow_forward_gold);
        detail2_nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TopicDetail3Fragment topicDetail3Fragment = new TopicDetail3Fragment();
                Bundle bundle = new Bundle();
                bundle.putInt("id",topic.getTopicID());
                topicDetail3Fragment.setArguments(bundle);

                ((FragmentActivity)v.getContext()).getSupportFragmentManager()
                        .beginTransaction().replace(R.id.fragmentMain_slot,
                        topicDetail3Fragment).commit();
            }
        });
        return view;

    }

}
