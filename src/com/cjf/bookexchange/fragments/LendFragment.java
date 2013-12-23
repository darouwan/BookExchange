package com.cjf.bookexchange.fragments;

import com.cjf.bookexchange.MainActivity;
import com.cjf.bookexchange.R;
import com.cjf.bookexchange.adapter.TabsPagerAdapter;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

@SuppressLint("ValidFragment")
public class LendFragment extends Fragment implements ActionBar.TabListener {
	private ViewPager viewPager;
	private TabsPagerAdapter mAdapter;
	private ActionBar actionBar;
	// Tab titles
	// private String[] tabs = { "书名", "详细", "描述" };
	private String[] tabs = { "书名", "详细" };
	private Activity activity;

	public LendFragment(FragmentActivity fragmentActivity) {
		// TODO Auto-generated constructor stub
		activity = fragmentActivity;
		fragmentActivity.setTitle(R.string.lend_name);
		actionBar = activity.getActionBar();
		actionBar.removeAllTabs();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// inflater.inflate(R.layout.lendswitch2, container);
		container.removeAllViews();
		viewPager = (ViewPager) inflater.inflate(R.layout.lendswitch2, null);

		actionBar = activity.getActionBar();
		actionBar.removeAllTabs();
		mAdapter = new TabsPagerAdapter(
				((FragmentActivity) activity).getSupportFragmentManager());
		viewPager.setAdapter(mAdapter);
		actionBar.setHomeButtonEnabled(true);
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

		// Adding Tabs
		for (String tab_name : tabs) {
			actionBar.addTab(actionBar.newTab().setText(tab_name)
					.setTabListener(this));
		}

		viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

			@Override
			public void onPageSelected(int position) {
				// on changing the page
				// make respected tab selected
				actionBar.setSelectedNavigationItem(position);
			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
			}

			@Override
			public void onPageScrollStateChanged(int arg0) {
			}
		});

		return viewPager;

	}

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		viewPager.setCurrentItem(tab.getPosition());

	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub

	}
}
