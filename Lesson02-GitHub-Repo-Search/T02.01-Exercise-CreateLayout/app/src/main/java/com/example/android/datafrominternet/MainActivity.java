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
package com.example.android.datafrominternet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // DONE (26) Create an EditText variable called mSearchBoxEditText

    // DONE (27) Create a TextView variable called mUrlDisplayTextView
    // DONE (28) Create a TextView variable called mSearchResultsTextView
    EditText mSearchBoxEdittext;
    TextView mUrlDisplayTextView;
    TextView mSearchresultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // DONE (29) Use findViewById to get a reference to mSearchBoxEditText
        mSearchBoxEdittext = (EditText) findViewById(R.id.et_search_box);
        // DONE (30) Use findViewById to get a reference to mUrlDisplayTextView
        mUrlDisplayTextView = (TextView) findViewById(R.id.tv_url_display);
        // DONE (31) Use findViewById to get a reference to mSearchResultsTextView
        mSearchresultTextView = (TextView) findViewById(R.id.tv_github_search_results_json);
    }
}
