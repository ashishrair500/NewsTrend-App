package com.example.newstrend;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

//we use a modern class to handle these fragment
public class HomeFragment extends Fragment {

    String api="bba4d648a90243de9638e524ada1e673";
ArrayList<ModelClass> modelclassArrayList;
Adapter adapter;
String country="in";
private RecyclerView recyclerViewofhome;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       //to attach our fragment
        View v= inflater.inflate(R.layout.homefragment,null);
        recyclerViewofhome=v.findViewById(R.id.recyclerViewofHome);
        modelclassArrayList=new ArrayList<>();
        recyclerViewofhome.setLayoutManager(new LinearLayoutManager(getContext()));

        adapter= new Adapter(getContext(),modelclassArrayList);
        recyclerViewofhome.setAdapter(adapter);
        findNews();
        return v;

    }

    private void findNews() {
        ApiUtilities.getApiInterface().getNews(country,100,api).enqueue(new Callback<MainNews>() {
            @Override
            public void onResponse(Call<MainNews> call, Response<MainNews> response) {
                if(response.isSuccessful()){
                    modelclassArrayList.addAll(response.body().getArticles());
                    adapter.notifyDataSetChanged();

                }
            }

            @Override
            public void onFailure(Call<MainNews> call, Throwable t) {

            }
        });




    }
}
