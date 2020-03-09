package com.example.myapplication;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Tab1Fragment extends Fragment {

    List<Laws> list_laws;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        law_data();
        RecyclerView rvContacts = (RecyclerView) view.findViewById(R.id.rvContacts);
        LawsAdapter r_adapter = new LawsAdapter(list_laws);

      // 分割线
        RecyclerView.ItemDecoration itemDecoration = new
        DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL);
        rvContacts.addItemDecoration(itemDecoration);

        rvContacts.setAdapter(r_adapter);
        rvContacts.setLayoutManager( new LinearLayoutManager(getActivity()));
        return view;
    }

      void law_data() {
          list_laws = new ArrayList<>();
          list_laws.add(new Laws("新森林法"));
          list_laws.add(new Laws("新森林法实施条例"));
          list_laws.add(new Laws("森林法"));
          list_laws.add(new Laws("森林法实施条例"));
          list_laws.add(new Laws("河南省林地保护管理条例"));
      }


    }






