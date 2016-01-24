package com.bijoysingh.wnccsession;

import android.content.Context;

import com.github.bijoysingh.starter.recyclerview.RVAdapter;

import java.util.List;

/**
 * Created by bijoy on 1/24/16.
 */
public class NoteListAdapter
        extends RVAdapter<NoteItem, NoteViewHolder> {

    public NoteListAdapter(Context context,
                           List<NoteItem> notes) {
        super(context, R.layout.list_item,
                NoteViewHolder.class);
        contents = notes;
    }

    @Override
    public List<NoteItem> getValues() {
        return contents;
    }
}
