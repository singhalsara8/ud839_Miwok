package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.android.miwok.test.Word;

import java.util.List;

public class Word_adapter extends ArrayAdapter {
    List<Word> myList;
    Context context;



    public Word_adapter(@NonNull Context context, int resource, int textViewResourceId, List<Word> myList, Context context1) {
        super(context, resource, textViewResourceId);
        this.myList = myList;
        this.context = context1;
    }

    public Word_adapter(@NonNull Context context, int resource, @NonNull Object[] objects, List<Word> myList, Context context1) {
        super(context, resource, objects);
        this.myList = myList;
        this.context = context1;
    }

    public Word_adapter(@NonNull Context context, int resource, int textViewResourceId, @NonNull Object[] objects, List<Word> myList, Context context1) {
        super(context, resource, textViewResourceId, objects);
        this.myList = myList;
        this.context = context1;
    }

    public Word_adapter(@NonNull Context context, int resource, @NonNull List objects, List<Word> myList, Context context1) {
        super(context, resource, objects);
        this.myList = myList;
        this.context = context1;
    }

    public Word_adapter(@NonNull Context context, int resource, int textViewResourceId, @NonNull List objects, List<Word> myList, Context context1) {
        super(context, resource, textViewResourceId, objects);
        this.myList = myList;
        this.context = context1;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = super.getView(position, convertView, parent);
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        TextView miwokWord, defWord;
        miwokWord = view.findViewById(R.id.miwok_text_view);
        defWord = view.findViewById(R.id.default_text_view);
        miwokWord.setText(myList.get(position).getMiwokTranslation());
        defWord.setText(myList.get(position).getDefaultTranslation());
        return view;



    }
}
