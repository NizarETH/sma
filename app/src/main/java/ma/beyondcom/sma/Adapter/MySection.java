package ma.beyondcom.sma.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.Arrays;
import java.util.List;

import io.github.luizgrp.sectionedrecyclerviewadapter.SectionParameters;
import io.github.luizgrp.sectionedrecyclerviewadapter.StatelessSection;
import ma.beyondcom.sma.R;

/**
 * Created by pc hp on 13/09/2017.
 */

class MySection extends StatelessSection {
    List<String> itemList = Arrays.asList("Item1", "Item2", "Item3");

    public MySection() {
        // call constructor with layout resources for this Section header and items
        super(new SectionParameters.Builder(R.layout.movie_list_row)
                .headerResourceId(R.layout.movie_list_row)
                .build());
    }

    @Override
    public int getContentItemsTotal() {
        return itemList.size(); // number of items of this section
    }

    @Override
    public RecyclerView.ViewHolder getItemViewHolder(View view) {
        // return a custom instance of ViewHolder for the items of this section
        return new MyItemViewHolder(view);
    }

    @Override
    public void onBindItemViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyItemViewHolder itemHolder = (MyItemViewHolder) holder;

        // bind your view here
        itemHolder.tvItem.setText(itemList.get(position));
    }
}
