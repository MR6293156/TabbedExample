package com.example.tabbedexample

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.example.tabbedexample.ui.main.SectionsPagerAdapter

public class MainActivity : AppCompatActivity() {

    private SectionPagerAdapter mSectionsPagerAdapter;

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = findViewById(R.id.view_pager)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = findViewById(R.id.tabs)
        tabs.setupWithViewPager(viewPager)
        val fab: FloatingActionButton = findViewById(R.id.fab)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }


        @Override
public Fragment getItem(int position) {

    switch (position) {
        case 0:
        Tab1Contacts tab1 = new Tab1Contacts() ;
        return tab1;
    case 1:
        Tab2Chat tab2 = new Tab2Chat () ;
    case 2:
        Tab3Online tab3 = new Tab3Online ();

    default:
        return null;
    }
}=

        @Override
        public CharSequence getPageTitle(int position) {
    switch (position) {
        case 0:
             return "CONTACTS";
        case 1:
             return "CHAT";
        case 2:
             reutrn "ONLINE";
        }
    return null;

    }
  }
}