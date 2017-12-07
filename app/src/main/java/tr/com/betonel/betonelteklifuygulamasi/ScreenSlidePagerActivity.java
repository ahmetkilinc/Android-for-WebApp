package tr.com.betonel.betonelteklifuygulamasi;

/**
 * Created by a.kilinc on 7.12.2017.
 */

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.MenuItem;

public class ScreenSlidePagerActivity extends FragmentActivity {

    private static final int NUM_PAGES = 1;
    private ViewPager mPager;
    private PagerAdapter mPagerAdapter;
    public BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_slide);

        //Instantiate a ViewPager and a PagerAdapter.
        mPager = (ViewPager) findViewById(R.id.pager);
        mPagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);
        mPager.setPageTransformer(true, new ZoomOutPageTransformer());
    }

    @Override
    public void onBackPressed() {

        if (mPager.getCurrentItem() == 0) {

            super.onBackPressed();
        }
        else {

            mPager.setCurrentItem(mPager.getCurrentItem() - 1);
        }
    }

    public class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {

        public ScreenSlidePagerAdapter(FragmentManager fm) {

            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            return new webApp();
            /*
            if (position == 0){

                return new webApp();
            }

            else if(position == 1){

                return new second();
            }

            else{

                return new third();
            }*/
        }

        @Override
        public int getCount() {

            return NUM_PAGES;
        }
    }
}
