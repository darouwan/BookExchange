package com.cjf.bookexchange.fragments;

import com.cjf.bookexchange.R;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

@SuppressLint("ValidFragment")
public class SearchFragment extends Fragment {
	private ActionBar actionBar;
	private FragmentActivity activity;

	public SearchFragment() {
		// TODO Auto-generated constructor stub
		activity = getActivity();
		if (activity != null) {
			activity.setTitle(R.string.search_name);
			actionBar = activity.getActionBar();
			// actionBar.removeAllTabs();
			actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
		}

	}

}
