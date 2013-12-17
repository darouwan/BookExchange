package com.cjf.bookexchange.fragments;

import com.cjf.bookexchange.R;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

@SuppressLint("ValidFragment")
public class BrowseFragment extends Fragment {
	private ActionBar actionBar;
	public BrowseFragment(FragmentActivity fragmentActivity) {
		// TODO Auto-generated constructor stu
		fragmentActivity.setTitle(R.string.browse_name);
		actionBar = fragmentActivity.getActionBar();
		//actionBar.removeAllTabs();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
		//actionBar.hide();
	}

}
