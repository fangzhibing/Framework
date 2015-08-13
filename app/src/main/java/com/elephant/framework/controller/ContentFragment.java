package com.elephant.framework.controller;

import android.app.Fragment;
import android.os.Bundle;

public class ContentFragment extends Fragment {
	private String mArgument;
	public static final String ARGUMENT = "argument";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		/**
		 * 另一种情况：
		 *  mArgument =
		 * getActivity().getIntent().getStringExtra(ARGUMENT); 拿到宿主Activity
		 * 宿主Activity中肯定能通过getIntent拿到Intent，然后通过get方法，随意拿参数
		 * 但是！！！这样就和Activity耦合了,还能复用吗？还能复用吗？还能复用吗？
		 */
		Bundle bundle = getArguments();
		if (bundle != null)
			mArgument = bundle.getString(ARGUMENT);
	}

	public static ContentFragment newInstance(String argument) {
		Bundle bundle = new Bundle();
		bundle.putString(ARGUMENT, argument);
		ContentFragment contentFragment = new ContentFragment();
		contentFragment.setArguments(bundle);
		return contentFragment;
	}
}
