package kr.co.teada.ex45fragmentpager_important;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Page3Fragment extends Fragment {

    //3. 참조변수 ---------------------1,2, 기본으로 하고 왔다갔다 하다 3.
    //대량의 Data
    ArrayList<String> datas=new ArrayList<>();

    ListView listView;
    ArrayAdapter adapter;


    //5. onCreate : 프레그먼트가 처음 생성될 때 딱 1번만 호출되는 메소드 :** 보통은 이 곳에서 DB 또는 서버의 데이터를 가져오는 작업 수행 (밑의 onCreateView 에다 하면 계속 추가돼. 에러!)
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //6. 데이터 추가: 리스트뷰에 보일 데이터들
        datas.add("aaa");
        datas.add("bbb");
        datas.add("ccc");

    }
    //1. onCreateView   * 뷰 만드는건 create에서 하고 제어는 created에서 하자. : 나누는게 유지보수에도 더 좋아

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //2. inflater 만들어서 뷰 리턴 : 만들어 놓은 fragment 화면 만들어~
        View view=inflater.inflate(R.layout.fragment_page3, container,false);

        return view;
    }

    //4. 제어는 Created 에서 하자~
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //4_1. 준비: 연결
        listView=view.findViewById(R.id.listview);
        adapter=new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, datas);
        listView.setAdapter(adapter);
    }
}
