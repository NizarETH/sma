package ma.beyondcom.sma.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import ma.beyondcom.sma.R;

/**
 * Created by pc hp on 13/09/2017.
 */

class MyItemViewHolder extends RecyclerView.ViewHolder {
     final TextView tvItem;

    public MyItemViewHolder(View itemView) {
        super(itemView);

        tvItem = (TextView) itemView.findViewById(R.id.title);
    }
}
