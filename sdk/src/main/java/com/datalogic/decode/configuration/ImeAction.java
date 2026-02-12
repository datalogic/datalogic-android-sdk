package com.datalogic.decode.configuration;

import android.view.inputmethod.EditorInfo;

public enum ImeAction {
	/**
	 * Do not send any IME action.
	 */
	SKIP,

	/**
	 * Send <a href="https://developer.android.com/reference/android/view/inputmethod/EditorInfo#IME_ACTION_UNSPECIFIED">IME_ACTION_UNSPECIFIED</a>.
	 */
	UNSPECIFIED,

	/**
	 * Send <a href="https://developer.android.com/reference/android/view/inputmethod/EditorInfo#IME_ACTION_NONE">IME_ACTION_NONE</a>.
	 */
	NONE,

	/**
	 * Send <a href="https://developer.android.com/reference/android/view/inputmethod/EditorInfo#IME_ACTION_GO">IME_ACTION_GO</a>.
	 */
	GO,

	/**
	 * Send <a href="https://developer.android.com/reference/android/view/inputmethod/EditorInfo#IME_ACTION_SEARCH">IME_ACTION_SEARCH</a>.
	 */
	SEARCH,

	/**
	 * Send <a href="https://developer.android.com/reference/android/view/inputmethod/EditorInfo#IME_ACTION_SEND">IME_ACTION_SEND</a>.
	 */
	SEND,

	/**
	 * Send <a href="https://developer.android.com/reference/android/view/inputmethod/EditorInfo#IME_ACTION_NEXT">IME_ACTION_NEXT</a>.
	 */
	NEXT,

	/**
	 * Send <a href="https://developer.android.com/reference/android/view/inputmethod/EditorInfo#IME_ACTION_DONE">IME_ACTION_DONE</a>.
	 */
	DONE,

	/**
	 * Send <a href="https://developer.android.com/reference/android/view/inputmethod/EditorInfo#IME_ACTION_PREVIOUS">IME_ACTION_PREVIOUS</a>.
	 */
	PREVIOUS;
}
