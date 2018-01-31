package ma.beyondcom.sma.Adapter;

/**
 * Created by pc hp on 13/09/2017.
 */
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import ma.beyondcom.sma.R;
import ma.beyondcom.sma.model.Question;

public class VoteAdapter extends RecyclerView.Adapter<VoteAdapter.MyViewHolder> {

  

        private List<Question> moviesList;

        public class MyViewHolder extends RecyclerView.ViewHolder {
            public TextView title, year, genre;

            public MyViewHolder(View view) {
                super(view);
                title = (TextView) view.findViewById(R.id.title);

            }
        }


        public VoteAdapter(List<Question> moviesList) {
            this.moviesList = moviesList;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.movie_list_row, parent, false);

            return new MyViewHolder(itemView);
        }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Question movie = moviesList.get(position);
        holder.title.setText(movie.getQuestion());
    }



    @Override
        public int getItemCount() {
            return moviesList.size();
        }
    }

