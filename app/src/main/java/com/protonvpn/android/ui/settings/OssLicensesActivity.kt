/*
 * Copyright (c) 2019 Proton Technologies AG
 *
 * This file is part of ProtonVPN.
 *
 * ProtonVPN is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * ProtonVPN is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with ProtonVPN.  If not, see <https://www.gnu.org/licenses/>.
 */
package com.protonvpn.android.ui.settings

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import com.protonvpn.android.components.BaseActivityV2
import com.protonvpn.android.databinding.ActivityLicensesBinding

class OssLicensesActivity : BaseActivityV2() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLicensesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initToolbarWithUpEnabled(binding.appbar.toolbar)
        initWebView(binding.content.webView)
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun initWebView(webView: WebView) = with(webView) {
        setBackgroundColor(0)
        settings.javaScriptEnabled = true
        loadUrl("file:///android_asset/oss_licenses.html")
    }
}
