package com.example.barbootcamp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.barbootcamp.R;
import com.example.barbootcamp.activities.QuizAdapter;
import com.example.barbootcamp.model.Question;
import com.example.barbootcamp.model.QuestionBank;

import java.util.ArrayList;
import java.util.List;

public class QuizRecyclerFragment extends Fragment {

    private RecyclerView recyclerView;
    private Button submitBtn;
    private Button cancelBtn;
    private int topicID;
    private List<Question>questionList;
    private List<Question>newQlist;

    public QuizRecyclerFragment(){

    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        topicID = getArguments().getInt("id");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_quiz_recycler, container, false);
        recyclerView = view.findViewById(R.id.rv_quiz);
        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);

        QuizAdapter quizAdapter = new QuizAdapter();
        questionList = QuestionBank.getAllQuestions();
        quizAdapter.setQuestionData(questionList);
        recyclerView.setAdapter(quizAdapter);


        return view;
    }

}
