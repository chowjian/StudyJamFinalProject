package jam.study.a5waystomakeeggs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager pager = (ViewPager) findViewById(R.id.viewPager);
        pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
    }

    private class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int pos) {
            switch(pos) {
                case 0: return StartingFragment.newInstance();
                case 1: return FirstFragment.newInstance();
                case 2: return SecondFragment.newInstance();
                case 3: return ThirdFragment.newInstance();
                case 4: return FourthFragment.newInstance();
                case 5: return FifthFragment.newInstance();
                default: return FirstFragment.newInstance();
            }
        }

        @Override
        public int getCount() {
            return 6;
        }
    }
}
