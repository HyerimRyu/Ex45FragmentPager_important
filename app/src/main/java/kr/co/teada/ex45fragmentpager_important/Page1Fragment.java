package kr.co.teada.ex45fragmentpager_important;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Page1Fragment extends Fragment {

    //3. 내 짝꿍 fragment_page1.xml에 있는 id들 TextView 참조변수, Button 참조변수
    TextView tv;
    Button btn;

    //4.
    String savedData=null;

    //1. onCreateView

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //2. inflater 만들어서 뷰 리턴 : 만들어 놓은 fragment 화면 만들어~ 여기서늬 view는 내 짝꿍 fragment_page1.xml의 root레이아웃 리니어 레이아웃이야.
        View view=inflater.inflate(R.layout.fragment_page1, container,false);

        //3_1 연결 시켜줘
        tv=view.findViewById(R.id.tv);
        //4_1.
        if(savedData!=null) tv.setText(savedData);  //언제 null이 아니니? 버튼 클릭해서 데이터 있을 때
        btn=view.findViewById(R.id.btn);

        //3_2. 버튼 눌렀을 때 반응= 리스터 setOnClickListener
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //4_2.
                savedData="Clicked";
                tv.setText(savedData);
            }
        });

        return view;
    }
}
