package com.coreman2200.ringstrings.swisseph;

import android.app.Activity;

import com.coreman2200.ringstrings.BuildConfig;
import com.coreman2200.ringstrings.R;
import com.coreman2200.ringstrings.RingStringsActivity;

import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.Shadows;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowResources;


/**
 * TestSwissephHandlerImpl
 * Let's see if we can connect successfully to swisseph
 *
 * Created by Cory Higginbottom on 5/29/15
 * http://github.com/coreman2200
 *
 * Licensed under the GNU General Public License (GPL), Version 2.0.
 * You may not use this file except in compliance with this License.
 *
 * You may obtain a copy of the GPLv2 License at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 */

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class)
public class TestSwissephHandlerImpl {
    private ISwissephFileHandler mTestFileHandler;
    private Activity mTestActivity;

    @Before
    public void setup() {
        mTestActivity = Robolectric.setupActivity(RingStringsActivity.class);
        mTestFileHandler = new SwissephFileHandlerImpl(mTestActivity.getApplicationContext());
    }

    @Test
    public void testShadowResourcesCanProduceCorrectResourceNames() {
        ShadowResources resources = Shadows.shadowOf(mTestActivity.getResources());
        String filename1 = resources.getResourceName(R.raw.seas_18);
        String filename2 = resources.getResourceName(R.raw.semo_18);
        String filename3 = resources.getResourceName(R.raw.sepl_18);

        assert (!filename1.isEmpty());
        assert (!filename2.isEmpty());
        assert (!filename3.isEmpty());
    }

    @Test
    public void testInitializingSwisseph() {
        mTestFileHandler.initEphemerisData();
    }
}
