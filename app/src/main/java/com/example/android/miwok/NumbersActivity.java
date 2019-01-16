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
package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> Words = new ArrayList<Word>();
        Words.add(new Word("one", "lutti"));
        Words.add(new Word("two", "otiiko"));
        Words.add(new Word("three", "tolookosu"));
        Words.add(new Word("four", "oyyisa"));
        Words.add(new Word("five", "massokka"));
        Words.add(new Word("six", "temmokka"));
        Words.add(new Word("seven", "kenekaku"));
        Words.add(new Word("eight", "kawinta"));
        Words.add(new Word("nine", "wo'e"));
        Words.add(new Word("ten", "na'aacha"));

        WordAdapter adapter = new WordAdapter(this, Words);

        ListView listView = (ListView) findViewById(R.id.word_list);

        listView.setAdapter(adapter);

    }


}
