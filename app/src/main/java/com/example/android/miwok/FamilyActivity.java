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

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> Words = new ArrayList<Word>();
        Words.add(new Word("father", "әpә",R.drawable.family_father));
        Words.add(new Word("mother", "әṭa",R.drawable.family_mother));
        Words.add(new Word("son", "angsi",R.drawable.family_son));
        Words.add(new Word("daughter", "tune",R.drawable.family_daughter));
        Words.add(new Word("older brother", "taachi",R.drawable.family_older_brother));
        Words.add(new Word("younger brother", "chalitti",R.drawable.family_younger_brother));
        Words.add(new Word("older sister", "teṭe",R.drawable.family_older_sister));
        Words.add(new Word("younger sister", "kolliti",R.drawable.family_younger_sister));
        Words.add(new Word("grandmother", "ama",R.drawable.family_grandmother));
        Words.add(new Word("grandfather", "paapa",R.drawable.family_grandfather));

        WordAdapter adapter = new WordAdapter(this, Words);

        ListView listView = (ListView) findViewById(R.id.word_list);

        listView.setAdapter(adapter);
    }
}
