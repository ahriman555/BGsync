/*
    This file is part of BGsync.

    BGsync is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    BGsync is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with BGsync.  If not, see <http://www.gnu.org/licenses/>
*/

package com.example.bibliotecauclm;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityLicencia extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		this.setContentView(R.layout.activity_licencia);
		 
        WebView myWebView = (WebView) findViewById(R.id.webView1);
        myWebView.loadUrl("http://www.gnu.org/licenses/gpl.html");
	}

}