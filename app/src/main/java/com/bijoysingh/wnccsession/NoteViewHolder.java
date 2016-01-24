package com.bijoysingh.wnccsession;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.github.bijoysingh.starter.recyclerview.RVHolder;

/**
 * Created by bijoy on 1/24/16.
 */
public class NoteViewHolder extends RVHolder<NoteItem> {

    TextView title, note;

    public NoteViewHolder(Context context, View itemView) {
        super(context, itemView);

        title = (TextView) itemView.findViewById(R.id.title);
        note = (TextView) itemView.findViewById(R.id.note);
    }

    @Override
    public void populate(NoteItem data) {
        super.populate(data);
        title.setText(data.title);
        note.setText(data.note);
    }
}
