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
public class BorrowFragment extends Fragment implements ActionBar.TabListener {
	private ViewPager viewPager;
	private TabsPagerAdapter mAdapter;
	private ActionBar actionBar;
	private String[] tabs = { " È√˚", "œÍœ∏" };
	private FragmentActivity activity;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		activity = getActivity();
		if (activity != null) {
			activity.setTitle(R.string.borrow_name);
			actionBar = activity.getActionBar();
		}
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// inflater.inflate(R.layout.lendswitch2, container);
		container.removeAllViews();
		viewPager = (ViewPager) inflater.inflate(R.layout.lendswitch2, null);

		if (activity != null) {
			actionBar = activity.getActionBar();
			actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

			actionBar.removeAllTabs();
			mAdapter = new TabsPagerAdapter(
					((FragmentActivity) activity).getSupportFragmentManager());
			viewPager.setAdapter(mAdapter);
			actionBar.setHomeButtonEnabled(true);

			// Adding Tabs
			for (String tab_name : tabs) {
				actionBar.addTab(actionBar.newTab().setText(tab_name)
						.setTabListener(this));
			}
			viewPager
					.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

						@Override
						public void onPageSelected(int position) {
							// on changing the page
							// make respected tab selected
							actionBar.setSelectedNavigationItem(position);
						}

						@Override
						public void onPageScrolled(int arg0, float arg1,
								int arg2) {
						}

						@Override
						public void onPageScrollStateChanged(int arg0) {
						}
					});
		}

		return viewPager;

		// actionBar.removeAllTabs();
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
