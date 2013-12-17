package com.cjf.bookexchange.fragments;

import com.cjf.bookexchange.MainActivity;
import com.cjf.bookexchange.R;

import android.annotation.SuppressLint;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

@SuppressLint("ValidFragment")
public class LendFragment extends Fragment {

	public LendFragment(FragmentActivity fragmentActivity) {
		// TODO Auto-generated constructor stub
		fragmentActivity.setTitle(R.string.lend_name);
	}
}
