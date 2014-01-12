package com.cjf.bookexchange.view;

public class Card {
	private String mDescription;
	private int mDrawable;

	public Card(String mDescription, int mDrawable) {
		this.mDescription = mDescription;
		this.mDrawable = mDrawable;
	}

	public String getDescription() {
		return mDescription;
	}

	public void setDescription(String mDescription) {
		this.mDescription = mDescription;
	}

	public int getDrawable() {
		return mDrawable;
	}

	public void setDrawable(int mDrawable) {
		this.mDrawable = mDrawable;
	}
}
