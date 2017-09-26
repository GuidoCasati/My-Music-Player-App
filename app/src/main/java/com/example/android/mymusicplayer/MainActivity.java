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
package com.example.android.mymusicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import musicplayerlayouts.Genres;
import musicplayerlayouts.albums;
import musicplayerlayouts.artists;
import musicplayerlayouts.nowPlaying;
import musicplayerlayouts.songs;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TextView albums = (TextView)findViewById(R.id.albums);
        albums.setOnClickListener(this);

        TextView songs = (TextView)findViewById(R.id.songs);
        songs.setOnClickListener(this);

        TextView artists = (TextView)findViewById(R.id.artists);
        artists.setOnClickListener(this);

        TextView genres = (TextView)findViewById(R.id.genres);
        genres.setOnClickListener(this);
        
        TextView nowPlaying = (TextView)findViewById(R.id.nowplaying);
        nowPlaying.setOnClickListener(this);

    }
    @Override
    public void onClick(View view){
        if (view.getId()==R.id.albums) OpenAlbumsList(view);
        if (view.getId()==R.id.songs) OpenSongsList(view);
        if (view.getId()==R.id.artists) openArtistsList(view);
        if (view.getId()==R.id.genres) OpenGenresList(view);
        if (view.getId()==R.id.nowplaying) OpenNowPlaying(view);
    }

    public void OpenSongsList(View view) {
        Intent i = new Intent(this, songs.class);
        startActivity(i);
    }

    public void OpenGenresList(View view) {
        Intent i = new Intent(this, Genres.class);
        startActivity(i);
    }

    public void openArtistsList(View view) {
        Intent i = new Intent(this, artists.class);
        startActivity(i);
    }

    public void OpenAlbumsList(View view) {
        Intent i = new Intent(this, albums.class);
        startActivity(i);
    }

    public void OpenNowPlaying(View view) {
        Intent i = new Intent(this, nowPlaying.class);
        startActivity(i);
    }
}


