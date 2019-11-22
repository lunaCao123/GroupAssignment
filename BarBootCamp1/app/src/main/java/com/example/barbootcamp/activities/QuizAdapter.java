package com.example.barbootcamp.activities;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.barbootcamp.R;
import com.example.barbootcamp.model.Question;

import java.util.List;

public class QuizAdapter extends RecyclerView.Adapter<QuizAdapter.QuizViewHolder> {

    private List<Question>questionsToAdapt;
    //public static List<Question>correctList;
    public void setQuestionData (List<Question>questionsToAdapt){
        this.questionsToAdapt = questionsToAdapt;
    }
    @NonNull
    @Override
    public QuizViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.quiz,parent,false);

        QuizViewHolder quizViewHolder = new QuizViewHolder(view);
        return quizViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final QuizViewHolder holder, int position) {
        final Question questionAtPosition = questionsToAdapt.get(position);
        int quizno = questionAtPosition.getQuestionNumber();
        String quizNvm = Integer.toString(quizno);

        holder.qnvm.setText(quizNvm);
        holder.questionText.setText(questionAtPosition.getQuestion());
        holder.a_rbtn.setText(questionAtPosition.option1);
        holder.b_rbtn.setText(questionAtPosition.option2);
        holder.c_rbtn.setText(questionAtPosition.option3);
        holder.d_rbtn.setText(questionAtPosition.option4);
//        holder.answerGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                checkedId = holder.answerGroup.getCheckedRadioButtonId();
//                if(checkedId == questionAtPosition.answer){
//                    correctList.add(questionAtPosition);
//                }
//            }
//        });
    }


    @Override
    public int getItemCount() {
        return questionsToAdapt.size();
    }

    public class QuizViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView qnvm;
        public TextView questionText;
        public RadioGroup answerGroup;
        public RadioButton a_rbtn;
        public RadioButton b_rbtn;
        public RadioButton c_rbtn;
        public RadioButton d_rbtn;


        public QuizViewHolder(View v) {
            super(v);
            view = v;
            qnvm = v.findViewById(R.id.quiz_qnvm);
            questionText = v.findViewById(R.id.quiz_question);
            answerGroup = v.findViewById(R.id.quiz_radioGroup);
            a_rbtn = v.findViewById(R.id.answer1);
            b_rbtn = v.findViewById(R.id.answer2);
            c_rbtn = v.findViewById(R.id.answer3);
            d_rbtn = v.findViewById(R.id.answer4);
        }
    }
}
