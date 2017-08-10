package com.bignerdranch.android.geoquiz;

/**
 * Created by u_b002 on 3/08/2017.
 */

public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;
    public Question (int mTextResId, boolean mAnswerTrue){
        mTextResId = mTextResId;
        mAnswerTrue = mAnswerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
