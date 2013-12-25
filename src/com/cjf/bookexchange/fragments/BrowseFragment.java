package com.cjf.bookexchange.fragments;

import com.cjf.bookexchange.R;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

@SuppressLint("ValidFragment")
public class BrowseFragment extends Fragment {
	private ActionBar actionBar;
	private FragmentActivity activity;

	public BrowseFragment() {
		// TODO Auto-generated constructor stu
		activity = getActivity();
		if (activity != null) {
			activity.setTitle(R.string.browse_name);
			actionBar = activity.getActionBar();
			// actionBar.removeAllTabs();
			actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
		}
		// actionBar.hide();
	}

}
