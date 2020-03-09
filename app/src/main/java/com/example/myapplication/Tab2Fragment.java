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
        list_laws.add(new Laws("建设项目使用林地审核审批管理办法(国家林业局第35号令)"));
        list_laws.add(new Laws("建设项目使用林地审核审批管理规范(国家林业局122号文)"));
        list_laws.add(new Laws("国家林业局关于加强临时占用林地监督管理的通知(国家林业局121号文)"));
        list_laws.add(new Laws("森林植被恢复费征收标准  豫财综【2016】10号"));
        list_laws.add(new Laws("河南省林地保护管理条例"));
        list_laws.add(new Laws("国家林业和草原局关于规范风电场项目建设使用林地的通知"));
        list_laws.add(new Laws("国家林业和草原局办公室关于生猪养殖使用林地有关问题的通知"));
        list_laws.add(new Laws("国家林业和草原局公告：取消3项规章和规范性文件设定的证明材料"));
        list_laws.add(new Laws("国家林业和草原局关于统筹推进新冠肺炎疫情防控和经济社会发展做好建设项目使用林地工作的通知"));
        list_laws.add(new Laws("国家林业局关于光伏电站建设使用林地有关问题的通知林资发〔2015〕153号"));
        list_laws.add(new Laws("国家林业局向河南、四川省林业厅印发《关于光伏电站建设使用林地有关问题的复函》"));
        list_laws.add(new Laws("河南省林业局临时占用林地和直接为林业生产服务的工程设施需要占用林地的审批权限下放"));
        list_laws.add(new Laws("建设项目使用林地可行性报告编制规范"));
        list_laws.add(new Laws("可行性报告编制收费依据"));
        list_laws.add(new Laws("战略性新兴产业重点产品和服务指导目录(2016版)"));


    }

}