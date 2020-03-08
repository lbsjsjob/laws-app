package com.example.myapplication;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class Tab2Fragment extends Fragment {

    List<Laws> list_laws;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        law_data();
        RecyclerView rvContacts = (RecyclerView) view.findViewById(R.id.rvContacts);
        LawsAdapter r_adapter = new LawsAdapter(list_laws);
        rvContacts.setAdapter(r_adapter);
        rvContacts.setLayoutManager( new LinearLayoutManager(getActivity()));
        return view;
    }



    void law_data() {
        list_laws = new ArrayList<>();
        list_laws.add(new Laws("122号文"));
        list_laws.add(new Laws("111号文"));
        list_laws.add(new Laws("森林植被恢复费征收标准"));
        list_laws.add(new Laws("国家林业局令第35号"));
    }

}