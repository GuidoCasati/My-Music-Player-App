package com.example.android.mymusicplayer;

/**
 * Created by guido on 26/06/2017.
 */

public class Song {
    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    private static final int NO_AUDIO = -1;
    private String Track;
    private String Artist;
    private Integer ImageResourceID = NO_IMAGE_PROVIDED;
    private Integer AudioResID = NO_AUDIO;

    public Song(String track, String artist) {
        Track = track;
        Artist = artist;
    }

    public Song(String track, String artist, int imageResourceID, int audioResID) {
        Track = track;
        Artist = artist;
        ImageResourceID = imageResourceID;
        AudioResID = audioResID;
    }


    public String getTrack() {
        return Track;
    }

    public void setTrack(String track) {
        Track = track;
    }

    public String getArtist() {
        return Artist;
    }

    public void setArtist(String artist) {
        Artist = artist;
    }

    public Integer getImageResourceID() {
        return ImageResourceID;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return ImageResourceID != NO_IMAGE_PROVIDED;
    }

    public Integer getAudioResID() {
        return AudioResID;
    }
}
