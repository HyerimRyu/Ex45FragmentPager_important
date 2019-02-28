package kr.co.teada.ex45fragmentpager_important;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyAdapter extends FragmentPagerAdapter {

    //3. 데이터 안 사라지고 보관하려고
    Fragment[] frags=new Fragment[3];

    //1. 생성자 : 일개 Adapter 가 어떻게 fragment 를 제어하니~ 매니저 데리고 가!!!!!!! 그래서 매개변수로 FragmentManager 보내줄께
    public MyAdapter(FragmentManager fm) {
        super(fm);

        //3-1. 배열에 자료 넣기
        frags[0]=new Page1Fragment();
        frags[1]=new Page2Fragment();
        frags[2]=new Page3Fragment();
    }

    //뷰페이저가 보여줄 Fragment 를 만들어서 리턴시켜주는 메소드
    @Override
    public Fragment getItem(int position) {                 //getItem 은 실제 화면에서 새로 만들어질 녀석

        //2. frag 붙여서 보내~ 어댑터는 페이지들 받아서 메인한테 보내는 얘잖아. 얼른 프레그먼트 붙여 이거 하고 메인한테 가자~
        //이렇게 하면 Pager는 현재 보고 있는 창 양 옆으로 3개까지만 생성하는데 3페이지 볼 때 1페이지는 리셋되서 데이터 사라져. 이거 방지하기 위해서 3처럼 배열에 데이터 보관처리
//        Fragment frag=null;
//
//        switch (position){
//            case 0:
//                frag=new Page1Fragment();
//                break;
//
//            case 1:
//                frag=new Page2Fragment();
//                break;
//
//            case 2:
//                frag=new Page3Fragment();
//                break;
//        }
//        return frag;


        //3_2. 그 전의 데이터 사라지지 않고 나타나도록
        return  frags[position];
    }

    //뷰페이저가 보여줄 페이지의 총 페이지수 ( fragment.xml 의 개수!) 리턴에 넣어
    @Override
    public int getCount() {
        return 3;
    }
}
