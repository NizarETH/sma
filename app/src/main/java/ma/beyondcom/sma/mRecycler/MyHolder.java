package ma.beyondcom.sma.mRecycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import ma.beyondcom.sma.R;

/**
 * Created by pc hp on 13/10/2017.
 */

public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    TextView nameTxt;
    TextView profTxt;
    TextView namemed;
    TextView cvTxt;
    TextView resumeTxt;
    TextView datetimeTxt;
    TextView lieuTxt;
    ImageView img;
    ItemClickListener itemClickListener;

    public MyHolder(View itemView) {
        super(itemView);
        nameTxt = (TextView) itemView.findViewById(R.id.nameTxt);
        profTxt = (TextView) itemView.findViewById(R.id.profTxt);
        datetimeTxt = (TextView) itemView.findViewById(R.id.datetimeTxt);
        lieuTxt = (TextView) itemView.findViewById(R.id.lieuTxt);
        cvTxt = (TextView) itemView.findViewById(R.id.cvTxtDetail);
        resumeTxt = (TextView) itemView.findViewById(R.id.resumeTxt);
        img = (ImageView) itemView.findViewById(R.id.spacecraftImage);

        itemView.setOnClickListener(this);
    }

    public void setItemClickListener(ItemClickListener itemClickListener){
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View view) {
        this.itemClickListener.onItemClick(this.getLayoutPosition());
    }
}
