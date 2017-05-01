/*
 * Copyright (C) 2015 Bilibili <jungly.ik@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.bilibili.socialize.share.core.handler.sina;

import android.app.Activity;

import com.bilibili.socialize.share.core.BiliShareConfiguration;
import com.bilibili.socialize.share.core.SocializeMedia;
import com.bilibili.socialize.share.core.handler.AbsShareTransitHandler;
import com.bilibili.socialize.share.core.shareparam.BaseShareParam;
import com.bilibili.socialize.share.core.ui.SinaAssistActivity;

/**
 * @author Jungly
 * @email jungly.ik@gmail.com
 * @since 2015/10/9
 */
public class SinaShareTransitHandler extends AbsShareTransitHandler {
    private static final String TAG = "BShare.sina.transit";
    private String mClientName;

    public SinaShareTransitHandler(Activity context, BiliShareConfiguration configuration, String clientName) {
        super(context, configuration);
        mClientName = clientName;
    }

    @Override
    protected void onJumpToAssist(Activity context, BaseShareParam params) {
        SinaAssistActivity.start(context, params, mShareConfiguration, mClientName);
    }

    @Override
    protected String tag() {
        return TAG;
    }

    @Override
    public SocializeMedia getShareMedia() {
        return SocializeMedia.SINA;
    }

}
