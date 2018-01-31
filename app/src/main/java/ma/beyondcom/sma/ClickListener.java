package ma.beyondcom.sma;

import android.view.View;

/**
 * Created by pc hp on 17/04/2017.
 */

public interface ClickListener {
    void onClick(View view, int position);

    void onLongClick(View view, int position);
}
