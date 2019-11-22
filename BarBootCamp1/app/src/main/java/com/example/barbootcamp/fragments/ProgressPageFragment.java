package com.example.barbootcamp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.barbootcamp.R;

public class ProgressPageFragment extends Fragment {
    private TextView result1;
    private TextView result2;
    private TextView result3;
    private TextView result4;
    private TextView result5;
    private TextView result6;
    private ImageView badge1;
    private ImageView badge2;
    private ImageView badge3;
    private ImageView badge4;
    private ImageView badge5;
    private ImageView badge6;

    public ProgressPageFragment(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragement_progress, container, false);

        result1 = view.findViewById(R.id.progress_q1result);
        result2 = view.findViewById(R.id.progress_q2result);
        result3 = view.findViewById(R.id.progress_q3result);
        result4 = view.findViewById(R.id.progress_q4result);
        result5 = view.findViewById(R.id.progress_q5result);
        result6 = view.findViewById(R.id.progress_q6result);
        badge1 = view.findViewById(R.id.progress_bg1);
        badge2 = view.findViewById(R.id.progress_bg2);
        badge3 = view.findViewById(R.id.progress_bg3);
        badge4 = view.findViewById(R.id.progress_bg4);
        badge5 = view.findViewById(R.id.progress_bg5);
        badge6 = view.findViewById(R.id.progress_bg6);





        return view;

    }




}
