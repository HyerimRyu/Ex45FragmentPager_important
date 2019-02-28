package kr.co.teada.ex45fragmentpager_important;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class Page2Fragment extends Fragment {

    //3. 참조변수: fragment.xml 화면에 있는 id
    ImageView iv;
    Button btn;

    //1. onCreateView

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //2. inflater 만들어서 뷰 리턴 : 만들어 놓은 fragment 화면 만들어~
        //View view=inflater.inflate(R.layout.fragment_page2, container,false);  아래 축약버전 그냥 return에 바로 넣어

        return inflater.inflate(R.layout.fragment_page2, container,false);
    }

    //4. onCreateView()가 종료된 후에 자동으로 실행되는 메소드; 뷰를 제어하는건 여기서! 위의 onCreateView 는 뷰 만들기~
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //4_1. 첫 번째 매개변수 : 이 프레그먼트가 보여줄 View(위(2번)에서 리턴시킨 뷰)
        iv=view.findViewById(R.id.iv);
        btn=view.findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv.setImageResource(R.drawable.moana4);

            }
        });
    }
}
