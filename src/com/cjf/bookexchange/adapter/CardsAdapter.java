package com.cjf.bookexchange.adapter;

import java.util.List;

import com.cjf.bookexchange.R;
import com.cjf.bookexchange.view.Card;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CardsAdapter extends BaseAdapter {

	private List<Card> mCards;
	private Context mContext;

	public CardsAdapter(Context mContext, List<Card> mCards) {
		super();
		this.mCards = mCards;
		this.mContext = mContext;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mCards.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return mCards.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public View getView(int index, View mView, ViewGroup mParent) {
		ViewHolder mHolder=new ViewHolder();  
		mView = LayoutInflater.from(mContext).inflate(R.layout.card_item, null);  
        mHolder.Card_Title=(TextView)mView.findViewById(R.id.Card_Title);  
        mHolder.Card_Title.setText(mCards.get(index).getDescription());  
        mHolder.Card_Pic=(ImageView)mView.findViewById(R.id.Card_Pic);  
        //记住啊，这里是setImageResource()方法，不是setBackgroundResource(),否则图像会变形啊  
        mHolder.Card_Pic.setImageResource(mCards.get(index).getDrawable());  
		return mView;
	}
    private static class ViewHolder  
    {  
        TextView Card_Title;  
        ImageView Card_Pic;  
    } 
}
