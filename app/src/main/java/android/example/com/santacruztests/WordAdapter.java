package android.example.com.santacruztests;

/**
 * Created by Rafael Said on 14/08/2017.
 */

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

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link WordAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Word} objects.
 */
public class WordAdapter extends ArrayAdapter<Word> {

    /**
     * Create a new {@link WordAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param words   is the list of {@link Word}s to be displayed.
     */
    public WordAdapter(Context context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        TextView adversariosView = (TextView) listItemView.findViewById(R.id.adversário_text_view);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        adversariosView.setText(currentWord.getAdversarioJogo());


        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView dataTextView = (TextView) listItemView.findViewById(R.id.data_text_view);

        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        dataTextView.setText(currentWord.getDataJogo());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView horaTextView = (TextView) listItemView.findViewById(R.id.hora_text_view);

        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        horaTextView.setText(currentWord.getHoraJogo());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView localTextView = (TextView) listItemView.findViewById(R.id.local_text_view);

        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        localTextView.setText(currentWord.getLocalJogo());

        return listItemView;
    }
}
