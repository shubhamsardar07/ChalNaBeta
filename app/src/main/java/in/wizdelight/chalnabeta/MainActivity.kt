package `in`.wizdelight.chalnabeta

import `in`.wizdelight.chalnabeta.Fragments.ChatsFragment
import `in`.wizdelight.chalnabeta.Fragments.DirectoryFragment
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems
import `in`.wizdelight.chalnabeta.R.id.viewpager
import android.support.v4.view.ViewPager
import `in`.wizdelight.chalnabeta.R.id.viewpagertab
import android.net.Uri
import android.view.Menu
import android.view.MenuItem
import com.ogaclejapan.smarttablayout.SmartTabLayout






class MainActivity : AppCompatActivity() ,DirectoryFragment.OnFragmentInteractionListener, ChatsFragment.OnFragmentInteractionListener {


    override fun onFragmentInteraction(uri: Uri) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.elevation = 0f

        val adapter = FragmentPagerItemAdapter(
                supportFragmentManager, FragmentPagerItems.with(this)
                .add(R.string.directory, DirectoryFragment::class.java)
                .add(R.string.chats, ChatsFragment::class.java)
                .add(R.string.you, DirectoryFragment::class.java)
                .create())


        val viewPager = findViewById<ViewPager>(R.id.viewpager)
        viewPager.adapter = adapter

        val viewPagerTab = findViewById<SmartTabLayout>(R.id.viewpagertab)
        viewPagerTab.setViewPager(viewPager)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // Inflate the menu to use in the action bar
        val inflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return super.onOptionsItemSelected(item)
    }
}
