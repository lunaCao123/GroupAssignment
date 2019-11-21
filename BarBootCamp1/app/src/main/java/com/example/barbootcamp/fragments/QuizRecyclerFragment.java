package com.example.barbootcamp.fragments;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.barbootcamp.R;
import com.example.barbootcamp.activities.QuizAdapter;
import com.example.barbootcamp.model.Question;
import com.example.barbootcamp.model.QuestionBank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuizRecyclerFragment extends Fragment {

    private RecyclerView recyclerView;
    private Button submitBtn;
    private Button cancelBtn;
    private String topicId;
    private List<Question>questionList;


    private int score;

    public QuizRecyclerFragment(){

    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String topic = getArguments().getString("id");
        topicId = topic;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_quiz_recycler, container, false);
        recyclerView = view.findViewById(R.id.rv_quiz);
        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);

        QuizAdapter quizAdapter = new QuizAdapter();
        questionList = QuestionBank.getAllQuestions();
        final List<Question>newQlist = new ArrayList<>();
        for(Question q: this.questionList){
            if(q.getTopicID().equals(topicId)){
                newQlist.add(q);
            }
        }
        quizAdapter.setQuestionData(newQlist);
        recyclerView.setAdapter(quizAdapter);
        submitBtn = view.findViewById(R.id.quizFragment_submitBtn);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(Question q: newQlist) {
                        RadioGroup radioGroup = (RadioGroup) view.findViewById(R.id.quiz_radioGroup);
                        int selectedId = radioGroup.getCheckedRadioButtonId();
                        int answer = q.getAnswer();
                        if (selectedId == answer) {
                            score += 1;
                        } else {
                            score += 0;
                        }
                }
                System.out.print("You got " + score + " in your quiz");
            }
        });
        return view;
    }
}
