package ma.beyondcom.sma;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import ma.beyondcom.sma.m_Model.EposterModel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Eposters extends AppCompatActivity {

    private List<EposterModel> movieList = new ArrayList<>();
    private RecyclerView recyclerView;
    private EposterAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(ma.beyondcom.sma.R.layout.activity_eposters);
        Toolbar toolbar = (Toolbar) findViewById(ma.beyondcom.sma.R.id.toolbar);
        setSupportActionBar(toolbar);


        recyclerView = (RecyclerView) findViewById(ma.beyondcom.sma.R.id.recycler_view);

        mAdapter = new EposterAdapter(movieList,this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(mAdapter);




        StringRequest stringRequest  = new StringRequest(Request.Method.GET, "http://www.sma.ma/SMABACK/index.php?action=eposter",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        try {
                            JSONObject jsonObject=new JSONObject(response);

                            JSONArray jsonArray=new JSONArray();
                            jsonArray=jsonObject.getJSONArray("eposters");


                            for(int i=0;i<jsonArray.length();i++){
                                JSONObject obj=new JSONObject();
                                obj=jsonArray.getJSONObject(i);
                                String id="EP"+obj.getString("id");
                                String title =obj.getString("titre");
                                String pdf=obj.getString("pdf");
                                EposterModel movie = new EposterModel(title,id,pdf);
                                movieList.add(movie);

                            }

                            prepareMovieData();
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }

                }){

        };

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
        prepareMovieData();


    }



    private void prepareMovieData() {




        mAdapter.notifyDataSetChanged();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(ma.beyondcom.sma.R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        if (id == ma.beyondcom.sma.R.id.navigate) {
            startActivity(new Intent(this, ma.beyondcom.sma.Activities.MainActivity.class));
        }

        return super.onOptionsItemSelected(item);
    }
}
