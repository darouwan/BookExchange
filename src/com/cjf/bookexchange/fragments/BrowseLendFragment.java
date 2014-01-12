package com.cjf.bookexchange.fragments;

import java.util.ArrayList;
import java.util.List;

import com.cjf.bookexchange.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.cjf.bookexchange.adapter.CardsAdapter;
import com.cjf.bookexchange.view.*;

public class BrowseLendFragment extends Fragment {
	private ListView mListView;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.browse_lend, container, false);

		if (getActivity() != null) {
			mListView = (ListView) view.findViewById(R.id.ListView);
			if (mListView != null) {
				CardsAdapter mAdapter = new CardsAdapter(getActivity(),
						getItems());
				mListView.setAdapter(mAdapter);
			} else {
				Log.d("mListView", "mListView is null");
			}

		}
		return view;
	}

	private List<Card> getItems() {
		List<Card> mCards = new ArrayList<Card>();
		for (int i = 0; i < 20; i++) {
			Card mCard = new Card("这是第" + (i + 1) + "张卡片", getResource(i));
			mCards.add(mCard);
		}
		return mCards;
	}

	private int getResource(int Index) {
		int mResult = 0;
		switch (Index % 2) {
		case 0:
			mResult = R.drawable.card_0;
			break;
		case 1:
			mResult = R.drawable.card_1;
			break;
		}
		return mResult;
	}

}
