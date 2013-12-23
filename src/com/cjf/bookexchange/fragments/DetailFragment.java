package com.cjf.bookexchange.fragments;

import com.cjf.bookexchange.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class DetailFragment extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.detail_layout, null);

		Spinner yearSpinner = (Spinner) rootView.findViewById(R.id.yearOption);
		ArrayAdapter<CharSequence> yearAdapter = ArrayAdapter
				.createFromResource(getActivity(), R.array.years,
						android.R.layout.simple_spinner_item);
		yearAdapter
				.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		yearSpinner.setAdapter(yearAdapter);
		
		Spinner typeSpinner = (Spinner) rootView.findViewById(R.id.typeOption);
		ArrayAdapter<CharSequence> typeAdapter = ArrayAdapter
				.createFromResource(getActivity(), R.array.book_type,
						android.R.layout.simple_spinner_item);
		typeAdapter
				.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		typeSpinner.setAdapter(typeAdapter);

		return rootView;
	}
}
