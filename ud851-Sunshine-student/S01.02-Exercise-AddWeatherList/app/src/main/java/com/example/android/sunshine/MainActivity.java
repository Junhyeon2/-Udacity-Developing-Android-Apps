/*
 * Copyright (C) 2016 The Android Open Source Project
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
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // COMPLETE (1) Create a field to store the weather display TextView
    TextView mWeatherDataTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        // COMPLETE (2) Use findViewById to get a reference to the weather display TextView
        mWeatherDataTextView = (TextView) findViewById(R.id.tv_weather_data);
        // COMPLETE (3) Create an array of Strings that contain fake weather data
        String[] fakeWeatherData = {
                "2017-01-01(SUN) - 광역성 소나기 (2°C/8°C)",
                "2017-01-02(MON) - 구름 조금 (-4°C/9°C)",
                "2017-01-03(TUE) - 맑음 (-2°C/7°C)",
                "2017-01-04(WED) - 구름 조금 (-1°C/8°C)",
                "2017-01-05(THU) - 구름 조금 (-1°C/10°C)",
                "2017-01-06(FRI) - 맑음 (-1°C/11°C)",
                "2017-01-07(SAT) - 구름 조금 (2°C/10°C)",
        };
        // COMPLETE (4) Append each String from the fake weather data array to the TextView
        for (String weatherData : fakeWeatherData) {
            mWeatherDataTextView.append(weatherData + "\n\n\n");
        }
    }
}