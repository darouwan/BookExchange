package com.cjf.bookexchange.adapter;

import com.cjf.bookexchange.fragments.BookNameFragment;
import com.cjf.bookexchange.fragments.DescriptionFragment;
import com.cjf.bookexchange.fragments.DetailFragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

public class BorrowTabsPagerAdapter extends FragmentStatePagerAdapter {

	public BorrowTabsPagerAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
		Log.i("fragment", "TabsPagerAdapter created ");
	}

	@Override
	public Fragment getItem(int index) {
		// TODO Auto-generated method stub
		Log.i("fragment", "getItem "+index);
		switch (index) {
		case 0:
			// Top Rated fragment activity
			//Log.i("fragment", "book fragment created");
			return new BookNameFragment();
		case 1:
			// Games fragment activity
			//Log.i("fragment", "detail fragment created");
			return new DetailFragment();
//		case 2:
//			// Movies fragment activity
//			return new DescriptionFragment();
		}

		return null;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 2;
	}

}
