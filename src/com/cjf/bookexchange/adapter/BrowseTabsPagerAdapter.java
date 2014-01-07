package com.cjf.bookexchange.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

import com.cjf.bookexchange.fragments.BrowseBorrowFragment;
import com.cjf.bookexchange.fragments.BrowseLendFragment;
import com.cjf.bookexchange.fragments.BrowseNearbyFragment;

public class BrowseTabsPagerAdapter extends FragmentStatePagerAdapter {

	public BrowseTabsPagerAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
		Log.i("fragment", "TabsPagerAdapter created ");
	}

	@Override
	public Fragment getItem(int index) {
		// TODO Auto-generated method stub
		switch (index) {
		case 0:
			return new BrowseLendFragment();
		case 1:
			// Games fragment activity
			return new BrowseBorrowFragment();
		case 2:
			// // Movies fragment activity
			return new BrowseNearbyFragment();
		}

		return null;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 3;
	}
}
