package kjs.mjs.gittest02

import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView

class MainActivity : AppCompatActivity() {

    //멤버 변수 설정
    private lateinit var searchFragment: SearchFragment

    private val fragments_frame: FrameLayout by lazy {
        findViewById(R.id.fragments_frame)
    }

    private val bottom_nav: BottomNavigationView by lazy {
        findViewById(R.id.bottom_nav)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 바텀네비 아이템 클릭 리스너 설정

        bottom_nav.setOnItemSelectedListener(onBottomNavigationItemSelectedListener)

        searchFragment = SearchFragment.newInstance()
        supportFragmentManager.beginTransaction().add(R.id.fragments_frame, searchFragment).commit()

    }

    // 바텀네비 아이템 클릭 리스너 설정
    private val onBottomNavigationItemSelectedListener = NavigationBarView.OnItemSelectedListener{
//        when(it.itemId){
//            R.id.menu_home -> {
//                homeFragment = HomeFragment.newInstance()   //homefragment의 자기자신을 불러옴
//
//                // fragment를 관리하는 매니저
//                // beginTransaction을 통해 보여주고
//                // fragment는 add()로 쌓을 수 있고,
//                // replace()로 교체도 할 수 있다
//                supportFragmentManager.beginTransaction().replace(R.id.fragments_frame, homeFragment).commit()
//
//            }R.id.menu_library -> {
//            libraryFragment = LibraryFragment.newInstance()
//            supportFragmentManager.beginTransaction().replace(R.id.fragments_frame, libraryFragment).commit()
//
//            }R.id.menu_report -> {
//            reportFragment = ReportFragment.newInstance()
//            supportFragmentManager.beginTransaction().replace(R.id.fragments_frame, reportFragment).commit()
//            }
//        }//when
        true
    }
}