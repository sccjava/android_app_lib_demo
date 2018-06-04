
package com.bfrx;

import android.content.Context;

import com.media.player.R;

import java.io.Serializable;

public class Device implements Serializable {
	public long uniqueID = 0;
	public int protocol = 0;

	public void setDevice(Context context){
		context.getColor(R.color.colorAccent);
	}
}
