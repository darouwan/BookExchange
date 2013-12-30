package com.cjf.bookexchange.fragments;

import com.cjf.bookexchange.R;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

@SuppressLint("ValidFragment")
public class BrowseFragment extends Fragment {
	private ViewPager viewPager;
	private ActionBar actionBar;
	private FragmentActivity activity;
	private String[] tabs = { "³ö×â", "½èÈë","ÖÜ±ß" };
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		activity = getActivity();
		if (activity != null) {
			activity.setTitle(R.string.browse_name);
			actionBar = activity.getActionBar();
			// actionBar.removeAllTabs();
			actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
		}
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		viewPager = (ViewPager) inflater.inflate(R.id.browse_pager, null);
		return super.onCreateView(inflater, container, savedInstanceState);
	}
	
	

}
